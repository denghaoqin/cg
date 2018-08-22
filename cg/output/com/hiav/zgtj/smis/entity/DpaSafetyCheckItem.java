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
 * The persistent class for the dpa_safety_check_item database table.
 * 
 */
@Entity
@Table(name = "dpa_safety_check_item")
public class DpaSafetyCheckItem implements Serializable {

	private static final long serialVersionUID = 1L;
		@Id
		@GenericGenerator(name = "system-uuid", strategy = "uuid")
		@GeneratedValue(generator = "system-uuid")
		private String id;
	
		@Column(name = "SAFETY_CHECK_ID")
    	private String safetyCheckId;
    	
		@Column(name = "REVIEW_CONTENT")
    	private String reviewContent;
    	
		@Column(name = "INSPECTOR")
    	private String inspector;
    	
		@Column(name = "REQUIRED_START_CHECK_TIME")
    	private Date requiredStartCheckTime;
    	
		@Column(name = "REQUIRED_END_CHECK_TIME")
    	private Date requiredEndCheckTime;
    	
		@Column(name = "ACTUAL_CHECK_TIME")
    	private Date actualCheckTime;
    	
		@Column(name = "NEED_RESOURCE")
    	private String needResource;
    	
		@Column(name = "IS_APPROVED")
    	private String isApproved;
    	
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
	
		public void setSafetyCheckId(String safetyCheckId){
			this.safetyCheckId = safetyCheckId;
		}
		
		public String getSafetyCheckId(){
			return this.safetyCheckId;
		}
	
		public void setReviewContent(String reviewContent){
			this.reviewContent = reviewContent;
		}
		
		public String getReviewContent(){
			return this.reviewContent;
		}
	
		public void setInspector(String inspector){
			this.inspector = inspector;
		}
		
		public String getInspector(){
			return this.inspector;
		}
	
		public void setRequiredStartCheckTime(Date requiredStartCheckTime){
			this.requiredStartCheckTime = requiredStartCheckTime;
		}
		
		public Date getRequiredStartCheckTime(){
			return this.requiredStartCheckTime;
		}
	
		public void setRequiredEndCheckTime(Date requiredEndCheckTime){
			this.requiredEndCheckTime = requiredEndCheckTime;
		}
		
		public Date getRequiredEndCheckTime(){
			return this.requiredEndCheckTime;
		}
	
		public void setActualCheckTime(Date actualCheckTime){
			this.actualCheckTime = actualCheckTime;
		}
		
		public Date getActualCheckTime(){
			return this.actualCheckTime;
		}
	
		public void setNeedResource(String needResource){
			this.needResource = needResource;
		}
		
		public String getNeedResource(){
			return this.needResource;
		}
	
		public void setIsApproved(String isApproved){
			this.isApproved = isApproved;
		}
		
		public String getIsApproved(){
			return this.isApproved;
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