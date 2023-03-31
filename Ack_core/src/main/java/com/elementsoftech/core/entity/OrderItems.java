package com.elementsoftech.core.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OrderItems {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ordId;
	private Long productNumber;
	private String productName;
	private int priductQty;
	private Long productPrice;
	
	public OrderItems(Long ordId, Long productNumber, String productName, int priductQty, Long productPrice) {
		super();
		this.ordId = ordId;
		this.productNumber = productNumber;
		this.productName = productName;
		this.priductQty = priductQty;
		this.productPrice = productPrice;
	}

	public Long getOrdId() {
		return ordId;
	}

	public void setOrdId(Long ordId) {
		this.ordId = ordId;
	}

	public Long getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(Long productNumber) {
		this.productNumber = productNumber;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPriductQty() {
		return priductQty;
	}

	public void setPriductQty(int priductQty) {
		this.priductQty = priductQty;
	}

	public Long getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Long productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "OrderItems [ordId=" + ordId + ", productNumber=" + productNumber + ", productName=" + productName
				+ ", priductQty=" + priductQty + ", productPrice=" + productPrice + "]";
	}
	
	

}
