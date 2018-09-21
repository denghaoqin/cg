package com.aster.crm.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.annotations.GenericGenerator;

/**
 * The persistent class for the ship_order_online_commodity database table.
 * 
 */
@Entity
@Table(name = "ship_order_online_commodity")
public class ShipOrderOnlineCommodity implements Serializable {

	private static final long serialVersionUID = 1L;
		@Id
		@GenericGenerator(name = "system-uuid", strategy = "uuid")
		@GeneratedValue(generator = "system-uuid")
		private String id;
	
		@Column(name = "ORDER_ID")
    	private String orderId;
    	
		@Column(name = "GOODS_NAME")
    	private String goodsName;
    	
		@Column(name = "GOODS_CODE")
    	private String goodsCode;
    	
		@Column(name = "GOODS_QUANTITY")
    	private Integer goodsQuantity;
    	
		@Column(name = "GOODS_PRICE")
    	private Double goodsPrice;
    	
		@Column(name = "GOODS_WEIGHT")
    	private Double goodsWeight;
    	
		@Column(name = "GOODS_DESC")
    	private String goodsDesc;
    	
		@Column(name = "GOODS_VOL")
    	private Double goodsVol;
    	
	
	
		public void setId(String id){
			this.id = id;
		}
		
		public String getId(){
			return this.id;
		}
	
		public void setOrderId(String orderId){
			this.orderId = orderId;
		}
		
		public String getOrderId(){
			return this.orderId;
		}
	
		public void setGoodsName(String goodsName){
			this.goodsName = goodsName;
		}
		
		public String getGoodsName(){
			return this.goodsName;
		}
	
		public void setGoodsCode(String goodsCode){
			this.goodsCode = goodsCode;
		}
		
		public String getGoodsCode(){
			return this.goodsCode;
		}
	
		public void setGoodsQuantity(Integer goodsQuantity){
			this.goodsQuantity = goodsQuantity;
		}
		
		public Integer getGoodsQuantity(){
			return this.goodsQuantity;
		}
	
		public void setGoodsPrice(Double goodsPrice){
			this.goodsPrice = goodsPrice;
		}
		
		public Double getGoodsPrice(){
			return this.goodsPrice;
		}
	
		public void setGoodsWeight(Double goodsWeight){
			this.goodsWeight = goodsWeight;
		}
		
		public Double getGoodsWeight(){
			return this.goodsWeight;
		}
	
		public void setGoodsDesc(String goodsDesc){
			this.goodsDesc = goodsDesc;
		}
		
		public String getGoodsDesc(){
			return this.goodsDesc;
		}
	
		public void setGoodsVol(Double goodsVol){
			this.goodsVol = goodsVol;
		}
		
		public Double getGoodsVol(){
			return this.goodsVol;
		}
	
	
}