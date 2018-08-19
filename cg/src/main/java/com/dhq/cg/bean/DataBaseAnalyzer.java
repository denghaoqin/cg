package com.dhq.cg.bean;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataBaseAnalyzer {

	/**
	 * @return ����ĳ�����ݿ������еı�ṹ
	 * @throws Exception 
	 */
	public static List<Table> getAllTables(Connection connection ){
		List<Table> tables = null;
		if(connection != null){
			PreparedStatement statement = null;
			ResultSet connectionRS = null , queryRS = null;
			tables = new ArrayList<Table>();
			try {
				DatabaseMetaData metaData = connection.getMetaData();
				connectionRS = metaData.getTables(null, null, null, new String[]{"TABLE"});
				while(connectionRS.next()){
					String tableName = connectionRS.getString(3);
					String querySQL = "show full columns from " + tableName;
					statement = connection.prepareStatement(querySQL);
					queryRS = statement.executeQuery();
					
					Table Table = new Table();
					List<TableField> keyFields = new ArrayList<TableField>();
					List<TableField> commonFields = new ArrayList<TableField>();
					
					//ͳ����������ͨ�ֶ�
					while(queryRS.next()){
						String fieldName = queryRS.getString("Field");
						//ע�⣺�õ���Type������varchar(n),Ҳ������datetime
						String sqlType = queryRS.getString("Type");						
						String key = queryRS.getString("Key");
						String comment = queryRS.getString("Comment");
						String javaType = getJavaTypeFromSQLType(sqlType);
						
						//�����ֶ������Ϣ
						TableField field = new TableField();
						field.setFieldName(fieldName);
						field.setSqlType(sqlType);
						field.setJavaType(javaType);
						field.setFieldComment(comment);						
						if(key != null && key.equalsIgnoreCase("pri")){
							field.setPrimary(true);
							keyFields.add(field);
						}else{
							field.setPrimary(false);
							commonFields.add(field);
						}
						try {
							//�Ƿ���Ҫ��java.math.BigDecimal��
							if(javaType.equalsIgnoreCase("bigdecimal"))
								Table.setMathFlag(true);
							if(javaType.equalsIgnoreCase("date")||javaType.equalsIgnoreCase("time"))
								Table.setDateFlag(true);
							if(javaType.equalsIgnoreCase("datetime")||javaType.equalsIgnoreCase("timestamp"))
								Table.setTimestampFlag(true);
						} catch (Exception e) {
							e.printStackTrace();
							System.out.println(field);
						}
					
					}
					
					//���ñ���ص���Ϣ
					Table.setTableName(tableName);
					Table.setKeyFields(keyFields);
					Table.setCommonFields(commonFields);
					
					tables.add(Table);
				}
				return tables;
			} catch (SQLException e) {
				e.printStackTrace();
				return tables;
			} finally{
				try {
					if(queryRS != null)
						queryRS.close();
					if(connectionRS != null)
						connectionRS.close();
					if(statement != null)
						statement.close();
					if(connection != null)
						connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}else{
			return tables;
		}
	}
	
	/**
	 * 
	 * @param tableName
	 * @return ���ر�����Ϊ tableName �ı�Ľṹ
	 * @throws Exception 
	 */
	public static Table getTable(String tableName,Connection connection){
		String sql = "show full columns from " + tableName;
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		Table Table = null;
		if(connection != null){
			try {
				preparedStatement = connection.prepareStatement(sql);
				rs = preparedStatement.executeQuery();
				
				Table = new Table();
				List<TableField> commonFieldList = new ArrayList<TableField>();
				List<TableField> keyFieldList = new ArrayList<TableField>();
				
				//��ȡ��Ľṹ
				while(rs.next()){
					String fieldName = rs.getString("Field");
					//ע�⣺�õ���Type������varchar(n),Ҳ������datetime
					String sqlType = rs.getString("Type");						
					String key = rs.getString("Key");
					String commont = rs.getString("Comment");
					String javaType = getJavaTypeFromSQLType(sqlType);
					
					//�����ֶ������Ϣ
					TableField field = new TableField();
					field.setFieldName(fieldName);
					field.setSqlType(sqlType);
					field.setJavaType(javaType);
					field.setFieldComment(commont);						
					if(key != null && key.equalsIgnoreCase("pri")){
						field.setPrimary(true);
						keyFieldList.add(field);
					}else{
						field.setPrimary(false);
						commonFieldList.add(field);
					}
					//�Ƿ���Ҫ��java.math.BigDecimal��
					if(javaType.equalsIgnoreCase("bigdecimal"))
						Table.setMathFlag(true);
					if(javaType.equalsIgnoreCase("date")||javaType.equalsIgnoreCase("time"))
						Table.setDateFlag(true);
					if(javaType.equalsIgnoreCase("datetime")||javaType.equalsIgnoreCase("timestamp"))
						Table.setTimestampFlag(true);
				}
				Table.setTableName(tableName);
				Table.setCommonFields(commonFieldList);
				Table.setKeyFields(keyFieldList);
								
				return Table;
			} catch (SQLException e) {
				e.printStackTrace();
				return Table;
			} finally{
				try {
					if(rs != null)
						rs.close();
					if(preparedStatement != null)
						preparedStatement.close();
					if(connection != null)
						connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}		
		}else{
			return Table;
		}
		
	}

	
	/**
	 * 
	 * @param sqlType
	 * @return SQL���͵õ�java����
	 */
	private static String getJavaTypeFromSQLType(String sqlType){
		String javaType = null;
		int index = sqlType.indexOf("(");
		if(index != -1)
			sqlType = sqlType.substring(0, index);
		
		if(sqlType.equalsIgnoreCase("VARCHAR")||sqlType.equalsIgnoreCase("CHAR")||sqlType.contains("TEXT"))
			javaType = "String";
		else if(sqlType.equalsIgnoreCase("NUMERIC")||sqlType.equalsIgnoreCase("DECIMAL"))
			javaType = "BigDecimal";
		else if(sqlType.equalsIgnoreCase("BIT"))
			javaType = "boolean";
		else if(sqlType.equalsIgnoreCase("TINYINT"))
			javaType = "byte";
		else if(sqlType.equalsIgnoreCase("SAMLLINT"))
			javaType = "short";
		else if(sqlType.equalsIgnoreCase("INTEGER")||sqlType.equalsIgnoreCase("int")||sqlType.equalsIgnoreCase("mediumint")||sqlType.equalsIgnoreCase("smallint"))
			javaType = "int";
		else if(sqlType.equalsIgnoreCase("BIGINT"))
			javaType = "long";
		else if(sqlType.equalsIgnoreCase("REAL"))
			javaType = "float";
		else if(sqlType.equalsIgnoreCase("FLOAT")||sqlType.equalsIgnoreCase("double"))
			javaType = "double";
		else if(sqlType.equalsIgnoreCase("binary")||sqlType.equalsIgnoreCase("varbinary")||sqlType.equalsIgnoreCase("longvarbinary"))
			javaType = "byte[]";
		else if(sqlType.equalsIgnoreCase("date"))
			javaType = "Date";
		else if(sqlType.equalsIgnoreCase("time"))
			javaType = "Time";
		else if(sqlType.equalsIgnoreCase("datetime")||sqlType.equalsIgnoreCase("timestamp"))
			javaType = "Timestamp";
		else if(sqlType.equalsIgnoreCase("longblob"))
			javaType = "byte[]";
		return javaType;
	}

	
	public static List<Table> getAllTables(Connection connection ,List<String> tables){
		List<Table> allTables = getAllTables(connection);
		List<Table> list;
		if(tables==null||tables.size()==0){
			list = allTables;
		}else{
			list = new ArrayList<Table>();
			for(String table:tables ){
				for(Table t:allTables){
					if(t.getTableName().toLowerCase().equals(table.toLowerCase())){
						list.add(t);
						continue;
					}
				}
			}
		}
		return list;
	}
}
