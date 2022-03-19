package com.webapp.shop.ui.model;

public class DataTableOrder {
	Integer column;
	String dir;
	
	
	public DataTableOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DataTableOrder(Integer column, String dir) {
		super();
		this.column = column;
		this.dir = dir;
	}
	public Integer getColumn() {
		return column;
	}
	public void setColumn(Integer column) {
		this.column = column;
	}
	public String getDir() {
		return dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}
	
	
}
