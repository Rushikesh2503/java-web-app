package com.webapp.shop.ui.dao;

import com.webapp.shop.ui.model.UserRest;

public interface UserDao {

	String addNewUser(UserRest users);

	String showUsers();

	String updateUser(UserRest users);

	String deleteUser(UserRest users);

	String loginUsers(UserRest users);

}
