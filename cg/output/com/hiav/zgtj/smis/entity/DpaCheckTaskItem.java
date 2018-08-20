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
 * The persistent class for the dpa_check_task_item database table.
 * 
 */
@Entity
@Table(name = "dpa_check_task_item")
public class DpaCheckTaskItem implements Serializable {

	private static final long serialVersionUID = 1L;
		@Id
		@GenericGenerator(name = "system-uuid", strategy = "uuid")
		@GeneratedValue(generator = "system-uuid")
		private String id;
	
		@Column(name = "TASK_ID")
    	private String taskId;
    	
		@Column(name = "CHECK_CONTENT")
    	private String checkContent;
    	
		@Column(name = "MUST_UPLOAD_ATTACHMENT")
    	private Boolean mustUploadAttachment;
    	
		@Column(name = "REQUIRE_START_TIME")
    	private Date requireStartTime;
    	
		@Column(name = "REQUIRE_END_TIME")
    	private Date requireEndTime;
    	
		@Column(name = "ACTUAL_START_TIME")
    	private Date actualStartTime;
    	
		@Column(name = "ACTUAL_END_TIME")
    	private Date actualEndTime;
    	
		@Column(name = "CHECK_RESULTS")
    	private Boolean checkResults;
    	
		@Column(name = "REMARK")
    	private String remark;
    	
	
	
		public void setId(String id){
			this.id = id;
		}
		
		public String getId(){
			return this.id;
		}
	
		public void setTaskId(String taskId){
			this.taskId = taskId;
		}
		
		public String getTaskId(){
			return this.taskId;
		}
	
		public void setCheckContent(String checkContent){
			this.checkContent = checkContent;
		}
		
		public String getCheckContent(){
			return this.checkContent;
		}
	
		public void setMustUploadAttachment(Boolean mustUploadAttachment){
			this.mustUploadAttachment = mustUploadAttachment;
		}
		
		public Boolean getMustUploadAttachment(){
			return this.mustUploadAttachment;
		}
	
		public void setRequireStartTime(Date requireStartTime){
			this.requireStartTime = requireStartTime;
		}
		
		public Date getRequireStartTime(){
			return this.requireStartTime;
		}
	
		public void setRequireEndTime(Date requireEndTime){
			this.requireEndTime = requireEndTime;
		}
		
		public Date getRequireEndTime(){
			return this.requireEndTime;
		}
	
		public void setActualStartTime(Date actualStartTime){
			this.actualStartTime = actualStartTime;
		}
		
		public Date getActualStartTime(){
			return this.actualStartTime;
		}
	
		public void setActualEndTime(Date actualEndTime){
			this.actualEndTime = actualEndTime;
		}
		
		public Date getActualEndTime(){
			return this.actualEndTime;
		}
	
		public void setCheckResults(Boolean checkResults){
			this.checkResults = checkResults;
		}
		
		public Boolean getCheckResults(){
			return this.checkResults;
		}
	
		public void setRemark(String remark){
			this.remark = remark;
		}
		
		public String getRemark(){
			return this.remark;
		}
	
	
}