package com.Project.Ecommerce.data.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.Project.Ecommerce.data.Entity.Doctor;
import java.lang.String;

@Repository
public interface DoctorRepo extends JpaRepository<Doctor, Long> {
	
	
	List<Doctor> findBySpeciality(String speciality);
	
	
	List<Doctor> findBySpecialityAndFeesLessThanEqual(String speciality, double fees);

	@Query(value= "Select  * FROM doctor_info d right JOIN clink_address c ON d.Doctor_ID = c.Doctor_ID "
			       + "WHERE d.speciality = :speciality "
		        	+ "&& d.fees =:fees &&"
			       +  " (   6378.8 * acos(cos(radians(c.Clink_latitude)) * "
		        	+ "   cos(radians(:lat1)) * " + 
			"   cos(radians(c.Clink_longitude) - " + 
			"   radians(:long1)) + " + 
			"   sin(radians(c.Clink_latitude)) * " + 
			"   sin(radians(:lat1 )))" + 
			") >5"
			,nativeQuery=true)
	List<Doctor> finddoctor(@Param(value = "speciality") String speciality,
         	                @Param(value = "fees") double fees,
                         	@Param(value = "long1") double long1,
                        	@Param(value = "lat1") double lat1);
}
