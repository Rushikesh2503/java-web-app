package com.webapp.shop.ui.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.webapp.shop.ui.dao.UserDao;
import com.webapp.shop.ui.model.UserRest;

@Repository
public class UserDaoImpl implements UserDao{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public String addNewUser(UserRest users) {
		String query="insert into userdb (user_name,email,password) values('"+users.getUser_name()+"','"+users.getEmail()+"','"+users.getPassword()+"')";
		 
		jdbcTemplate.update(query);
		 
		 return "success";
	}

	@Override
	public String showUsers() {
		String ReqQuery="select * from userdb ;";
		
		List<UserRest>  users = new ArrayList<UserRest>();
		Gson gson = new Gson();
		  users = jdbcTemplate.query(ReqQuery,BeanPropertyRowMapper.newInstance(UserRest.class));
		  
		  List<UserRest> userList  = jdbcTemplate.query(ReqQuery,BeanPropertyRowMapper.newInstance(UserRest.class));
		  //System.err.println( gson.toJson(userList));
	      
		 gson.toJson(userList);
		 return gson.toJson(userList);
	}

	@Override
	public String updateUser(UserRest users) {
		 
		 String updateQuery="UPDATE userdb SET user_name='"+users.getUser_name()+"' WHERE user_id='"+users.getUser_id()+"'";
		 //System.err.println(updateQuery);
		 
		 jdbcTemplate.update(updateQuery);
		 
		 return "users Updated succesfully";
	}

	@Override
	public String deleteUser(UserRest users) {
		 jdbcTemplate.update("DELETE FROM userdb WHERE user_id=?",users.getUser_id());
		 
		 return "user deleted succesfully";
	}

	@Override
	public String loginUsers(UserRest users) {
		String query="select * from userdb where email ='"+users.getEmail()+"' and password ='"+users.getPassword()+"';";
		
		Gson gson = new Gson();
		  
		  List<UserRest> userList  = jdbcTemplate.query(query,BeanPropertyRowMapper.newInstance(UserRest.class));
	      
		 gson.toJson(userList);
		 return gson.toJson(userList);
	}

}
