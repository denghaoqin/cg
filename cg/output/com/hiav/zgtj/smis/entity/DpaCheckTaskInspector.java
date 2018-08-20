package com.hiav.zgtj.smis.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.annotations.GenericGenerator;

/**
 * The persistent class for the dpa_check_task_inspector database table.
 * 
 */
@Entity
@Table(name = "dpa_check_task_inspector")
public class DpaCheckTaskInspector implements Serializable {

	private static final long serialVersionUID = 1L;
		@Id
		@GenericGenerator(name = "system-uuid", strategy = "uuid")
		@GeneratedValue(generator = "system-uuid")
		private String id;
	
		@Column(name = "TASK_ID")
    	private String taskId;
    	
		@Column(name = "INSPECTOR_ID")
    	private String inspectorId;
    	
	
	
		public void setId(String id){
			this.id = id;
		}
		
		public String getId(){
			return this.id;
		}
	
		public void setTaskId(String taskId){
			this.taskId = taskId;
		}
		
		public String getTaskId(){
			return this.taskId;
		}
	
		public void setInspectorId(String inspectorId){
			this.inspectorId = inspectorId;
		}
		
		public String getInspectorId(){
			return this.inspectorId;
		}
	
	
}