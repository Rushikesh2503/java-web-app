package com.webapp.shop.ui.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.shop.ui.dao.CartDao;
import com.webapp.shop.ui.model.CartRest;
import com.webapp.shop.ui.service.CartService;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	CartDao cartDao;
	
	@Override
	public String deleteMyProduct(Integer user_id, Integer product_id) {
		
		try {
			String res= cartDao.deleteMyProduct(user_id, product_id);
			return res;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "failed to delete product in service";
	}

	@Override
	public String deleteAllCart(Integer user_id) {
		try {
			String res= cartDao.deleteAllCart(user_id);
			return res;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "failed to delete all cart in service";
	}

	@Override
	public String addProductinCart(CartRest cart) {
		try {
			String res=cartDao.addProductinCart(cart);
			return res;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "failed to add product";
	}

	@Override
	public String showAllUsers(Integer user_id) {
		try {
			String res=cartDao.showAllUsers(user_id);
			return res;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "users not showing error";
		}
		
	}

}
