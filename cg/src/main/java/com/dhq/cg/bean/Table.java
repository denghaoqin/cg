package com.dhq.cg.bean;

import java.util.List;

public class Table {
	 //表名
	private String tableName;
    //普通字段集合，一个字段包括了：字段名，SQL类型，Java类型，注释，是否主键标志
	private List<TableField> commonFields;
    //主键字段集合
	private List<TableField> keyFields;
    //字段中是否有日期型的，如果有，那么在生成实体类时，就需要导java.util.Date包了
	private boolean dateFlag = false;
    //字段中是否有numeric和decimal类型的，如果有，那么，在生成实体类时就需要导java.math.BigDecimal包了
	private boolean mathFlag = false;
    //字段中是否有timestamp类型的，如果有，那么，在生成实体类时就需要导Timestamp包了
	private boolean timestampFlag = false;
    //生成实体类，mapper接口等等时的基名
	private String packageNameBase;
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public List<TableField> getCommonFields() {
		return commonFields;
	}
	public void setCommonFields(List<TableField> commonFields) {
		this.commonFields = commonFields;
	}
	public List<TableField> getKeyFields() {
		return keyFields;
	}
	public void setKeyFields(List<TableField> keyFields) {
		this.keyFields = keyFields;
	}
	public boolean getDateFlag() {
		return dateFlag;
	}
	public void setDateFlag(boolean dateFlag) {
		this.dateFlag = dateFlag;
	}
	public boolean getMathFlag() {
		return mathFlag;
	}
	public void setMathFlag(boolean mathFlag) {
		this.mathFlag = mathFlag;
	}
	public String getPackageNameBase() {
		return packageNameBase;
	}
	public void setPackageNameBase(String packageNameBase) {
		this.packageNameBase = packageNameBase;
	}
	public boolean getTimestampFlag() {
		return timestampFlag;
	}
	public void setTimestampFlag(boolean timestampFlag) {
		this.timestampFlag = timestampFlag;
	}
	
}
