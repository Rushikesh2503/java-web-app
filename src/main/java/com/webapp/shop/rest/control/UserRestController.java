package com.webapp.shop.rest.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.webapp.shop.ui.dao.UserDao;
import com.webapp.shop.ui.model.UserRest;

@RestController
public class UserRestController {

	@Autowired
	UserDao userDao;

	@PostMapping(value = "/add")
	public String addUser(UserRest users) {

		try {
			String response = userDao.addNewUser(users);
			return response;
		} catch (Exception e) {
			e.printStackTrace();
			return "failed to add user";
		}
	}

	@GetMapping(value = "/show")
	public String showUsers() {
		try {
			String response = userDao.showUsers();
			return response;
		} catch (Exception e) {
			e.printStackTrace();
			return "failed to show users";
		}

	}

	@PostMapping(value = "/update")
	public String updateUser(UserRest users) {

		try {
			String response = userDao.updateUser(users);
			return response;
		} catch (Exception e) {
			e.printStackTrace();
			return "failed to update user";
		}
	}

	@PostMapping(value = "/delete")
	public String deleteUser(UserRest users) {
		try {
			String response = userDao.deleteUser(users);
			return response;
		} catch (Exception e) {
			e.printStackTrace();
			return "failed to delete user";
		}

	}

	@PostMapping(value = "/user/login")
	public String loginUser(UserRest users) {

		try {
			String response = userDao.loginUsers(users);
			return response;
		} catch (Exception e) {
			e.printStackTrace();
			return "failed to update user";
		}

	}

}
