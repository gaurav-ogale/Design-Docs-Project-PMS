package com.example.caching;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;

@Service
@CacheConfig(cacheNames = {"customer"})
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepo repo;

	 private static final Logger LOG = (Logger) LoggerFactory.getLogger(CustomerService.class);

	    @Cacheable
	    @Override
	    public Customer getCustomer(String customerID) {
	        LOG.info("Trying to get customer information for id {} ",customerID);
	        return getCustomerData(customerID);
	    }
	    
	    @Cacheable
	    @Override
	    public Customer getCustomerName(String name) {
	        LOG.info("Trying to get customer information for id {} ",name);
	        return getCustomerByName(name);
	    }

	    private Customer getCustomerData(final String id){
	        Customer customer = repo.getCust(id);
	        return  customer;
	    }
	    
	    private Customer getCustomerByName(final String name){
	        Customer customer = repo.getCustByName(name);
	        return  customer;
	    }
}
