package com.webapp.shop.ui.model;

import java.util.Date;

public class MyDataTable {
	
	private Integer id ;
	private Date createdAt;
    private Date updatedAt;
    private boolean is_active ;
    private float price;
    private String name;
    private String department;
    
	public MyDataTable(Date createdAt, Date updatedAt, boolean is_active, float price, String name, String department) {
		super();
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.is_active = is_active;
		this.price = price;
		this.name = name;
		this.department = department;
	}
	public MyDataTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MyDataTable [createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", is_active=" + is_active
				+ ", price=" + price + ", name=" + name + ", department=" + department + "]";
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public boolean isIs_active() {
		return is_active;
	}
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
    
	
	
}
