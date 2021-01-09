package com.Project.Ecommerce.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.Ecommerce.data.Entity.Lookups;
import com.Project.Ecommerce.data.services.LookupService;

@RestController
@RequestMapping("/v1.0/lookup")
public class LookupController {
	@Autowired
	LookupService lookupService;
	
	@GetMapping
	public ResponseEntity<?> getLookups(){
		
		return new ResponseEntity<List<Lookups>>(lookupService.getLookups(),HttpStatus.OK);
	}

}
