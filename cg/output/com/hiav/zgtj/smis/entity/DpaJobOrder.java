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
 * The persistent class for the dpa_job_order database table.
 * 
 */
@Entity
@Table(name = "dpa_job_order")
public class DpaJobOrder implements Serializable {

	private static final long serialVersionUID = 1L;
		@Id
		@GenericGenerator(name = "system-uuid", strategy = "uuid")
		@GeneratedValue(generator = "system-uuid")
		private String id;
	
		@Column(name = "PLAN_ID")
    	private String planId;
    	
		@Column(name = "SECURITY_CAPTAIN_ID")
    	private String securityCaptainId;
    	
		@Column(name = "VEHICLE")
    	private String vehicle;
    	
		@Column(name = "JOB_SITE")
    	private String jobSite;
    	
		@Column(name = "JOB_NAME")
    	private String jobName;
    	
		@Column(name = "JOB_START_TIME")
    	private Date jobStartTime;
    	
		@Column(name = "JOB_END_TIME")
    	private Date jobEndTime;
    	
		@Column(name = "WORK_GROUP_LEADER")
    	private String workGroupLeader;
    	
		@Column(name = "WORK_GROUP_MEMBER")
    	private String workGroupMember;
    	
		@Column(name = "JOB_SUPPORT")
    	private String jobSupport;
    	
		@Column(name = "JOB_CONTENT")
    	private String jobContent;
    	
		@Column(name = "JOB_COMPLETION_INFO")
    	private String jobCompletionInfo;
    	
		@Column(name = "QUALITY_REQUIREMENT")
    	private String qualityRequirement;
    	
		@Column(name = "REMARK")
    	private String remark;
    	
		@Column(name = "STATUS")
    	private String status;
    	
	
	
		public void setId(String id){
			this.id = id;
		}
		
		public String getId(){
			return this.id;
		}
	
		public void setPlanId(String planId){
			this.planId = planId;
		}
		
		public String getPlanId(){
			return this.planId;
		}
	
		public void setSecurityCaptainId(String securityCaptainId){
			this.securityCaptainId = securityCaptainId;
		}
		
		public String getSecurityCaptainId(){
			return this.securityCaptainId;
		}
	
		public void setVehicle(String vehicle){
			this.vehicle = vehicle;
		}
		
		public String getVehicle(){
			return this.vehicle;
		}
	
		public void setJobSite(String jobSite){
			this.jobSite = jobSite;
		}
		
		public String getJobSite(){
			return this.jobSite;
		}
	
		public void setJobName(String jobName){
			this.jobName = jobName;
		}
		
		public String getJobName(){
			return this.jobName;
		}
	
		public void setJobStartTime(Date jobStartTime){
			this.jobStartTime = jobStartTime;
		}
		
		public Date getJobStartTime(){
			return this.jobStartTime;
		}
	
		public void setJobEndTime(Date jobEndTime){
			this.jobEndTime = jobEndTime;
		}
		
		public Date getJobEndTime(){
			return this.jobEndTime;
		}
	
		public void setWorkGroupLeader(String workGroupLeader){
			this.workGroupLeader = workGroupLeader;
		}
		
		public String getWorkGroupLeader(){
			return this.workGroupLeader;
		}
	
		public void setWorkGroupMember(String workGroupMember){
			this.workGroupMember = workGroupMember;
		}
		
		public String getWorkGroupMember(){
			return this.workGroupMember;
		}
	
		public void setJobSupport(String jobSupport){
			this.jobSupport = jobSupport;
		}
		
		public String getJobSupport(){
			return this.jobSupport;
		}
	
		public void setJobContent(String jobContent){
			this.jobContent = jobContent;
		}
		
		public String getJobContent(){
			return this.jobContent;
		}
	
		public void setJobCompletionInfo(String jobCompletionInfo){
			this.jobCompletionInfo = jobCompletionInfo;
		}
		
		public String getJobCompletionInfo(){
			return this.jobCompletionInfo;
		}
	
		public void setQualityRequirement(String qualityRequirement){
			this.qualityRequirement = qualityRequirement;
		}
		
		public String getQualityRequirement(){
			return this.qualityRequirement;
		}
	
		public void setRemark(String remark){
			this.remark = remark;
		}
		
		public String getRemark(){
			return this.remark;
		}
	
		public void setStatus(String status){
			this.status = status;
		}
		
		public String getStatus(){
			return this.status;
		}
	
	
}