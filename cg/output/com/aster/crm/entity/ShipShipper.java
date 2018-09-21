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
 * The persistent class for the ship_shipper database table.
 * 
 */
@Entity
@Table(name = "ship_shipper")
public class ShipShipper implements Serializable {

	private static final long serialVersionUID = 1L;
		@Id
		@GenericGenerator(name = "system-uuid", strategy = "uuid")
		@GeneratedValue(generator = "system-uuid")
		private String id;
	
		@Column(name = "NAME")
    	private String name;
    	
		@Column(name = "CODE")
    	private String code;
    	
		@Column(name = "IS_COMMON")
    	private Boolean isCommon;
    	
		@Column(name = "SUPPORT_TRACK_QUERY")
    	private Boolean supportTrackQuery;
    	
		@Column(name = "SUPPORT_ELECTRONIC_SURFACE")
    	private Boolean supportElectronicSurface;
    	
		@Column(name = "SUPPORT_RESERVATIONS")
    	private Boolean supportReservations;
    	
		@Column(name = "ENABLED")
    	private Boolean enabled;
    	
		@Column(name = "DELETED")
    	private Boolean deleted;
    	
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
	
		public void setName(String name){
			this.name = name;
		}
		
		public String getName(){
			return this.name;
		}
	
		public void setCode(String code){
			this.code = code;
		}
		
		public String getCode(){
			return this.code;
		}
	
		public void setIsCommon(Boolean isCommon){
			this.isCommon = isCommon;
		}
		
		public Boolean getIsCommon(){
			return this.isCommon;
		}
	
		public void setSupportTrackQuery(Boolean supportTrackQuery){
			this.supportTrackQuery = supportTrackQuery;
		}
		
		public Boolean getSupportTrackQuery(){
			return this.supportTrackQuery;
		}
	
		public void setSupportElectronicSurface(Boolean supportElectronicSurface){
			this.supportElectronicSurface = supportElectronicSurface;
		}
		
		public Boolean getSupportElectronicSurface(){
			return this.supportElectronicSurface;
		}
	
		public void setSupportReservations(Boolean supportReservations){
			this.supportReservations = supportReservations;
		}
		
		public Boolean getSupportReservations(){
			return this.supportReservations;
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