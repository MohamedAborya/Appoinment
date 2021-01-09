package com.Project.Ecommerce.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.Ecommerce.data.Entity.Employee;
import com.Project.Ecommerce.data.services.EmpService;

@RestController
@RequestMapping(path="/employees")
public class EmpController {
	
	@Autowired
	EmpService empService;
	
	@PostMapping
	public ResponseEntity<?> addEmployee(@RequestBody Employee emp){
		
		return ResponseEntity.ok(empService.addEmployee(emp));
		
		
	}
	@PutMapping
	public ResponseEntity<?> editeEmployee(@RequestBody Employee emp)throws Exception{
		
		return ResponseEntity.ok(empService.editeStatus(emp));
		
	}
	

}
