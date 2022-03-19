package com.webapp.shop.ui.dao;

public interface ProductDao {

	String getMenProducts();

	String getWomenProducts();

	String searchMenProduct(String txt);

	String searchWomenProduct(String txt);

}
