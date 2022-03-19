package com.webapp.shop.ui.model;

import java.util.ArrayList;

public class DataTable {
	ArrayList<Object> columns;
	Integer draw;
	Integer length;
	Integer start;
	DataTableSearch search;
	ArrayList<DataTableOrder> order;
	public DataTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DataTable(Integer draw, Integer length, Integer start, DataTableSearch search, ArrayList<DataTableOrder> order) {
		super();
		this.draw = draw;
		this.length = length;
		this.start = start;
		this.search = search;
		this.order = order;
	}
	public Integer getDraw() {
		return draw;
	}
	public void setDraw(Integer draw) {
		this.draw = draw;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public DataTableSearch getSearch() {
		return search;
	}
	public void setSearch(DataTableSearch search) {
		this.search = search;
	}
	public ArrayList<DataTableOrder> getOrder() {
		return order;
	}
	public void setOrder(ArrayList<DataTableOrder> order) {
		this.order = order;
	}
	public ArrayList<Object> getColumns() {
		return columns;
	}
	public void setColumns(ArrayList<Object> columns) {
		this.columns = columns;
	}
	
	
}
