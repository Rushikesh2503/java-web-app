package com.webapp.shop.ui.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.shop.ui.dao.ProductDao;
import com.webapp.shop.ui.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductDao productDao;

	@Override
	public String getMenProducts() {
		String res=productDao.getMenProducts();
		return res;
	}

	@Override
	public String getWomenProducts() {
		String res=productDao.getWomenProducts();
		return res;
	}

	@Override
	public String searchMenProducts(String txt) {
		String res=productDao.searchMenProduct(txt);
		return res;
	}
	@Override
	public String searchWomenProducts(String txt) {
		String res=productDao.searchWomenProduct(txt);
		return res;
	}

}
