package com.webapp.shop.ui.model;

public class ProductRest {
	
	private Integer product_id;
	private String prod_name;
	private String prize;
	private String prod_pic;
	
	
	public ProductRest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public ProductRest(String prod_name, String prize, String prod_pic) {
		super();
		this.prod_name = prod_name;
		this.prize = prize;
		this.prod_pic = prod_pic;
	}



	public Integer getProduct_id() {
		return product_id;
	}
	
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public String getPrize() {
		return prize;
	}
	public void setPrize(String prize) {
		this.prize = prize;
	}
	public String getProd_pic() {
		return prod_pic;
	}
	public void setProd_pic(String prod_pic) {
		this.prod_pic = prod_pic;
	}
	
	@Override
	public String toString() {
		return "ProductRest [product_id=" + product_id + ", prod_name=" + prod_name + ", prize=" + prize + ", prod_pic="
				+ prod_pic + "]";
	}
	

}
