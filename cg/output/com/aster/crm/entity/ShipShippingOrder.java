package com.aster.crm.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Date;

import org.hibernate.annotations.GenericGenerator;

/**
 * The persistent class for the ship_shipping_order database table.
 * 
 */
@Entity
@Table(name = "ship_shipping_order")
public class ShipShippingOrder implements Serializable {

	private static final long serialVersionUID = 1L;
		@Id
		@GenericGenerator(name = "system-uuid", strategy = "uuid")
		@GeneratedValue(generator = "system-uuid")
		private String id;
	
		@Column(name = "SOURCE")
    	private String source;
    	
		@Column(name = "SOURCE_ID")
    	private String sourceId;
    	
		@Column(name = "PRD_ORDER_ID")
    	private String prdOrderId;
    	
		@Column(name = "SHIPPER_ID")
    	private String shipperId;
    	
		@Column(name = "SHIPPER_CODE")
    	private String shipperCode;
    	
		@Column(name = "SHIPPER_NAME")
    	private String shipperName;
    	
		@Column(name = "LOGISTIC_CODE")
    	private String logisticCode;
    	
		@Column(name = "STATUS")
    	private String status;
    	
		@Column(name = "DELETED")
    	private Boolean deleted;
    	
		@Column(name = "REMARK")
    	private String remark;
    	
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
	
		public void setPrdOrderId(String prdOrderId){
			this.prdOrderId = prdOrderId;
		}
		
		public String getPrdOrderId(){
			return this.prdOrderId;
		}
	
		public void setShipperId(String shipperId){
			this.shipperId = shipperId;
		}
		
		public String getShipperId(){
			return this.shipperId;
		}
	
		public void setShipperCode(String shipperCode){
			this.shipperCode = shipperCode;
		}
		
		public String getShipperCode(){
			return this.shipperCode;
		}
	
		public void setShipperName(String shipperName){
			this.shipperName = shipperName;
		}
		
		public String getShipperName(){
			return this.shipperName;
		}
	
		public void setLogisticCode(String logisticCode){
			this.logisticCode = logisticCode;
		}
		
		public String getLogisticCode(){
			return this.logisticCode;
		}
	
		public void setStatus(String status){
			this.status = status;
		}
		
		public String getStatus(){
			return this.status;
		}
	
		public void setDeleted(Boolean deleted){
			this.deleted = deleted;
		}
		
		public Boolean getDeleted(){
			return this.deleted;
		}
	
		public void setRemark(String remark){
			this.remark = remark;
		}
		
		public String getRemark(){
			return this.remark;
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