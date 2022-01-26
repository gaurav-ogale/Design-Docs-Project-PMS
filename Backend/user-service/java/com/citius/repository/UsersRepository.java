package com.citius.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.citius.models.User;

public interface UsersRepository extends JpaRepository<User, Long> {
	
	@Query(value = "select * from users u where u.user_email = ?1", nativeQuery = true)
	User getUserWithEmail(String username);

}
