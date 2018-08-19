package com.dhq.cg.bean;

public class TableField {
	
	private String fieldName;
	private String sqlType;
	private String javaType;
	private String fieldComment;
	private boolean isPrimary;
	
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public String getSqlType() {
		return sqlType;
	}
	public void setSqlType(String sqlType) {
		this.sqlType = sqlType;
	}
	public String getJavaType() {
		return javaType;
	}
	public void setJavaType(String javaType) {
		this.javaType = javaType;
	}
	public String getFieldComment() {
		return fieldComment;
	}
	public void setFieldComment(String fieldComment) {
		this.fieldComment = fieldComment;
	}
	public boolean isPrimary() {
		return isPrimary;
	}
	public void setPrimary(boolean isPrimary) {
		this.isPrimary = isPrimary;
	}
	@Override
	public String toString() {
		return "TableField [fieldName=" + fieldName + ", sqlType=" + sqlType
				+ ", javaType=" + javaType + ", fieldComment=" + fieldComment
				+ ", isPrimary=" + isPrimary + "]";
	}
	
	
}
