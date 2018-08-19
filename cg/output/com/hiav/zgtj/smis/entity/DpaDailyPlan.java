package com.hiav.zgtj.smis.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import java.sql.Timestamp;

import org.hibernate.annotations.GenericGenerator;

/**
 * The persistent class for the dpa_daily_plan database table.
 * 
 */
@Entity
@Table(name = "dpa_daily_plan")
public class DpaDailyPlan implements Serializable {

	private static final long serialVersionUID = 1L;
		@Id
		@GenericGenerator(name = "system-uuid", strategy = "uuid")
		@GeneratedValue(generator = "system-uuid")
		private String id;
	
		@Column(name = "SERIAL_NUMBER")
    	private String serialNumber;
    	
		@Column(name = "CONSTRUCTION_CLASS")
    	private String constructionClass;
    	
		@Column(name = "DAILY_PLAN_NO")
    	private String dailyPlanNo;
    	
		@Column(name = "MONTHLY_PLAN_NO")
    	private String monthlyPlanNo;
    	
		@Column(name = "PROJECT_ID")
    	private String projectId;
    	
		@Column(name = "WORKING_LOCATION")
    	private String workingLocation;
    	
		@Column(name = "C_LINES")
    	private String cLines;
    	
		@Column(name = "MAJOR_NAME")
    	private String majorName;
    	
		@Column(name = "CONSTRUCTION_MILEAGE")
    	private String constructionMileage;
    	
		@Column(name = "CONSTRUCTION_ITEM")
    	private String constructionItem;
    	
		@Column(name = "CONSTRUCTION_START_TIME")
    	private Timestamp constructionStartTime;
    	
		@Column(name = "CONSTRUCTION_END_TIME")
    	private Timestamp constructionEndTime;
    	
		@Column(name = "WORKING_CONTENTS")
    	private String workingContents;
    	
		@Column(name = "TRAFFIC_LIMIT_CARD")
    	private String trafficLimitCard;
    	
		@Column(name = "ROAD_TRAIN")
    	private String roadTrain;
    	
		@Column(name = "CONSTRUCTION_UNIT")
    	private String constructionUnit;
    	
		@Column(name = "COOPERATE_UNIT")
    	private String cooperateUnit;
    	
		@Column(name = "STATUS")
    	private String status;
    	
		@Column(name = "WF_STATUS")
    	private String wfStatus;
    	
		@Column(name = "WF_OPINION")
    	private String wfOpinion;
    	
		@Column(name = "REMARK")
    	private String remark;
    	
		@Column(name = "DELETED")
    	private byte deleted;
    	
		@Column(name = "CREATED_BY")
    	private String createdBy;
    	
		@Column(name = "CREATION_DATE")
    	private Timestamp creationDate;
    	
		@Column(name = "LAST_UPDATE_BY")
    	private String lastUpdateBy;
    	
		@Column(name = "LAST_UPDATE_DATE")
    	private Timestamp lastUpdateDate;
    	
	
	
		public void setId(String id){
			this.id = id;
		}
		
		public String getId(){
			return this.id;
		}
	
		public void setSerialNumber(String serialNumber){
			this.serialNumber = serialNumber;
		}
		
		public String getSerialNumber(){
			return this.serialNumber;
		}
	
		public void setConstructionClass(String constructionClass){
			this.constructionClass = constructionClass;
		}
		
		public String getConstructionClass(){
			return this.constructionClass;
		}
	
		public void setDailyPlanNo(String dailyPlanNo){
			this.dailyPlanNo = dailyPlanNo;
		}
		
		public String getDailyPlanNo(){
			return this.dailyPlanNo;
		}
	
		public void setMonthlyPlanNo(String monthlyPlanNo){
			this.monthlyPlanNo = monthlyPlanNo;
		}
		
		public String getMonthlyPlanNo(){
			return this.monthlyPlanNo;
		}
	
		public void setProjectId(String projectId){
			this.projectId = projectId;
		}
		
		public String getProjectId(){
			return this.projectId;
		}
	
		public void setWorkingLocation(String workingLocation){
			this.workingLocation = workingLocation;
		}
		
		public String getWorkingLocation(){
			return this.workingLocation;
		}
	
		public void setCLines(String cLines){
			this.cLines = cLines;
		}
		
		public String getCLines(){
			return this.cLines;
		}
	
		public void setMajorName(String majorName){
			this.majorName = majorName;
		}
		
		public String getMajorName(){
			return this.majorName;
		}
	
		public void setConstructionMileage(String constructionMileage){
			this.constructionMileage = constructionMileage;
		}
		
		public String getConstructionMileage(){
			return this.constructionMileage;
		}
	
		public void setConstructionItem(String constructionItem){
			this.constructionItem = constructionItem;
		}
		
		public String getConstructionItem(){
			return this.constructionItem;
		}
	
		public void setConstructionStartTime(Timestamp constructionStartTime){
			this.constructionStartTime = constructionStartTime;
		}
		
		public Timestamp getConstructionStartTime(){
			return this.constructionStartTime;
		}
	
		public void setConstructionEndTime(Timestamp constructionEndTime){
			this.constructionEndTime = constructionEndTime;
		}
		
		public Timestamp getConstructionEndTime(){
			return this.constructionEndTime;
		}
	
		public void setWorkingContents(String workingContents){
			this.workingContents = workingContents;
		}
		
		public String getWorkingContents(){
			return this.workingContents;
		}
	
		public void setTrafficLimitCard(String trafficLimitCard){
			this.trafficLimitCard = trafficLimitCard;
		}
		
		public String getTrafficLimitCard(){
			return this.trafficLimitCard;
		}
	
		public void setRoadTrain(String roadTrain){
			this.roadTrain = roadTrain;
		}
		
		public String getRoadTrain(){
			return this.roadTrain;
		}
	
		public void setConstructionUnit(String constructionUnit){
			this.constructionUnit = constructionUnit;
		}
		
		public String getConstructionUnit(){
			return this.constructionUnit;
		}
	
		public void setCooperateUnit(String cooperateUnit){
			this.cooperateUnit = cooperateUnit;
		}
		
		public String getCooperateUnit(){
			return this.cooperateUnit;
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
	
		public void setDeleted(byte deleted){
			this.deleted = deleted;
		}
		
		public byte getDeleted(){
			return this.deleted;
		}
	
		public void setCreatedBy(String createdBy){
			this.createdBy = createdBy;
		}
		
		public String getCreatedBy(){
			return this.createdBy;
		}
	
		public void setCreationDate(Timestamp creationDate){
			this.creationDate = creationDate;
		}
		
		public Timestamp getCreationDate(){
			return this.creationDate;
		}
	
		public void setLastUpdateBy(String lastUpdateBy){
			this.lastUpdateBy = lastUpdateBy;
		}
		
		public String getLastUpdateBy(){
			return this.lastUpdateBy;
		}
	
		public void setLastUpdateDate(Timestamp lastUpdateDate){
			this.lastUpdateDate = lastUpdateDate;
		}
		
		public Timestamp getLastUpdateDate(){
			return this.lastUpdateDate;
		}
	
	
}