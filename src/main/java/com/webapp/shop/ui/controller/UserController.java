package com.webapp.shop.ui.controller;

import java.awt.PageAttributes.MediaType;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.shop.ui.model.UserRest;
import com.webapp.shop.ui.model.request.UserDetailsRequestModel;

@RestController
@RequestMapping("users")
public class UserController {

	Map<String, UserRest> users;

	@GetMapping
	public Map<String, UserRest> getUsers(@RequestParam(value = "page", defaultValue = "1") int page,
			@RequestParam(value = "limit", defaultValue = "50") int limit) {
		return users;
	}

	@GetMapping(path = "/{userId}")
	public ResponseEntity<UserRest> getUser(@PathVariable String userId) {
		if (users.containsKey(userId)) {
			return new ResponseEntity<>(users.get(userId), HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}

		
	}

	@PostMapping
	public ResponseEntity<UserRest> createUser(@Validated @RequestBody UserDetailsRequestModel userDetails) {
		UserRest returnVal = new UserRest();

		returnVal.setUser_name(userDetails.getName());
		returnVal.setEmail(userDetails.getEmail());
		returnVal.setPassword(userDetails.getPassword());

		//String userId = UUID.randomUUID().toString();
		//returnVal.setUserId(userId);
		if (users == null) {
			users = new HashMap<>();
		}
		//users.put(userId, returnVal);

		return new ResponseEntity<UserRest>(returnVal, HttpStatus.OK);
	}

	@PutMapping(path = "/{userId}")
	public UserRest updateUser(@PathVariable String userId,@RequestBody UserDetailsRequestModel userDetails) {
		UserRest storedUserDetails=users.get(userId);
		storedUserDetails.setUser_name(userDetails.getName());
		users.put(userId, storedUserDetails);
		
		return storedUserDetails;
	}

	@DeleteMapping(path = "/{userId}")
	public ResponseEntity<Void> deleteUser(@PathVariable String userId) {
		users.remove(userId);
		return ResponseEntity.noContent().build();
	}

}
