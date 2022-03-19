package com.webapp.shop.rest.control;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Jdbc;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.javafaker.Faker;
import com.google.gson.Gson;
import com.webapp.shop.ui.model.MyDataTable;
import com.webapp.shop.ui.model.ProductRest;
import com.webapp.shop.ui.model.UserRest;
import com.webapp.shop.ui.service.ProductService;

@RestController
public class ProductRestController {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	ProductService productService;
	

	 @GetMapping(value="/product/men")
	 public String showMenProducts() {
		 
		 try {
			String response=productService.getMenProducts();
			 return response;
		} catch (Exception e) {
			e.printStackTrace();
			return "failed to get men products";
		}
		 
	 }
	 
	 @GetMapping(value="/product/mens")
	 public String searchMenProducts(@RequestParam(required = true,value="search") String txt) {
		 try {
			String response=productService.searchMenProducts(txt);
			 return response;
		} catch (Exception e) {
			e.printStackTrace();
			return "failed to get men products";
		}
		 
	 }
	
	 @GetMapping(value="/product/women")
	 public String showWomenProducts() {
		 
		 try {
				String response=productService.getWomenProducts();
				 return response;
			} catch (Exception e) {
				e.printStackTrace();
				return "failed to get men products";
			}

		
	 }
	 
	 @GetMapping(value="/product/womens")
	 public String searchWomenProducts(@RequestParam(required = true,value="search") String txt) {
		 try {
			String response=productService.searchWomenProducts(txt);
			 return response;
		} catch (Exception e) {
			e.printStackTrace();
			return "failed to get men products";
		}
		 
	 }
	 
	 
//	 @GetMapping(value="/product/insert")
//	 public String insertProduct() {
//		for(int i=0;i<65000;i++) {
//			 try {
//				Faker f= Faker.instance();
//				 ProductRest p= new ProductRest(f.name().firstName(), f.number().numberBetween(100, 20000)+"", f.internet().avatar());
//				 
//				 String q="INSERT INTO product (prod_name, prize, prod_pic) VALUES('"+p.getProd_name()+"','"+p.getPrize()+"','"+p.getProd_pic()+"')";
//				 
//				 jdbcTemplate.update(q);
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			 
//		}
//		 
//		 
//		 return "success";
//	 }
//	 
//	 
//	 @GetMapping(value="/data/insert")
//	 public String insertData() throws ParseException {
//		Date fr=new Date();
//		String sDate1="31/12/2025";  
//	    Date frto=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
//		 System.err.println(fr+" NEW    "+frto);
//		 
//		for(int i=0;i<5000;i++) {
//			 try {
//				Faker f= Faker.instance();
//				MyDataTable tb= new MyDataTable(f.date().between(fr, frto),f.date().between(fr, frto), f.bool().bool(), f.number().numberBetween(1, 10000), f.name().name(), f.commerce().department());
//				 
//				String q="INSERT INTO mytable (created_at, updated_at, is_active,price,name,department) VALUES('"+tb.getCreatedAt()+"','"+tb.getUpdatedAt()+"',"+tb.isIs_active()+","+tb.getPrice()+",'"+tb.getName()+"','"+tb.getDepartment()+"')";
//				 
//				 jdbcTemplate.update(q);
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			 
//		}
//		 
//		 
//		 return "success";
//	 }
	
	
	
	
}
