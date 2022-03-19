package com.webapp.shop.ui.model;


import java.util.List;

public class DataTablePojo {
	private Integer start;
	private Integer length;
	private List<DataTableOrder> order;

	public DataTablePojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DataTablePojo(Integer start, Integer length, List<DataTableOrder> order) {
		super();
		this.start = start;
		this.length = length;
		this.order = order;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public List<DataTableOrder> getOrder() {
		return order;
	}

	public void setOrder(List<DataTableOrder> order) {
		this.order = order;
	}

}

