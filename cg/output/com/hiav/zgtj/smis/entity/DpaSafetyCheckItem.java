package com.hiav.zgtj.smis.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.annotations.GenericGenerator;

/**
 * The persistent class for the dpa_safety_check_item database table.
 * 
 */
@Entity
@Table(name = "dpa_safety_check_item")
public class DpaSafetyCheckItem implements Serializable {

	private static final long serialVersionUID = 1L;
	
		@Column(name = "ID")
    	private String id;
    	
		@Column(name = "CHECK_ID")
    	private String checkId;
    	
		@Column(name = "NAME")
    	private String name;
    	
	
	
		public void setId(String id){
			this.id = id;
		}
		
		public String getId(){
			return this.id;
		}
	
		public void setCheckId(String checkId){
			this.checkId = checkId;
		}
		
		public String getCheckId(){
			return this.checkId;
		}
	
		public void setName(String name){
			this.name = name;
		}
		
		public String getName(){
			return this.name;
		}
	
	
}