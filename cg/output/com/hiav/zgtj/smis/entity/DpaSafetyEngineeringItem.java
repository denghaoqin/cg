package com.hiav.zgtj.smis.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.annotations.GenericGenerator;

/**
 * The persistent class for the dpa_safety_engineering_item database table.
 * 
 */
@Entity
@Table(name = "dpa_safety_engineering_item")
public class DpaSafetyEngineeringItem implements Serializable {

	private static final long serialVersionUID = 1L;
	
		@Column(name = "ID")
    	private String id;
    	
		@Column(name = "ENGINEERING_ID")
    	private String engineeringId;
    	
		@Column(name = "NAME")
    	private String name;
    	
	
	
		public void setId(String id){
			this.id = id;
		}
		
		public String getId(){
			return this.id;
		}
	
		public void setEngineeringId(String engineeringId){
			this.engineeringId = engineeringId;
		}
		
		public String getEngineeringId(){
			return this.engineeringId;
		}
	
		public void setName(String name){
			this.name = name;
		}
		
		public String getName(){
			return this.name;
		}
	
	
}