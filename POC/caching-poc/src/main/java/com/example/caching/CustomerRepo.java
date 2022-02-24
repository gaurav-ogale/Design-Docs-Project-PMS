package com.example.caching;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepo extends JpaRepository<Customer, String>{
	
	@Query(value = "Select * from customer where id = ?1", nativeQuery = true)
	public Customer getCust(String id);
	
	@Query(value = "Select * from customer where name = ?1", nativeQuery = true)
	public Customer getCustByName(String name);

	

}
