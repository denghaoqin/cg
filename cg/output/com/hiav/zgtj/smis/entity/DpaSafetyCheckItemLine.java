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
 * The persistent class for the dpa_safety_check_item_line database table.
 * 
 */
@Entity
@Table(name = "dpa_safety_check_item_line")
public class DpaSafetyCheckItemLine implements Serializable {

	private static final long serialVersionUID = 1L;
	
		@Column(name = "ID")
    	private String id;
    	
		@Column(name = "ITEM_ID")
    	private String itemId;
    	
		@Column(name = "CONTENT")
    	private String content;
    	
		@Column(name = "IS_APPROVED")
    	private String isApproved;
    	
		@Column(name = "PLAN_CHECK_TIME")
    	private Date planCheckTime;
    	
		@Column(name = "CHECK_TIME")
    	private Date checkTime;
    	
		@Column(name = "NEED_RESOURCE")
    	private Boolean needResource;
    	
	
	
		public void setId(String id){
			this.id = id;
		}
		
		public String getId(){
			return this.id;
		}
	
		public void setItemId(String itemId){
			this.itemId = itemId;
		}
		
		public String getItemId(){
			return this.itemId;
		}
	
		public void setContent(String content){
			this.content = content;
		}
		
		public String getContent(){
			return this.content;
		}
	
		public void setIsApproved(String isApproved){
			this.isApproved = isApproved;
		}
		
		public String getIsApproved(){
			return this.isApproved;
		}
	
		public void setPlanCheckTime(Date planCheckTime){
			this.planCheckTime = planCheckTime;
		}
		
		public Date getPlanCheckTime(){
			return this.planCheckTime;
		}
	
		public void setCheckTime(Date checkTime){
			this.checkTime = checkTime;
		}
		
		public Date getCheckTime(){
			return this.checkTime;
		}
	
		public void setNeedResource(Boolean needResource){
			this.needResource = needResource;
		}
		
		public Boolean getNeedResource(){
			return this.needResource;
		}
	
	
}