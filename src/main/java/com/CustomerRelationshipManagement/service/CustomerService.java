package com.CustomerRelationshipManagement.service;



import java.util.List;

import com.CustomerRelationshipManagement.entity.Customer;


public interface CustomerService  {

	String insertCustomer(Customer customer);

	List<Customer> getCustomersList();

	Customer getCustomerById(int id);
	
	String updateCustomer(Customer customer);
	
	String deleteCustomerById(int id);
	
	String insertMultipalCustomer(List<Customer> customers);
	
	List<Customer> getCustomerByFirstName(String firstName);

	List<Customer> getCustomerByLastName(String lastName);
	
	List<Customer> getCustomerByLessThenAge(int age);
	
	List<Customer> getCustomerByGreterThenAge(int age);
	
	List<Customer> getCustomerByAge(int age);
	
	List<Customer>getCustomerByEmail(String email);
	
	List<Customer>getCustomerByMobileNumber(String mobileNumber);
	
	String updateFirstName(int id,String firstName);
	
	String updateLastName(int id, String lastName);
	
	String updateEmail(int id ,String email);
	
	String updateMobleNumber(int id,String mobileNumber);
	
	String updateAge( int id,int age);
	
	List<String> getCustomersFirstName();
	
	List<String> getCustomersLastName();

}































