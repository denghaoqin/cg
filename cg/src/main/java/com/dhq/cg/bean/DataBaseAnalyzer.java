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
     * @return 返回某个数据库下所有的表结构
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
					
					 //统计主键和普通字段
					while(queryRS.next()){
						String fieldName = queryRS.getString("Field");
						 //注意：得到的Type可能是varchar(n),也可能是datetime
						String sqlType = queryRS.getString("Type");						
						String key = queryRS.getString("Key");
						String comment = queryRS.getString("Comment");
						String javaType = getJavaTypeFromSQLType(sqlType);
						
						//设置字段相关信息
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
							 //是否需要导java.math.BigDecimal包
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
					
				    //设置表相关的信息
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
    * @param sqlType
    * @return SQL类型得到java类型
    */
	private static String getJavaTypeFromSQLType(String sqlType){
		String javaType = null;
		String precision = null;
		int index = sqlType.indexOf("(");
		if(index != -1){
			int indexL = sqlType.indexOf(")");
			if(indexL!=-1){
				precision = sqlType.substring(index+1, indexL);
			}
			sqlType = sqlType.substring(0, index);
		}
		
		if(sqlType.equalsIgnoreCase("VARCHAR")||sqlType.equalsIgnoreCase("CHAR")||sqlType.contains("TEXT"))
			javaType = "String";
		else if(sqlType.equalsIgnoreCase("NUMERIC")||sqlType.equalsIgnoreCase("DECIMAL"))
			javaType = "BigDecimal";
		else if(sqlType.equalsIgnoreCase("BIT"))
			javaType = "Boolean";
		else if(sqlType.equalsIgnoreCase("TINYINT")){
			if(Integer.parseInt(precision)==1){
				javaType = "Boolean";
			}else{
				javaType = "Byte";
			}
		}
		else if(sqlType.equalsIgnoreCase("SAMLLINT"))
			javaType = "Integer";
		else if(sqlType.equalsIgnoreCase("INTEGER")||sqlType.equalsIgnoreCase("int")||sqlType.equalsIgnoreCase("mediumint")||sqlType.equalsIgnoreCase("smallint"))
			javaType = "Integer";
		else if(sqlType.equalsIgnoreCase("BIGINT"))
			javaType = "Long";
		else if(sqlType.equalsIgnoreCase("REAL"))
			javaType = "Float";
		else if(sqlType.equalsIgnoreCase("FLOAT")||sqlType.equalsIgnoreCase("double"))
			javaType = "Double";
		else if(sqlType.equalsIgnoreCase("binary")||sqlType.equalsIgnoreCase("varbinary")||sqlType.equalsIgnoreCase("longvarbinary"))
			javaType = "byte[]";
		else if(sqlType.equalsIgnoreCase("datetime")||sqlType.equalsIgnoreCase("date"))
			javaType = "Date";
		else if(sqlType.equalsIgnoreCase("time"))
			javaType = "Time";
		else if(sqlType.equalsIgnoreCase("timestamp"))
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
	
	
	public static List<Table> getAllTables(Connection connection ,String regex){
		List<Table> allTables = getAllTables(connection);
		List<Table> list;
		if(regex==null||regex.isEmpty()){
			list = allTables;
		}else{
			list = new ArrayList<Table>();
			for(Table t:allTables){
				if(t.getTableName().matches(regex)){
					list.add(t);
					continue;
				}
			}
		}
		return list;
	}
	
}
