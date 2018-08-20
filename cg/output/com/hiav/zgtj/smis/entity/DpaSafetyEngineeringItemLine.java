package com.hiav.zgtj.smis.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.annotations.GenericGenerator;

/**
 * The persistent class for the dpa_safety_engineering_item_line database table.
 * 
 */
@Entity
@Table(name = "dpa_safety_engineering_item_line")
public class DpaSafetyEngineeringItemLine implements Serializable {

	private static final long serialVersionUID = 1L;
	
		@Column(name = "ID")
    	private String id;
    	
		@Column(name = "ITEM_ID")
    	private String itemId;
    	
		@Column(name = "CONTENT")
    	private String content;
    	
	
	
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
	
	
}