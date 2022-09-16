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
import com.webservice.product.entity.Product;
import com.webservice.product.service.ProductService;
@RestController
public class ProductController 
{

	@Autowired
	private ProductService productService;
	
	@RequestMapping("/product")
	public String inProduct() 
	{
		return "In Product Controller of timetable webservice project!!! ";
	}
	
	@PostMapping("/product/saveOne")
	public Product saveOne(@RequestBody Product product) 
	{
		return productService.saveOne(product);
	}
	
	@PostMapping("/product/saveMany")
	public List<Product> saveMany(@RequestBody List<Product> products) 
	{
		return productService.saveMany(products);
	}
	
	@GetMapping("/product/displayAllProducts")
	public List<Product> getOneProduct() 
	{
		return productService.getAll();
	}
	
	@GetMapping("/product/displayOneProduct/{id}")
	public Product getOneProduct(@PathVariable int id) 
	{
		return productService.getOne(id);
	}
	
	@DeleteMapping("/product/deleteOneProduct/{id}")
	public String deleteOneProduct(@PathVariable int id) 
	{
		productService.deleteProduct(id);
		return " Record with " + id + " is deleted!!!";
	}
	
	@PutMapping("/product/updateOneProduct")
	public Product updateOneProduct(@RequestBody  Product product) 
	{
		return productService.saveOne(product);
	}
}