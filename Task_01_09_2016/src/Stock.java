package com.creators.store;

public class Stock {
	private int itemCode;
	private String itemName;
	private int stockCount;
	private double price;
	private String manufacturer;
	private String manufacturingDate;
	private String expiryDate;
	public Stock() {
		super();
	}
	public int getItemCode() {
		return itemCode;
	}
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getStockCount() {
		return stockCount;
	}
	public void setStockCount(int stockCount) {
		this.stockCount = stockCount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getManufacturingDate() {
		return manufacturingDate;
	}
	public void setManufacturingDate(String manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String toString() {
		return itemCode + "\t" + itemName + "\t" + stockCount + "\t"
				+ String.format("Rs. %.2f", price) + "\t" + manufacturer + "\t\t" + manufacturingDate
				+ "\t" + expiryDate;
	}
	
}
