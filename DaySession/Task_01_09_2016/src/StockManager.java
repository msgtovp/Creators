package com.creators.store.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import com.creators.store.Stock;;

public class StockManager {
	static int code = 1000;
	List<Stock> stock;
	BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
	public StockManager() {
		super();
		this.stock = new LinkedList<Stock>();
	}
	public StockManager(List<Stock> stock) {
		super();
		this.stock = stock;
	}
	public void insert() throws IOException {
		Stock stNew = new Stock();
		stNew.setItemCode(code++);
		System.out.print("Item Name : ");
		stNew.setItemName(scan.readLine());
		System.out.print("Stock Count : ");
		stNew.setStockCount(Integer.parseInt(scan.readLine()));
		System.out.print("Price : ");
		stNew.setPrice(Double.parseDouble(scan.readLine()));
		System.out.print("Manufacturer : ");
		stNew.setManufacturer(scan.readLine());
		System.out.print("Manufacturing Date : ");
		stNew.setManufacturingDate(scan.readLine());
		System.out.print("Expiry Date : ");
		stNew.setExpiryDate(scan.readLine());
		stock.add(stNew);
	}
	public void update(int itemCode) throws IOException {
		Stock update = null;
		for(Stock each:stock) {
			if(each.getItemCode() == itemCode) {
				update = each;
				break;
			}
		}
		if(update == null) {
			System.out.println("ItemCode Doesn't Exist");
		} else {
			System.out.println("\nItem Found\n"+update);
			System.out.print("\n\t1.Name\n\t2.Stock\n\t3.Price\n\t4.Manufacturer\n\t\tChoose : ");
			int ch = Integer.parseInt(scan.readLine());
			switch(ch) {
				case 1:
					System.out.print("Item Name : ");
					update.setItemName(scan.readLine());
					break;
				case 2:
					System.out.print("Stock Count : ");
					update.setStockCount(Integer.parseInt(scan.readLine()));
					break;
				case 3:
					System.out.print("Price : ");
					update.setPrice(Double.parseDouble(scan.readLine()));
					break;
				case 4:
					System.out.print("Manufacturer : ");
					update.setManufacturer(scan.readLine());
					break;
			}
			System.out.println(update);
			System.out.println("Item updated.");
		}
	}
	public void delete(int itemCode) {
		Stock remove = null;
		for(Stock each:stock) {
			if(each.getItemCode() == itemCode) {
				remove = each;
				break;
			}
		}
		if(remove == null) {
			System.out.println("ItemCode Doesn't Exist");
		} else {
			System.out.println(remove);
			stock.remove(remove);
			System.out.println("Deleted from Stock Manager");
		}
	}
	public void print() {
		System.out.println("Code\tName\tStock\tPrice\t\tManufacturer\tMaf.Date\tExp.Date");
		if(stock.isEmpty()) {
			System.out.println("\t\t\tNo stocks in the room");
		} else {
			for(Stock each:stock) {
				System.out.println(each);
			}
		}
	}
}
