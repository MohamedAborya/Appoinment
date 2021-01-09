package com.Project.Ecommerce.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.Ecommerce.data.services.LookupService;

@RestController
@RequestMapping("v1.0/cache")
public class CacheController {
	@Autowired
	LookupService lookupService;

	@GetMapping("/clearCache")
	public ResponseEntity<?> evictCache() {
		lookupService.evictCache();
		return ResponseEntity.ok().build();
	}
}
