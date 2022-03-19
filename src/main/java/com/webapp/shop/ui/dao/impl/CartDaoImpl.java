package com.webapp.shop.ui.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.webapp.shop.ui.dao.CartDao;
import com.webapp.shop.ui.model.CartRest;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.google.gson.Gson;

@Repository
public class CartDaoImpl implements CartDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public String deleteMyProduct(Integer user_id, Integer product_id) {
		//System.err.println(user_id+" "+product_id);
		String query="DELETE FROM cartdatadb where user_id="+user_id+" and product_id="+product_id+";";
		
		jdbcTemplate.update(query);
		return "deleted one product with"+product_id+"";
	}

	@Override
	public String deleteAllCart(Integer user_id) {
		String query="DELETE FROM cartdatadb where user_id="+user_id+";";
		
		jdbcTemplate.update(query);
		return "deleted all cart product";
	}

	@Override
	public String addProductinCart(CartRest cart) {
		 String q="select * from cartdatadb where product_id ='"+cart.getProduct_id()+"' and user_id='"+cart.getUser_id()+"'";
		 System.err.println(q);
		 List<CartRest>  products = new ArrayList<CartRest>();
		Gson gson = new Gson();
		products = jdbcTemplate.query(q,BeanPropertyRowMapper.newInstance(CartRest.class));
			  
		List<CartRest> productList  = jdbcTemplate.query(q,BeanPropertyRowMapper.newInstance(CartRest.class));
		      
		gson.toJson(productList);
		
		if(productList.size()>0) {
			return "Product is Already Added In The Cart";
		}else {
			String query="insert into cartdatadb (product_id,prod_name, prize, prod_pic,user_id) values('"+cart.getProduct_id()+"','"+cart.getProd_name()+"','"+cart.getPrize()+"','"+cart.getProd_pic()+"','"+cart.getUser_id()+"')";
			
			jdbcTemplate.update(query);
			return "success";
		}
	}

	@Override
	public String showAllUsers(Integer user_id) {
		 System.err.println(user_id);
		 
			String ReqQuery="SELECT * FROM cartdatadb LEFT JOIN userdb ON userdb.user_id = cartdatadb.user_id where cartdatadb.user_id ='"+user_id+"' ;";
			
			List<CartRest>  products = new ArrayList<CartRest>();
			Gson gson = new Gson();
			products = jdbcTemplate.query(ReqQuery,BeanPropertyRowMapper.newInstance(CartRest.class));
			  
			  List<CartRest> productList  = jdbcTemplate.query(ReqQuery,BeanPropertyRowMapper.newInstance(CartRest.class));
			  //System.err.println( gson.toJson(productList));
		      
			 gson.toJson(productList);
			 return gson.toJson(productList);
	}

}
