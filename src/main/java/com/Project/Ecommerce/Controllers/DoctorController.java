package com.Project.Ecommerce.Controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.Ecommerce.data.Entity.Clink;
import com.Project.Ecommerce.data.Entity.Doctor;
import com.Project.Ecommerce.data.Repository.ClinkRepo;
import com.Project.Ecommerce.data.services.DoctorService;
@RestController
@RequestMapping("v1.0/doctor")
public class DoctorController {
	
	@Autowired
	DoctorService doctorservice;
	
	@Autowired
	ClinkRepo clinkrepo;
	
@GetMapping("/{speciality}")
public List<Doctor> getDoctorwithSpeciality(@PathVariable("speciality") String speciality){
	
	return doctorservice.getDoctorListWithGivenSpecialty(speciality);
}	


@GetMapping("/{speciality}/{fees}")
public List<Doctor> getDoctorwithSpeciality(@PathVariable("speciality") String speciality,
		                                    @PathVariable("fees") double fees){
	
	return doctorservice.getDoctorListWithSpecialtyAndfees(speciality, fees);
}
@GetMapping("/{speciality}/{fees}/{long}/{lat}")
public List<Doctor> getDoctorwithSpeciality(@PathVariable("speciality") String speciality,
		                                    @PathVariable("fees") double fees,
		                                    @PathVariable("long") double long1,
		                                    @PathVariable("lat") double lat1){
	
	return doctorservice.getdoctor(speciality, fees,long1,lat1);
}	

//@GetMapping("/{id}")
//public List<Clink> getclinks(@PathVariable("id") Long id){
//	
//	return clinkrepo.findByDoctor(id);
//}	
}
