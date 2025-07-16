package com.CustomerRelationshipManagement.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CustomerRelationshipManagement.entity.Customer;
import com.CustomerRelationshipManagement.service.CustomerService;



@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	
	CustomerService customerService;

public CustomerController(CustomerService customerService) {
	super();
	this.customerService = customerService;
}
	@PostMapping("/insert")
	public String insertCustomer(@RequestBody Customer customer) {
		String msg = customerService.insertCustomer(customer);
		return msg;
	}
	
	
	@GetMapping
	public List<Customer> getCustomersList(){
		List< Customer>list = customerService.getCustomersList();
		return list;
	}
	
	@GetMapping("/{id}")
	public Customer getCustomerById(@PathVariable int id) {
		return customerService.getCustomerById(id);
		
	}
	
	@PutMapping
	public String updateCustomer(@RequestBody Customer customer) {
		 return customerService.updateCustomer(customer);
	}
	
	@DeleteMapping("/{id}")
	public String deleteCustomerById(@PathVariable int id) {
		return customerService.deleteCustomerById(id);
	}
	
	@PostMapping
	public String insertMultipalCustomer(@RequestBody List<Customer>customers) {
		return customerService.insertMultipalCustomer(customers);
	}
	
	@GetMapping("/byname/{firstName}")
	public List<Customer> getCustomerByFirstName(@PathVariable String firstName){
		
		return customerService.getCustomerByFirstName(firstName);
	}
	
	@GetMapping("/bylastname/{lastName}")
	public List<Customer> getCustomerByLastName(@PathVariable String lastName){
		return customerService.getCustomerByLastName(lastName);
	}
	
	@GetMapping("/bylessage/{age}")
	public List<Customer> getCustomerByLessThenAge(@PathVariable int age){
		return customerService.getCustomerByLessThenAge(age);
	}
	
	@GetMapping("/bygreterage/{age}")
	public List<Customer> getCustomerByGreterThenAge(@PathVariable int age){
		return customerService.getCustomerByGreterThenAge(age);
	}
	
	@GetMapping("/byage/{age}")
	public List<Customer>getCustomerByAge(@PathVariable int age){
		
		return customerService.getCustomerByAge(age);
	}

	
	@GetMapping("/byemail/{email}")
	public List<Customer>getCustomerByEmail(@PathVariable String email){
		
		return customerService.getCustomerByEmail(email);
	}
	
	@GetMapping("/bymobile/{mobileNumber}")
	public List<Customer>getCustomerByMobileNumber(@PathVariable String mobileNumber){
		return customerService.getCustomerByMobileNumber(mobileNumber);
	}
	
	@PutMapping("/firstname/{id}")
	public String upateFirstName(@PathVariable int id,@RequestBody Map<String, String> request) {
		
	   String firstName =	request.get("firstName");
	   return customerService.updateFirstName(id, firstName);
	}
	
	@PutMapping("/lastname/{id}")
	public String updateLastName(@PathVariable int id, @RequestBody Map<String, String>request) {
		
		String lastName = request.get("lastName");
		return customerService.updateLastName(id, lastName);
	}
	
	@PutMapping("/email/{id}")
	public String updateEmail( @PathVariable int id , @RequestBody Map<String, String>request) {
		
		String email = request.get("email");
		return customerService.updateEmail(id, email);
	}
	
	@PutMapping("/mobile/{id}")
	public String updateMobileNumber(@PathVariable int id , @RequestBody Map<String, String>resquest) {
		
		String mobileNumber = resquest.get("mobileNumber");
		return customerService.updateMobleNumber(id, mobileNumber);
	}
	
	@PutMapping("/age/{id}")
	public String updateAge(@PathVariable int id,@RequestBody Map<String, Integer> request) {
	 int age =	request.get("age");
		return customerService.updateAge(id, age);
	}
	
	@GetMapping("/firstnames")
	public List<String>getCustomersFirstName(){
		
		return customerService.getCustomersFirstName();
	} 
	
	@GetMapping("/lastnames")
	public List<String>getCustomersLastName(){
		
		return customerService.getCustomersLastName();
	}
}






















































































