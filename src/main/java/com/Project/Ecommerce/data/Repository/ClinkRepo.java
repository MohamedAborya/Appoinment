package com.Project.Ecommerce.data.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Project.Ecommerce.data.Entity.Clink;

public interface ClinkRepo extends JpaRepository<Clink, Long> {

	
//	List<Clink> findByDoctor(Long Doctor_ID);

}
