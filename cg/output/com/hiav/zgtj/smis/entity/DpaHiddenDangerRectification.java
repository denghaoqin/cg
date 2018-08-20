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
 * The persistent class for the dpa_hidden_danger_rectification database table.
 * 
 */
@Entity
@Table(name = "dpa_hidden_danger_rectification")
public class DpaHiddenDangerRectification implements Serializable {

	private static final long serialVersionUID = 1L;
	
		@Column(name = "ID")
    	private String id;
    	
		@Column(name = "HIDDEN_DANGER_ID")
    	private String hiddenDangerId;
    	
		@Column(name = "RESPONSE")
    	private String response;
    	
		@Column(name = "COMPLETION_TIME")
    	private Date completionTime;
    	
		@Column(name = "REMARK")
    	private String remark;
    	
		@Column(name = "STATUS")
    	private String status;
    	
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
	
		public void setResponse(String response){
			this.response = response;
		}
		
		public String getResponse(){
			return this.response;
		}
	
		public void setCompletionTime(Date completionTime){
			this.completionTime = completionTime;
		}
		
		public Date getCompletionTime(){
			return this.completionTime;
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