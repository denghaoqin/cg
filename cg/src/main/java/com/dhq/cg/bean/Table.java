package com.dhq.cg.bean;

import java.util.List;

public class Table {
	//����
	private String tableName;
	//��ͨ�ֶμ��ϣ�һ���ֶΰ����ˣ��ֶ�����SQL���ͣ�Java���ͣ�ע�ͣ��Ƿ�������־
	private List<TableField> commonFields;
	//�����ֶμ���
	private List<TableField> keyFields;
	//�ֶ����Ƿ��������͵ģ�����У���ô������ʵ����ʱ������Ҫ��java.util.Date����
	private boolean dateFlag = false;
	//�ֶ����Ƿ���numeric��decimal���͵ģ�����У���ô��������ʵ����ʱ����Ҫ��java.math.BigDecimal����
	private boolean mathFlag = false;
	//�ֶ����Ƿ���Timestamp�͵ģ�����У���ô������ʵ����ʱ������Ҫ��java.sql.Timestamp����
	private boolean timestampFlag = false;
	//����ʵ���࣬mapper�ӿڵȵ�ʱ�Ļ���
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
