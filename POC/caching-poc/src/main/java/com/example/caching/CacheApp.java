package com.example.caching;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CacheApp implements CommandLineRunner{
	
	 private static final Logger LOG = LoggerFactory.getLogger(CacheApp.class);

	 @Autowired
	 CustomerService customerService;

	 @Override
	 public void run(String...args) throws Exception {

	  LOG.info("Starting the Caffine cache testing process");
	  System.out.println("first hit" + customerService.getCustomer("101")); //No hit , since this is the first request.
	  customerService.getCustomer("102"); //No hit , since this is the first request.
	  System.out.println("second hit" + customerService.getCustomer("101")); //hit , since it is already in the cache.
	  customerService.getCustomer("101"); //hit , since it is already in the cache.
	  customerService.getCustomer("101"); //hit , since it is already in the cache.
	  customerService.getCustomer("101"); //hit , since it is already in the cache.
	  customerService.getCustomerName("test1");
	  customerService.getCustomerName("test1");
	  customerService.getCustomerName("test1");

	 }

}
