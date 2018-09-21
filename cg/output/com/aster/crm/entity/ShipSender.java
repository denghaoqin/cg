package com.aster.crm.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Date;

import org.hibernate.annotations.GenericGenerator;

/**
 * The persistent class for the ship_sender database table.
 * 
 */
@Entity
@Table(name = "ship_sender")
public class ShipSender implements Serializable {

	private static final long serialVersionUID = 1L;
		@Id
		@GenericGenerator(name = "system-uuid", strategy = "uuid")
		@GeneratedValue(generator = "system-uuid")
		private String id;
	
		@Column(name = "COMPANY")
    	private String company;
    	
		@Column(name = "NAME")
    	private String name;
    	
		@Column(name = "TEL")
    	private String tel;
    	
		@Column(name = "MOBILE")
    	private String mobile;
    	
		@Column(name = "POST_CODE")
    	private String postCode;
    	
		@Column(name = "PROVINCE_NAME")
    	private String provinceName;
    	
		@Column(name = "CITY_NAME")
    	private String cityName;
    	
		@Column(name = "EXP_AREA_NAME")
    	private String expAreaName;
    	
		@Column(name = "ADDRESS")
    	private String address;
    	
		@Column(name = "REMARK")
    	private String remark;
    	
		@Column(name = "ENABLED")
    	private Boolean enabled;
    	
		@Column(name = "DELETED")
    	private Boolean deleted;
    	
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
	
		public void setCompany(String company){
			this.company = company;
		}
		
		public String getCompany(){
			return this.company;
		}
	
		public void setName(String name){
			this.name = name;
		}
		
		public String getName(){
			return this.name;
		}
	
		public void setTel(String tel){
			this.tel = tel;
		}
		
		public String getTel(){
			return this.tel;
		}
	
		public void setMobile(String mobile){
			this.mobile = mobile;
		}
		
		public String getMobile(){
			return this.mobile;
		}
	
		public void setPostCode(String postCode){
			this.postCode = postCode;
		}
		
		public String getPostCode(){
			return this.postCode;
		}
	
		public void setProvinceName(String provinceName){
			this.provinceName = provinceName;
		}
		
		public String getProvinceName(){
			return this.provinceName;
		}
	
		public void setCityName(String cityName){
			this.cityName = cityName;
		}
		
		public String getCityName(){
			return this.cityName;
		}
	
		public void setExpAreaName(String expAreaName){
			this.expAreaName = expAreaName;
		}
		
		public String getExpAreaName(){
			return this.expAreaName;
		}
	
		public void setAddress(String address){
			this.address = address;
		}
		
		public String getAddress(){
			return this.address;
		}
	
		public void setRemark(String remark){
			this.remark = remark;
		}
		
		public String getRemark(){
			return this.remark;
		}
	
		public void setEnabled(Boolean enabled){
			this.enabled = enabled;
		}
		
		public Boolean getEnabled(){
			return this.enabled;
		}
	
		public void setDeleted(Boolean deleted){
			this.deleted = deleted;
		}
		
		public Boolean getDeleted(){
			return this.deleted;
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