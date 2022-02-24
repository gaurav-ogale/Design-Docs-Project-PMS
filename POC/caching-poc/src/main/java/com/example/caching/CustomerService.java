package com.example.caching;

public interface CustomerService {
	
    Customer getCustomer(final String customerID);
    Customer getCustomerName(final String name) ;


}
