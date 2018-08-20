package com.hiav.zgtj.smis.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.annotations.GenericGenerator;

/**
 * The persistent class for the dpa_job_tools database table.
 * 
 */
@Entity
@Table(name = "dpa_job_tools")
public class DpaJobTools implements Serializable {

	private static final long serialVersionUID = 1L;
		@Id
		@GenericGenerator(name = "system-uuid", strategy = "uuid")
		@GeneratedValue(generator = "system-uuid")
		private String id;
	
		@Column(name = "JOB_ID")
    	private String jobId;
    	
		@Column(name = "TOOLS_ID")
    	private String toolsId;
    	
		@Column(name = "QUANTITY")
    	private Double quantity;
    	
	
	
		public void setId(String id){
			this.id = id;
		}
		
		public String getId(){
			return this.id;
		}
	
		public void setJobId(String jobId){
			this.jobId = jobId;
		}
		
		public String getJobId(){
			return this.jobId;
		}
	
		public void setToolsId(String toolsId){
			this.toolsId = toolsId;
		}
		
		public String getToolsId(){
			return this.toolsId;
		}
	
		public void setQuantity(Double quantity){
			this.quantity = quantity;
		}
		
		public Double getQuantity(){
			return this.quantity;
		}
	
	
}