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
 * The persistent class for the dpa_job_construction database table.
 * 
 */
@Entity
@Table(name = "dpa_job_construction")
public class DpaJobConstruction implements Serializable {

	private static final long serialVersionUID = 1L;
		@Id
		@GenericGenerator(name = "system-uuid", strategy = "uuid")
		@GeneratedValue(generator = "system-uuid")
		private String id;
	
		@Column(name = "PLAN_ID")
    	private String planId;
    	
		@Column(name = "START_TIME")
    	private Date startTime;
    	
		@Column(name = "END_TIME")
    	private Date endTime;
    	
	
	
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
	
		public void setStartTime(Date startTime){
			this.startTime = startTime;
		}
		
		public Date getStartTime(){
			return this.startTime;
		}
	
		public void setEndTime(Date endTime){
			this.endTime = endTime;
		}
		
		public Date getEndTime(){
			return this.endTime;
		}
	
	
}