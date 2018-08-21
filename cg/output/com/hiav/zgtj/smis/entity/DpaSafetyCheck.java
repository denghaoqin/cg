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
	
		@Column(name = "DAILY_PLAN_ID")
    	private String dailyPlanId;
    	
		@Column(name = "INSPECTION_PURPOSE")
    	private String inspectionPurpose;
    	
		@Column(name = "INSPECTION_REQUIRED")
    	private String inspectionRequired;
    	
		@Column(name = "WORKING_CONTENTS")
    	private String workingContents;
    	
		@Column(name = "STATUS")
    	private String status;
    	
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
	
		public void setDailyPlanId(String dailyPlanId){
			this.dailyPlanId = dailyPlanId;
		}
		
		public String getDailyPlanId(){
			return this.dailyPlanId;
		}
	
		public void setInspectionPurpose(String inspectionPurpose){
			this.inspectionPurpose = inspectionPurpose;
		}
		
		public String getInspectionPurpose(){
			return this.inspectionPurpose;
		}
	
		public void setInspectionRequired(String inspectionRequired){
			this.inspectionRequired = inspectionRequired;
		}
		
		public String getInspectionRequired(){
			return this.inspectionRequired;
		}
	
		public void setWorkingContents(String workingContents){
			this.workingContents = workingContents;
		}
		
		public String getWorkingContents(){
			return this.workingContents;
		}
	
		public void setStatus(String status){
			this.status = status;
		}
		
		public String getStatus(){
			return this.status;
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