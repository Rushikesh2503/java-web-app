package com.webapp.shop.rest.control;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.webapp.shop.ui.model.CartRest;
import com.webapp.shop.ui.service.CartService;

@RestController
public class CartController {

	
	@Autowired
	private CartService cartService;
	
	 @PostMapping(value="/prod/cart")
	 public String loginUser(CartRest cart) {
		 try {
				String response= cartService.addProductinCart(cart);
				return response;
			} catch (Exception e) {
				e.printStackTrace();
				return "Failed To delete product";
			}
		 	
	 }
	 
	 @GetMapping(value="/prod/cart/view")
	 public String showUsers(@RequestParam(required = true,value="query")  Integer user_id) {
		 
		 try {
			 String response= cartService.showAllUsers(user_id);
			 return response;
			 
		 }catch(Exception e) {
			 return "failed to show users";
		 }
	 }
	 
	 @DeleteMapping(value="/product/delete")
	 public String deleteCartProduct(@RequestParam(required = true,value="userid")  Integer user_id,@RequestParam(required = true,value="productid") Integer product_id) {
		
		 try {
			String response= cartService.deleteMyProduct(user_id,product_id);
			return response;
		} catch (Exception e) {
			e.printStackTrace();
			return "Failed To delete product";
		}
		 
	 }
	 
	 @DeleteMapping(value= "/product/user/cart")
	 public String deleteCartProduct(@RequestParam(required = true,value="userid")  Integer user_id) {
			
		 try {
			String response= cartService.deleteAllCart(user_id);
			return response;
		} catch (Exception e) {
			e.printStackTrace();
			return "Failed To delete product";
		}
		 
	 }

}
