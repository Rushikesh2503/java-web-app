package com.webapp.shop.rest.control;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.webapp.shop.ui.dao.DatatableDao;
import com.webapp.shop.ui.model.CartRest;
import com.webapp.shop.ui.model.DataTable;
import com.webapp.shop.ui.model.DataTableResponse;
import com.webapp.shop.ui.model.MyDataTable;


@RestController
public class DataTableC {
	
	@Autowired
	 private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private DatatableDao datatableDao;
	
	
	@PostMapping(value="/datatable/add")
	 public DataTableResponse getData(@RequestBody DataTable dataTable,
				@RequestParam(name = "search", required = false) String search,
				@RequestParam(name = "filter", required = false) String filter,
				@RequestParam(required = false, name = "limit", defaultValue = "20") Integer limit,
				@RequestParam(required = false, name = "offset", defaultValue = "0") Integer offset
				){
		
		try {
			DataTableResponse response = datatableDao.getAllUsers(dataTable,search, filter,limit,offset);
			System.out.println("CONTROLLER_TRY");
			return response;
		} catch (Exception e) {
			System.err.println("EXCEP");
			return null;
		}
	};
	
	@GetMapping(value="/data/datatable/get")
	 public String showUsers() {
		 
		String ReqQuery="select * from mytable ;";
		
		List<MyDataTable>  myprod = new ArrayList<MyDataTable>();
		Gson gson = new Gson();
		myprod = jdbcTemplate.query(ReqQuery,BeanPropertyRowMapper.newInstance(MyDataTable.class));
		  
		  List<MyDataTable> productList  = jdbcTemplate.query(ReqQuery,BeanPropertyRowMapper.newInstance(MyDataTable.class));
		  System.err.println( gson.toJson(productList));
	      
		 gson.toJson(productList);
		 return gson.toJson(productList);
	 }

}
