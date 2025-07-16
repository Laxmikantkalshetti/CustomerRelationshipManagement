package com.CustomerRelationshipManagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.CustomerRelationshipManagement.dao.CustomerDao;
import com.CustomerRelationshipManagement.entity.Customer;

@Service
public  class CustomerServiceImplement implements CustomerService {

	CustomerDao customerDao;

	public CustomerServiceImplement(CustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}
	
	public String insertCustomer(Customer customer) {
		
		String msg = customerDao.insertCustomer(customer);
		return msg;
	}

	@Override
	public List<Customer> getCustomersList() {
		
		return customerDao.getCustomersList();
		
	}

	@Override
	public Customer getCustomerById(int id) {
		
		Customer customer = customerDao.getcustomerById(id);
		return customer;
	}

	@Override
	public String updateCustomer(Customer customer) {
		
		return customerDao.updateCustomer(customer);
	}

	@Override
	public String deleteCustomerById(int id) {
	   
		return customerDao.deleteCustomerById(id) ;
	}

	@Override
	public String insertMultipalCustomer(List<Customer> customers) {
		
		return customerDao.insertMultipalCustomer(customers);
	}

	@Override
	public List<Customer> getCustomerByFirstName(String firstName) {
		
		return customerDao.getCustomerByFirstName(firstName);
	}

	@Override
	public List<Customer> getCustomerByLastName(String lastName) {
		
		return customerDao.getCustomerByLastName(lastName);
	}

	@Override
	public List<Customer> getCustomerByLessThenAge(int age) {
		
		return customerDao.getCustomerByLessThanAge(age);
	}

	@Override
	public List<Customer> getCustomerByGreterThenAge(int age) {
		
		return customerDao.getCustomerByGreterThanAge(age);
	}

	@Override
	public List<Customer> getCustomerByAge(int age) {
		
		return customerDao.getCustomerByAge(age);
	}

	@Override
	public List<Customer> getCustomerByEmail(String email) {
		
		return customerDao.getCustomerByEmail(email);
	}

	@Override
	public List<Customer> getCustomerByMobileNumber(String mobileNumber) {
		
		return customerDao.getCustomerByMobileNumber(mobileNumber);
	}

	@Override
	public String updateFirstName(int id, String firstName) {
		return customerDao.updateFirstName(id, firstName);
	}

	@Override
	public String updateLastName(int id, String lastName) {
		
		return customerDao.updateLastName(id, lastName);
	}

	@Override
	public String updateEmail(int id, String email) {
	
		return customerDao.updateEmail(id, email);
	}

	@Override
	public String updateMobleNumber(int id, String mobileNumber) {
		
		return customerDao.updateMobileNumber(id, mobileNumber);
	}

	@Override
	public String updateAge(int id, int age) {
		
		return customerDao.updateAge(id, age);
	}

	@Override
	public List<String> getCustomersFirstName() {
		
		return customerDao.getCustomersFirstName();
	}

	@Override
	public List<String> getCustomersLastName() {
		
		return customerDao.getCustomersLastName();
	}

	
	
}































