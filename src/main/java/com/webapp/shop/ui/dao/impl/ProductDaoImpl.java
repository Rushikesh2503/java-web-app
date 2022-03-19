package com.webapp.shop.ui.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.webapp.shop.ui.dao.ProductDao;
import com.webapp.shop.ui.model.ProductRest;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public String getMenProducts() {
		String ReqQuery = "select * from productdb;";

		Gson gson = new Gson();

		List<ProductRest> productList = jdbcTemplate.query(ReqQuery,
				BeanPropertyRowMapper.newInstance(ProductRest.class));
		// System.err.println( gson.toJson(productList));

		gson.toJson(productList);
		return gson.toJson(productList);
	}

	@Override
	public String getWomenProducts() {
		String ReqQuery = "select * from productwdb;";

		Gson gson = new Gson();

		List<ProductRest> productList = jdbcTemplate.query(ReqQuery,
				BeanPropertyRowMapper.newInstance(ProductRest.class));
		// System.err.println( gson.toJson(productList));

		gson.toJson(productList);
		return gson.toJson(productList);
	}

	@Override
	public String searchMenProduct(String txt) {
		String ReqQuery = "select * from productdb where prod_name ilike '%"+txt+"%';";

		Gson gson = new Gson();

		List<ProductRest> productList = jdbcTemplate.query(ReqQuery,
				BeanPropertyRowMapper.newInstance(ProductRest.class));
		// System.err.println( gson.toJson(productList));

		gson.toJson(productList);
		return gson.toJson(productList);
	}
	
	@Override
	public String searchWomenProduct(String txt) {
		String ReqQuery = "select * from productwdb where prod_name ilike '%"+txt+"%';";

		Gson gson = new Gson();

		List<ProductRest> productList = jdbcTemplate.query(ReqQuery,
				BeanPropertyRowMapper.newInstance(ProductRest.class));
		// System.err.println( gson.toJson(productList));

		gson.toJson(productList);
		return gson.toJson(productList);
	}

}
