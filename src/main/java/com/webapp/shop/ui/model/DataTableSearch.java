package com.webapp.shop.ui.model;


public class DataTableSearch {
	Boolean regex;
	String value;
	public DataTableSearch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DataTableSearch(Boolean regex, String value) {
		super();
		this.regex = regex;
		this.value = value;
	}
	public Boolean getRegex() {
		return regex;
	}
	public void setRegex(Boolean regex) {
		this.regex = regex;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
}