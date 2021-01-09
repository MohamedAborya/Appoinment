package com.Project.Ecommerce.data.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Project.Ecommerce.data.Entity.Users;

@Repository
public interface userInfoRepository extends JpaRepository<Users, Long> {

	@Query
	("select u from Users u where u.email=?1 AND u.password=?2")
	public Users findUserByEmailAndPassword(String email ,String password);
}
