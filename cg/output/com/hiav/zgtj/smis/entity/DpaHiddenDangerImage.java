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
 * The persistent class for the dpa_hidden_danger_image database table.
 * 
 */
@Entity
@Table(name = "dpa_hidden_danger_image")
public class DpaHiddenDangerImage implements Serializable {

	private static final long serialVersionUID = 1L;
		@Id
		@GenericGenerator(name = "system-uuid", strategy = "uuid")
		@GeneratedValue(generator = "system-uuid")
		private String id;
	
		@Column(name = "SOURCE_ID")
    	private String sourceId;
    	
		@Column(name = "SOURCE_TYPE")
    	private String sourceType;
    	
		@Column(name = "THUMBNAIL_URL")
    	private String thumbnailUrl;
    	
		@Column(name = "IMAGE_URL")
    	private String imageUrl;
    	
		@Column(name = "IMAGE_NAME")
    	private String imageName;
    	
		@Column(name = "FILE_FORMAT")
    	private String fileFormat;
    	
		@Column(name = "FILE_SIZE")
    	private Integer fileSize;
    	
		@Column(name = "REMARK")
    	private String remark;
    	
		@Column(name = "DELETED")
    	private Boolean deleted;
    	
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
	
		public void setSourceId(String sourceId){
			this.sourceId = sourceId;
		}
		
		public String getSourceId(){
			return this.sourceId;
		}
	
		public void setSourceType(String sourceType){
			this.sourceType = sourceType;
		}
		
		public String getSourceType(){
			return this.sourceType;
		}
	
		public void setThumbnailUrl(String thumbnailUrl){
			this.thumbnailUrl = thumbnailUrl;
		}
		
		public String getThumbnailUrl(){
			return this.thumbnailUrl;
		}
	
		public void setImageUrl(String imageUrl){
			this.imageUrl = imageUrl;
		}
		
		public String getImageUrl(){
			return this.imageUrl;
		}
	
		public void setImageName(String imageName){
			this.imageName = imageName;
		}
		
		public String getImageName(){
			return this.imageName;
		}
	
		public void setFileFormat(String fileFormat){
			this.fileFormat = fileFormat;
		}
		
		public String getFileFormat(){
			return this.fileFormat;
		}
	
		public void setFileSize(Integer fileSize){
			this.fileSize = fileSize;
		}
		
		public Integer getFileSize(){
			return this.fileSize;
		}
	
		public void setRemark(String remark){
			this.remark = remark;
		}
		
		public String getRemark(){
			return this.remark;
		}
	
		public void setDeleted(Boolean deleted){
			this.deleted = deleted;
		}
		
		public Boolean getDeleted(){
			return this.deleted;
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