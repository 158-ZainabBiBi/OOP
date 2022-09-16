package com.webservice.order.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.webservice.customer.entity.Customer;
import com.webservice.customer.service.CustomerService;
@RestController
public class CustomerController 
{

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/customer")
	public String inCustomer() 
	{
		return "In Customer Controller of timetable webservice project!!! ";
	}
	
	@PostMapping("/customer/saveOne")
	public Customer saveOne(@RequestBody Customer customer) 
	{
		return customerService.saveOne(customer);
	}
	
	@PostMapping("/customer/saveMany")
	public List<Customer> saveMany(@RequestBody List<Customer> customers) 
	{
		return customerService.saveMany(customers);
	}
	
	@GetMapping("/customer/displayAllCustomers")
	public List<Customer> getOneCustomer() 
	{
		return customerService.getAll();
	}
	
	@GetMapping("/customer/displayOneCustomer/{id}")
	public Customer getOneCustomer(@PathVariable int id) 
	{
		return customerService.getOne(id);
	}
	
	@DeleteMapping("/customer/deleteOneCustomer/{id}")
	public String deleteOneCustomer(@PathVariable int id) 
	{
		customerService.deleteCustomer(id);
		return " Record with " + id + " is deleted!!!";
	}
	
	@PutMapping("/customer/updateOneCustomer")
	public Customer updateOneCustomer(@RequestBody  Customer customer) 
	{
		return customerService.saveOne(customer);
	}
}