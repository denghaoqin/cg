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
 * The persistent class for the dpa_field_safety database table.
 * 
 */
@Entity
@Table(name = "dpa_field_safety")
public class DpaFieldSafety implements Serializable {

	private static final long serialVersionUID = 1L;
		@Id
		@GenericGenerator(name = "system-uuid", strategy = "uuid")
		@GeneratedValue(generator = "system-uuid")
		private String id;
	
		@Column(name = "SOURCE")
    	private String source;
    	
		@Column(name = "SOURCE_ID")
    	private String sourceId;
    	
		@Column(name = "PROJECT_ID")
    	private String projectId;
    	
		@Column(name = "MAJOR_NAME")
    	private String majorName;
    	
		@Column(name = "WORKING_CONTENTS")
    	private String workingContents;
    	
		@Column(name = "WORKERS")
    	private Integer workers;
    	
		@Column(name = "WORK_START_TIME")
    	private Date workStartTime;
    	
		@Column(name = "WORK_END_TIME")
    	private Date workEndTime;
    	
		@Column(name = "WORKING_LOCATION")
    	private String workingLocation;
    	
		@Column(name = "STATUS")
    	private String status;
    	
		@Column(name = "WF_STATUS")
    	private String wfStatus;
    	
		@Column(name = "WF_OPINION")
    	private String wfOpinion;
    	
		@Column(name = "REMARK")
    	private String remark;
    	
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
	
		public void setSource(String source){
			this.source = source;
		}
		
		public String getSource(){
			return this.source;
		}
	
		public void setSourceId(String sourceId){
			this.sourceId = sourceId;
		}
		
		public String getSourceId(){
			return this.sourceId;
		}
	
		public void setProjectId(String projectId){
			this.projectId = projectId;
		}
		
		public String getProjectId(){
			return this.projectId;
		}
	
		public void setMajorName(String majorName){
			this.majorName = majorName;
		}
		
		public String getMajorName(){
			return this.majorName;
		}
	
		public void setWorkingContents(String workingContents){
			this.workingContents = workingContents;
		}
		
		public String getWorkingContents(){
			return this.workingContents;
		}
	
		public void setWorkers(Integer workers){
			this.workers = workers;
		}
		
		public Integer getWorkers(){
			return this.workers;
		}
	
		public void setWorkStartTime(Date workStartTime){
			this.workStartTime = workStartTime;
		}
		
		public Date getWorkStartTime(){
			return this.workStartTime;
		}
	
		public void setWorkEndTime(Date workEndTime){
			this.workEndTime = workEndTime;
		}
		
		public Date getWorkEndTime(){
			return this.workEndTime;
		}
	
		public void setWorkingLocation(String workingLocation){
			this.workingLocation = workingLocation;
		}
		
		public String getWorkingLocation(){
			return this.workingLocation;
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
	
		public void setRemark(String remark){
			this.remark = remark;
		}
		
		public String getRemark(){
			return this.remark;
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