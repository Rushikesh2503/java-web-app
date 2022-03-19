package com.webapp.shop.ui.model;

public class CartRest {
	private Integer product_id;
	private String prod_name;
	private String prize;
	private String prod_pic;
	private Integer user_id;
	
	@Override
	public String toString() {
		return "CartRest [product_id=" + product_id + ", prod_name=" + prod_name + ", prize=" + prize + ", prod_pic="
				+ prod_pic + ", user_id=" + user_id + "]";
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
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

}
