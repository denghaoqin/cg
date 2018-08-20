package com.hiav.zgtj.smis.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.annotations.GenericGenerator;

/**
 * The persistent class for the dpa_check_task database table.
 * 
 */
@Entity
@Table(name = "dpa_check_task")
public class DpaCheckTask implements Serializable {

	private static final long serialVersionUID = 1L;
		@Id
		@GenericGenerator(name = "system-uuid", strategy = "uuid")
		@GeneratedValue(generator = "system-uuid")
		private String id;
	
		@Column(name = "SOURCE")
    	private String source;
    	
		@Column(name = "SOURCE_ID")
    	private String sourceId;
    	
		@Column(name = "STATUS")
    	private String status;
    	
	
	
		public void setId(String id){
			this.id = id;
		}
		
		public String getId(){
			return this.id;
		}
	
		public void setSource(String source){
			this.source = source;
		}
		
		public String getSource(){
			return this.source;
		}
	
		public void setSourceId(String sourceId){
			this.sourceId = sourceId;
		}
		
		public String getSourceId(){
			return this.sourceId;
		}
	
		public void setStatus(String status){
			this.status = status;
		}
		
		public String getStatus(){
			return this.status;
		}
	
	
}