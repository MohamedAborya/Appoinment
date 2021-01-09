package com.Project.Ecommerce.data.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Project.Ecommerce.data.Entity.Lookups;

@Repository
public interface LookupRepo extends JpaRepository<Lookups, Long> {

	List<Lookups> findByLookupTypeIn(List<String> lookupType);
}
