package com.Project.Ecommerce.Controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Project.Ecommerce.data.Entity.GeoIp;
import com.Project.Ecommerce.data.services.RawDBDemoGeoIPLocationService;

@RestController
@RequestMapping(value="GeoIPTest")
public class GeoIPTestController {

	private RawDBDemoGeoIPLocationService locationService;

	@Autowired
	public GeoIPTestController() throws IOException {
		locationService = new RawDBDemoGeoIPLocationService();
	}

	@GetMapping
	public GeoIp getLocation(@RequestParam(value = "ipAddress", required = true) String ipAddress) throws Exception {

		RawDBDemoGeoIPLocationService locationService = new RawDBDemoGeoIPLocationService();
//		return locationService.getLocation(ipAddress);
		
		return locationService.getLocation(ipAddress);

	}
}
