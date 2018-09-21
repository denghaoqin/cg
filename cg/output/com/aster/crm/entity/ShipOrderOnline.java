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
 * The persistent class for the ship_order_online database table.
 * 
 */
@Entity
@Table(name = "ship_order_online")
public class ShipOrderOnline implements Serializable {

	private static final long serialVersionUID = 1L;
		@Id
		@GenericGenerator(name = "system-uuid", strategy = "uuid")
		@GeneratedValue(generator = "system-uuid")
		private String id;
	
		@Column(name = "GOODS_SOURCE")
    	private String goodsSource;
    	
		@Column(name = "GOODS_SOURCE_ID")
    	private String goodsSourceId;
    	
		@Column(name = "ORDER_CODE")
    	private String orderCode;
    	
		@Column(name = "SHIPPER_ID")
    	private String shipperId;
    	
		@Column(name = "SHIPPER_CODE")
    	private String shipperCode;
    	
		@Column(name = "LOGISTIC_CODE")
    	private String logisticCode;
    	
		@Column(name = "PAY_TYPE")
    	private Integer payType;
    	
		@Column(name = "EXP_TYPE")
    	private Integer expType;
    	
		@Column(name = "SENDER_ID")
    	private String senderId;
    	
		@Column(name = "RECEIVER_COMPANY")
    	private String receiverCompany;
    	
		@Column(name = "RECEIVER_NAME")
    	private String receiverName;
    	
		@Column(name = "RECEIVER_TEL")
    	private String receiverTel;
    	
		@Column(name = "RECEIVER_MOBILE")
    	private String receiverMobile;
    	
		@Column(name = "RECEIVER_POSTCODE")
    	private String receiverPostcode;
    	
		@Column(name = "RECEIVER_PROVINCENAME")
    	private String receiverProvincename;
    	
		@Column(name = "RECEIVER_CITYNAME")
    	private String receiverCityname;
    	
		@Column(name = "RECEIVER_EXPAREANAME")
    	private String receiverExpareaname;
    	
		@Column(name = "RECEIVER_ADDRESS")
    	private String receiverAddress;
    	
		@Column(name = "START_DATE")
    	private Date startDate;
    	
		@Column(name = "END_DATE")
    	private Date endDate;
    	
		@Column(name = "WEIGHT")
    	private Double weight;
    	
		@Column(name = "QUANTITY")
    	private Integer quantity;
    	
		@Column(name = "VOLUME")
    	private Double volume;
    	
		@Column(name = "REMARK")
    	private String remark;
    	
		@Column(name = "STATUS")
    	private String status;
    	
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
	
		public void setGoodsSource(String goodsSource){
			this.goodsSource = goodsSource;
		}
		
		public String getGoodsSource(){
			return this.goodsSource;
		}
	
		public void setGoodsSourceId(String goodsSourceId){
			this.goodsSourceId = goodsSourceId;
		}
		
		public String getGoodsSourceId(){
			return this.goodsSourceId;
		}
	
		public void setOrderCode(String orderCode){
			this.orderCode = orderCode;
		}
		
		public String getOrderCode(){
			return this.orderCode;
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
	
		public void setLogisticCode(String logisticCode){
			this.logisticCode = logisticCode;
		}
		
		public String getLogisticCode(){
			return this.logisticCode;
		}
	
		public void setPayType(Integer payType){
			this.payType = payType;
		}
		
		public Integer getPayType(){
			return this.payType;
		}
	
		public void setExpType(Integer expType){
			this.expType = expType;
		}
		
		public Integer getExpType(){
			return this.expType;
		}
	
		public void setSenderId(String senderId){
			this.senderId = senderId;
		}
		
		public String getSenderId(){
			return this.senderId;
		}
	
		public void setReceiverCompany(String receiverCompany){
			this.receiverCompany = receiverCompany;
		}
		
		public String getReceiverCompany(){
			return this.receiverCompany;
		}
	
		public void setReceiverName(String receiverName){
			this.receiverName = receiverName;
		}
		
		public String getReceiverName(){
			return this.receiverName;
		}
	
		public void setReceiverTel(String receiverTel){
			this.receiverTel = receiverTel;
		}
		
		public String getReceiverTel(){
			return this.receiverTel;
		}
	
		public void setReceiverMobile(String receiverMobile){
			this.receiverMobile = receiverMobile;
		}
		
		public String getReceiverMobile(){
			return this.receiverMobile;
		}
	
		public void setReceiverPostcode(String receiverPostcode){
			this.receiverPostcode = receiverPostcode;
		}
		
		public String getReceiverPostcode(){
			return this.receiverPostcode;
		}
	
		public void setReceiverProvincename(String receiverProvincename){
			this.receiverProvincename = receiverProvincename;
		}
		
		public String getReceiverProvincename(){
			return this.receiverProvincename;
		}
	
		public void setReceiverCityname(String receiverCityname){
			this.receiverCityname = receiverCityname;
		}
		
		public String getReceiverCityname(){
			return this.receiverCityname;
		}
	
		public void setReceiverExpareaname(String receiverExpareaname){
			this.receiverExpareaname = receiverExpareaname;
		}
		
		public String getReceiverExpareaname(){
			return this.receiverExpareaname;
		}
	
		public void setReceiverAddress(String receiverAddress){
			this.receiverAddress = receiverAddress;
		}
		
		public String getReceiverAddress(){
			return this.receiverAddress;
		}
	
		public void setStartDate(Date startDate){
			this.startDate = startDate;
		}
		
		public Date getStartDate(){
			return this.startDate;
		}
	
		public void setEndDate(Date endDate){
			this.endDate = endDate;
		}
		
		public Date getEndDate(){
			return this.endDate;
		}
	
		public void setWeight(Double weight){
			this.weight = weight;
		}
		
		public Double getWeight(){
			return this.weight;
		}
	
		public void setQuantity(Integer quantity){
			this.quantity = quantity;
		}
		
		public Integer getQuantity(){
			return this.quantity;
		}
	
		public void setVolume(Double volume){
			this.volume = volume;
		}
		
		public Double getVolume(){
			return this.volume;
		}
	
		public void setRemark(String remark){
			this.remark = remark;
		}
		
		public String getRemark(){
			return this.remark;
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