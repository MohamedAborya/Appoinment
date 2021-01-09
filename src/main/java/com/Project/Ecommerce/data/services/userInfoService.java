package com.Project.Ecommerce.data.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.Project.Ecommerce.DTO.LoginDto;
import com.Project.Ecommerce.DTO.StatusResponse;
import com.Project.Ecommerce.data.Entity.Users;
import com.Project.Ecommerce.data.Repository.userInfoRepository;
import com.Project.Ecommerce.exceptions.ApplicationException;


@Service
public class userInfoService {
	
	@Autowired
	userInfoRepository userRepo;
	
	public List<Users> getUsers(){
		
		return userRepo.findAll();
	}
	
	public Users getById(Long id){
		
		return userRepo.findById(id).get();
	}
	
	public Users createUser(Users user) throws Exception{
		
		try{
			if(user.getId()!=null)
				user.setId(0L);
		return userRepo.save(user); 
		}
		catch(DataIntegrityViolationException e){
			
			throw new ApplicationException(new StatusResponse("400",""
					+ "email duplication","email found, try another one "));
		}
		catch (Exception e) {
			
			throw new Exception();
		}
	} 
	
	public Users checkuser(LoginDto logindto){
		
		return userRepo.findUserByEmailAndPassword(logindto.getEmail(),logindto.getPassword()); 
	}
	
	public Users updateUser(Users user){
		return userRepo.save(user);
	}
	
	public void deleteUser(Long id){
		 userRepo.deleteById(id);
	}

}
