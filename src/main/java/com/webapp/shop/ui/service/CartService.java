package com.webapp.shop.ui.service;

import com.webapp.shop.ui.model.CartRest;

public interface CartService {
	
	String deleteMyProduct(Integer user_id, Integer product_id);

	String deleteAllCart(Integer user_id);

	String addProductinCart(CartRest cart);

	String showAllUsers(Integer user_id);
}
