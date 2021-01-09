package com.Project.Ecommerce.data.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.Project.Ecommerce.data.Entity.Lookups;
import com.Project.Ecommerce.data.Repository.LookupRepo;

@Service
public class LookupService {
	@Autowired
	private LookupRepo lookupRepo;

	@Cacheable(value = "lookup")
	public List<Lookups> getLookups() {
		List<Lookups> lookups = lookupRepo
				.findByLookupTypeIn(Arrays.asList("Speciality", "FeesMin", "FeesMax", "Distance"));

		return lookups;
	}

	@CacheEvict(value = { "lookup" }, allEntries = true)
	public void evictCache() {

	}

}
