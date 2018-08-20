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
 * The persistent class for the dpa_hidden_danger_acceptance database table.
 * 
 */
@Entity
@Table(name = "dpa_hidden_danger_acceptance")
public class DpaHiddenDangerAcceptance implements Serializable {

	private static final long serialVersionUID = 1L;
	
		@Column(name = "ID")
    	private String id;
    	
		@Column(name = "HIDDEN_DANGER_ID")
    	private String hiddenDangerId;
    	
		@Column(name = "RECTIFICATION_ID")
    	private String rectificationId;
    	
		@Column(name = "SUPERVISOR")
    	private String supervisor;
    	
		@Column(name = "ACCEPTANCE_TIME")
    	private Date acceptanceTime;
    	
		@Column(name = "RESULT")
    	private Boolean result;
    	
		@Column(name = "RESPONSE")
    	private String response;
    	
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
	
		public void setHiddenDangerId(String hiddenDangerId){
			this.hiddenDangerId = hiddenDangerId;
		}
		
		public String getHiddenDangerId(){
			return this.hiddenDangerId;
		}
	
		public void setRectificationId(String rectificationId){
			this.rectificationId = rectificationId;
		}
		
		public String getRectificationId(){
			return this.rectificationId;
		}
	
		public void setSupervisor(String supervisor){
			this.supervisor = supervisor;
		}
		
		public String getSupervisor(){
			return this.supervisor;
		}
	
		public void setAcceptanceTime(Date acceptanceTime){
			this.acceptanceTime = acceptanceTime;
		}
		
		public Date getAcceptanceTime(){
			return this.acceptanceTime;
		}
	
		public void setResult(Boolean result){
			this.result = result;
		}
		
		public Boolean getResult(){
			return this.result;
		}
	
		public void setResponse(String response){
			this.response = response;
		}
		
		public String getResponse(){
			return this.response;
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