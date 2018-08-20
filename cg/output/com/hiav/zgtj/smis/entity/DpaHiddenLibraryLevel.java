package com.hiav.zgtj.smis.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Date;

import org.hibernate.annotations.GenericGenerator;

/**
 * The persistent class for the dpa_hidden_library_level database table.
 * 
 */
@Entity
@Table(name = "dpa_hidden_library_level")
public class DpaHiddenLibraryLevel implements Serializable {

	private static final long serialVersionUID = 1L;
		@Id
		@GenericGenerator(name = "system-uuid", strategy = "uuid")
		@GeneratedValue(generator = "system-uuid")
		private String id;
	
		@Column(name = "PARENT_ID")
    	private String parentId;
    	
		@Column(name = "NAME")
    	private String name;
    	
		@Column(name = "ICON")
    	private String icon;
    	
		@Column(name = "ORDER_NO")
    	private Integer orderNo;
    	
		@Column(name = "REMARK")
    	private String remark;
    	
		@Column(name = "CREATED_BY")
    	private String createdBy;
    	
		@Column(name = "CREATION_DATE")
    	private Date creationDate;
    	
		@Column(name = "LAST_UPDATE_BY")
    	private String lastUpdateBy;
    	
		@Column(name = "LAST_UPDATE_DATE")
    	private Date lastUpdateDate;
    	
	
	
		public void setId(String id){
			this.id = id;
		}
		
		public String getId(){
			return this.id;
		}
	
		public void setParentId(String parentId){
			this.parentId = parentId;
		}
		
		public String getParentId(){
			return this.parentId;
		}
	
		public void setName(String name){
			this.name = name;
		}
		
		public String getName(){
			return this.name;
		}
	
		public void setIcon(String icon){
			this.icon = icon;
		}
		
		public String getIcon(){
			return this.icon;
		}
	
		public void setOrderNo(Integer orderNo){
			this.orderNo = orderNo;
		}
		
		public Integer getOrderNo(){
			return this.orderNo;
		}
	
		public void setRemark(String remark){
			this.remark = remark;
		}
		
		public String getRemark(){
			return this.remark;
		}
	
		public void setCreatedBy(String createdBy){
			this.createdBy = createdBy;
		}
		
		public String getCreatedBy(){
			return this.createdBy;
		}
	
		public void setCreationDate(Date creationDate){
			this.creationDate = creationDate;
		}
		
		public Date getCreationDate(){
			return this.creationDate;
		}
	
		public void setLastUpdateBy(String lastUpdateBy){
			this.lastUpdateBy = lastUpdateBy;
		}
		
		public String getLastUpdateBy(){
			return this.lastUpdateBy;
		}
	
		public void setLastUpdateDate(Date lastUpdateDate){
			this.lastUpdateDate = lastUpdateDate;
		}
		
		public Date getLastUpdateDate(){
			return this.lastUpdateDate;
		}
	
	
}