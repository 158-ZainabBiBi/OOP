package com.webservice.order.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.webservice.customer.repository.CustomerRepository;
import com.webservice.customer.entity.Customer;

@Service
public class CustomerService 
{
	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer saveOne(Customer customer) 
	{
		return customerRepository.save(customer);
	}
	
	public List<Customer> saveMany(List<Customer> customers) 
	{
		return customerRepository.saveAll(customers);
	}
	
	public List<Customer> getAll() 
	{
		return customerRepository.findAll();
	}
	
	public Customer getOne(int id) 
	{
		return customerRepository.findById(id).orElse(null);
	}
	public void deleteCustomer(int id) 
	{
		customerRepository.deleteById(id); 
	}
	public Customer updateCustomer(Customer customer) 
	{
		Customer existingCustomer = customerRepository.findById(customer.getCUSTOMER_ID()).orElse(null);
		existingCustomer.setCUSTOMER_NAME(customer.getCUSTOMER_NAME());
		existingCustomer.setCUSTOMER_MOBILE(customer.getCUSTOMER_MOBILE());
		existingCustomer.setCUSTOMER_EMAIL(customer.getCUSTOMER_EMAIL());
		existingCustomer.setCUSTOMER_ADDRESS(customer.getCUSTOMER_ADDRESS());
		return customerRepository.save(existingCustomer);
	}

}
