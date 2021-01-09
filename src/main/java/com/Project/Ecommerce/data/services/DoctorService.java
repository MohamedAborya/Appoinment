package com.Project.Ecommerce.data.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.Ecommerce.data.Entity.Doctor;
import com.Project.Ecommerce.data.Entity.Lookups;
import com.Project.Ecommerce.data.Repository.DoctorRepo;

@Service
public class DoctorService {

	@Autowired
	private DoctorRepo doctorrepo;
	@Autowired
	private LookupService lookupService;

	public List<Doctor> getDoctorListWithGivenSpecialty(String speciality) {
		return doctorrepo.findBySpeciality(speciality);
	}

	public List<Doctor> getDoctorListWithSpecialtyAndfees(String speciality, double fees) {
		if (validateAgainstLookups(speciality, fees)) {
			return doctorrepo.findBySpecialityAndFeesLessThanEqual(speciality, fees);
		}
		return null;
	}
	public List<Doctor> getdoctor(String speciality, double fees,double long1,double lat1) {
		if (validateAgainstLookups(speciality, fees)) {
			return doctorrepo.finddoctor(speciality, fees, long1, lat1);
		}
		return null;
	}

	private boolean validateAgainstLookups(String speciality, double fees) {

		List<Lookups> myLookups = lookupService.getLookups();
		List<String> specialities = myLookups.stream().filter(look -> look.getLookupType().equals("Speciality"))
				.map(Lookups::getLookupValue).collect(Collectors.toList());
		double miniFees = Double.parseDouble(myLookups.stream().filter(look -> look.getLookupType().equals("FeesMin"))
				.findFirst().map(Lookups::getLookupValue).get());

		
		double maxFees = Double.parseDouble(myLookups.stream().filter(look -> look.getLookupType().equals("FeesMax"))
				.findFirst().map(Lookups::getLookupValue).get());

		if (!specialities.contains(speciality) || !(fees >= miniFees) || !(fees <= maxFees))
			return false;

		else
			return true;
	}
	
	
	
}
