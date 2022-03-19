package com.webapp.shop.ui.service;

public interface ProductService {

	String getMenProducts();

	String getWomenProducts();

	String searchMenProducts(String txt);
	
	String searchWomenProducts(String txt);
}
