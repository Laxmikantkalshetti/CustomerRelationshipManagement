package com.CustomerRelationshipManagement.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.query.Query;
import com.CustomerRelationshipManagement.entity.Customer;





@Repository
public class CustomerDao {

	
		//database ka code
//	@Autowired
	SessionFactory sf;


	//constructor injection
		public CustomerDao(SessionFactory sf) {
			super();
			this.sf = sf;
		}
		
		public String insertCustomer(Customer customer) {
			Session session= sf.openSession();
			Transaction transaction =session.beginTransaction();
			//insert,update,delete -> you need to transaction
			//save nam ka method session
			session.save(customer);// to insert data
			transaction.commit();
			session.close();
			
			return"Customer Insert successfully";
		}
	
		public List<Customer> getCustomersList() {
			Session session =	sf.openSession();
			return	session.createQuery("from Customer").list();
		
		}
		
		public Customer getcustomerById(int id) {
			//get -> it will return null if object not found in db
			//load -> it will return objectNotfoundException if object not found
			Session session = sf.openSession();
			Customer customer = session.get(Customer.class, id);
			
			return customer;
		}
		
		public String updateCustomer(Customer customer) {
			
			Session session = sf.openSession();
			 Transaction transaction= session.beginTransaction(); 
			session.update(customer);
			transaction.commit();
			session.close();
			
			return" Customer Updated Successfully";
		}
		
		
		public String deleteCustomerById(int id) {
			Session session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			Customer customer = session.get(Customer.class, id);
			session.delete(customer);
			transaction.commit();
			session.close();
			
			return" Customer Deleted Successfully";
		}
		
		public String insertMultipalCustomer(List<Customer> customers) {
			Session session = sf.openSession();
			Transaction  transaction = session.beginTransaction();
			for (Customer customer : customers) {
				
				session.save(customer);
			}
			transaction.commit();
			session.close();
			
			return " Multipal Customer Added Successfully";
		}
		
		
		public List<Customer> getCustomerByFirstName( String firstName){
			Session session =sf.openSession();
			Query<Customer>customer	= session.createQuery("from Customer c where c.firstName =:firstName ",Customer.class);
			customer.setParameter("firstName", firstName);
			List<Customer> list = customer.list();
			return list;
		}
		
		
		public List<Customer> getCustomerByLastName(String lastName){
			Session session= sf.openSession();
			//Customer is entity Class name not table name
			Query<Customer>customers= session.createQuery("from Customer c where c.lastName =:lastName",Customer.class);
			customers.setParameter("lastName", lastName);
			List<Customer>list=customers.list();
			return list;
		}
		
		public List<Customer> getCustomerByLessThanAge(int age){
			Session session = sf.openSession();
			Query<Customer> query = session.createQuery("from Customer c where c.age <: age",Customer.class);
			query.setParameter("age", age);
			List<Customer>list=query.list();
			return list;
		}
		
		
		public List<Customer> getCustomerByGreterThanAge(int age){
			Session session = sf.openSession();
			Query<Customer> query = session.createQuery("from Customer c where c.age >: age",Customer.class);
			query.setParameter("age", age);
			List<Customer>list=query.list();
			return list;
		}
		
		public List<Customer>getCustomerByAge(int age){
			Session session = sf.openSession();
			String hql = "from Customer c where c.age = :age";
			Query<Customer> query= session.createQuery(hql,Customer.class);
			query.setParameter("age", age);
			List<Customer>list = query.list();
			return list;
			
		}
		
		public List<Customer> getCustomerByEmail(String email) {
			
			Session session = sf.openSession();
			String hql = "From Customer c where c.email =:email ";
			 Query< Customer> query = session.createQuery(hql,Customer.class);
			query.setParameter("email", email);
			List< Customer> customers = query.list();
			return customers;
			
		}
		
		public List<Customer> getCustomerByMobileNumber(String mobileNumber ) {
			
			Session session = sf.openSession();
			String hql = "From Customer c where c.mobileNumber =:mobileNumber ";
			 Query< Customer> query = session.createQuery(hql,Customer.class);
			query.setParameter("mobileNumber", mobileNumber);
			List< Customer> customers = query.list();
			return customers;
			
		}
		
		public String updateFirstName(int id,String firstName) {
			
			Session session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			Customer customer = session.get(Customer.class,id);
			customer.setFirstName(firstName);
			transaction.commit();
			session.close();
			
			return "Updated Successfully FirstName";
		}
		
		
		public String updateLastName(int id,String lastName) {
			
			Session session = sf.openSession();
			Transaction transaction= session.beginTransaction();
			 Customer customer = session.get(Customer.class,id);
			 customer.setLastName(lastName);
			 transaction.commit();
			 session.close();
			 
			 return" Updated Successfully LastName";
		}
		
		public String updateEmail(int id ,String email) {
			Session session = sf.openSession();
			 Transaction transaction = session.beginTransaction();
			 Customer customer = session.get(Customer.class, id);
			 customer.setEmail(email);
			 transaction.commit();
			 session.close();
			 
			 return"Email Updated Successfully";
		}
		
		public String updateMobileNumber(int id, String mobileNumber) {
			
			Session session = sf.openSession();
			Transaction tr = session.beginTransaction();
			Customer customer = session.get(Customer.class, id);
			customer.setMobileNumber(mobileNumber);
			tr.commit();
			session.close();
			
			return " Mobile Number Updated Successfully";
			
		}
		
		
		public String updateAge(int id,int age) {
			
			Session session = sf.openSession();
			Transaction tr = session.beginTransaction();
			Customer customer = session.get(Customer.class, id);
			customer.setAge(age);
			tr.commit();
			session.close();
			
			return "Age Updated Successfully";
			
		}
		
		public List<String> getCustomersFirstName(){
			
			Session session = sf.openSession();
			return session.createQuery("select c.firstName from Customer c").list();
		}
		
		
		
public List<String> getCustomersLastName(){
			
			Session session = sf.openSession();
			return session.createQuery("select c.lastName from Customer c").list();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}























































