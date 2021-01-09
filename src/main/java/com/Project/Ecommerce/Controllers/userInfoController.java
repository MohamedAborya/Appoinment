package com.Project.Ecommerce.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.Ecommerce.DTO.LoginDto;
import com.Project.Ecommerce.DTO.StatusResponse;
import com.Project.Ecommerce.Utils.Utils;
import com.Project.Ecommerce.data.Entity.Users;
import com.Project.Ecommerce.data.services.userInfoService;
import com.Project.Ecommerce.exceptions.ApplicationException;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class userInfoController {
	
	@Autowired
	userInfoService userservice;
	
	@GetMapping("all")
	public List<Users> getAllusers(){
		
		return userservice.getUsers();
	}

	@GetMapping("user/{id}")
	public Users getbyid(@PathVariable Long id){
		
		return userservice.getById(id);
	}
	
	@PostMapping("signup")
	public ResponseEntity<?> addUser(@RequestBody Users userInfo)throws Exception {
		try {
		return ResponseEntity.ok(userservice.createUser(userInfo));
		}
		catch (ApplicationException e) {
			return new ResponseEntity<StatusResponse>(e.getStatus(),HttpStatus.BAD_REQUEST);
		}
		catch (Exception e) {
			return new ResponseEntity<StatusResponse>(Utils.internalServerError(e.getMessage()),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("login")
	public Users Login (@RequestBody LoginDto logindto){
		
		return userservice.checkuser(logindto);
	}
	@PutMapping("update")
	public void updateUser(@RequestBody Users userInfo) {
userservice.updateUser(userInfo);
}
	
	@DeleteMapping("delete/{id}")
	public void deleteUser(@PathVariable Long id) {
		userservice.deleteUser(id);
	}
	
	
}
