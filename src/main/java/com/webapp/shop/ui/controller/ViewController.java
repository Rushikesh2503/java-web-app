package com.webapp.shop.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
	
	@GetMapping("/")
	public String registerPage() {
		
		return "login";
		
	}
	@GetMapping("/register")
	public String loginPage() {
		
		return "index";
		
	}
	@GetMapping("/men")
	public String menPage() {
		
		return "men";
		
	}
	@GetMapping("/women")
	public String womenPage() {
		
		return "women";
		
	}
	@GetMapping("/offers")
	public String offersPage() {
		
		return "offers";
		
	}
	@GetMapping("/carts")
	public String cartsPage() {
		
		return "carts";
		
	}
	@GetMapping("/payment")
	public String PaymentPage() {
		
		return "payment";
		
	}
	
	@GetMapping("/datatable")
	public String DataTablePage() {
		
		return "datatable";
		
	}
	
	@GetMapping("/home")
	public String homePage() {
		
		return "home";
		
	}
	
	
	

}