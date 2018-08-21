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
 * The persistent class for the dpa_hidden_danger database table.
 * 
 */
@Entity
@Table(name = "dpa_hidden_danger")
public class DpaHiddenDanger implements Serializable {

	private static final long serialVersionUID = 1L;
		@Id
		@GenericGenerator(name = "system-uuid", strategy = "uuid")
		@GeneratedValue(generator = "system-uuid")
		private String id;
	
		@Column(name = "PROJECT_ID")
    	private String projectId;
    	
		@Column(name = "SOURCE_TYPE")
    	private String sourceType;
    	
		@Column(name = "SOURCE_ID")
    	private String sourceId;
    	
		@Column(name = "SERIAL_NUMBER")
    	private String serialNumber;
    	
		@Column(name = "CATEGORY")
    	private String category;
    	
		@Column(name = "REMARK")
    	private String remark;
    	
		@Column(name = "RECTIFICATION_MEASURES")
    	private String rectificationMeasures;
    	
		@Column(name = "RECTIFICATION_START_TIME")
    	private Date rectificationStartTime;
    	
		@Column(name = "RECTIFICATION_END_TIME")
    	private Date rectificationEndTime;
    	
		@Column(name = "RECTIFICATION_SUPERVISOR")
    	private String rectificationSupervisor;
    	
		@Column(name = "ACCEPTANCE_SUPERVISOR")
    	private String acceptanceSupervisor;
    	
		@Column(name = "STATUS")
    	private String status;
    	
		@Column(name = "WF_STATUS")
    	private String wfStatus;
    	
		@Column(name = "WF_OPINION")
    	private String wfOpinion;
    	
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
	
		public void setProjectId(String projectId){
			this.projectId = projectId;
		}
		
		public String getProjectId(){
			return this.projectId;
		}
	
		public void setSourceType(String sourceType){
			this.sourceType = sourceType;
		}
		
		public String getSourceType(){
			return this.sourceType;
		}
	
		public void setSourceId(String sourceId){
			this.sourceId = sourceId;
		}
		
		public String getSourceId(){
			return this.sourceId;
		}
	
		public void setSerialNumber(String serialNumber){
			this.serialNumber = serialNumber;
		}
		
		public String getSerialNumber(){
			return this.serialNumber;
		}
	
		public void setCategory(String category){
			this.category = category;
		}
		
		public String getCategory(){
			return this.category;
		}
	
		public void setRemark(String remark){
			this.remark = remark;
		}
		
		public String getRemark(){
			return this.remark;
		}
	
		public void setRectificationMeasures(String rectificationMeasures){
			this.rectificationMeasures = rectificationMeasures;
		}
		
		public String getRectificationMeasures(){
			return this.rectificationMeasures;
		}
	
		public void setRectificationStartTime(Date rectificationStartTime){
			this.rectificationStartTime = rectificationStartTime;
		}
		
		public Date getRectificationStartTime(){
			return this.rectificationStartTime;
		}
	
		public void setRectificationEndTime(Date rectificationEndTime){
			this.rectificationEndTime = rectificationEndTime;
		}
		
		public Date getRectificationEndTime(){
			return this.rectificationEndTime;
		}
	
		public void setRectificationSupervisor(String rectificationSupervisor){
			this.rectificationSupervisor = rectificationSupervisor;
		}
		
		public String getRectificationSupervisor(){
			return this.rectificationSupervisor;
		}
	
		public void setAcceptanceSupervisor(String acceptanceSupervisor){
			this.acceptanceSupervisor = acceptanceSupervisor;
		}
		
		public String getAcceptanceSupervisor(){
			return this.acceptanceSupervisor;
		}
	
		public void setStatus(String status){
			this.status = status;
		}
		
		public String getStatus(){
			return this.status;
		}
	
		public void setWfStatus(String wfStatus){
			this.wfStatus = wfStatus;
		}
		
		public String getWfStatus(){
			return this.wfStatus;
		}
	
		public void setWfOpinion(String wfOpinion){
			this.wfOpinion = wfOpinion;
		}
		
		public String getWfOpinion(){
			return this.wfOpinion;
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