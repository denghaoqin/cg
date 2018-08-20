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
 * The persistent class for the dpa_safety_check database table.
 * 
 */
@Entity
@Table(name = "dpa_safety_check")
public class DpaSafetyCheck implements Serializable {

	private static final long serialVersionUID = 1L;
		@Id
		@GenericGenerator(name = "system-uuid", strategy = "uuid")
		@GeneratedValue(generator = "system-uuid")
		private String id;
	
		@Column(name = "ENGINEERING_ID")
    	private String engineeringId;
    	
		@Column(name = "PROJECT_ID")
    	private String projectId;
    	
		@Column(name = "MAJOR_NAME")
    	private String majorName;
    	
		@Column(name = "WORKING_LOCATION")
    	private String workingLocation;
    	
		@Column(name = "WORKING_CONTENTS")
    	private String workingContents;
    	
		@Column(name = "CHECK_TIME")
    	private Date checkTime;
    	
		@Column(name = "INSPECTOR")
    	private String inspector;
    	
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
	
		public void setEngineeringId(String engineeringId){
			this.engineeringId = engineeringId;
		}
		
		public String getEngineeringId(){
			return this.engineeringId;
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
	
		public void setWorkingLocation(String workingLocation){
			this.workingLocation = workingLocation;
		}
		
		public String getWorkingLocation(){
			return this.workingLocation;
		}
	
		public void setWorkingContents(String workingContents){
			this.workingContents = workingContents;
		}
		
		public String getWorkingContents(){
			return this.workingContents;
		}
	
		public void setCheckTime(Date checkTime){
			this.checkTime = checkTime;
		}
		
		public Date getCheckTime(){
			return this.checkTime;
		}
	
		public void setInspector(String inspector){
			this.inspector = inspector;
		}
		
		public String getInspector(){
			return this.inspector;
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