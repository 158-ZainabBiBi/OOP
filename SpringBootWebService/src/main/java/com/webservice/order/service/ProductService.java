package com.webservice.order.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.webservice.order.repository.ProductRepository;
import com.webservice.order.entity.Product;

@Service
public class ProductService 
{
	@Autowired
	private ProductRepository productRepository;
	
	public Product saveOne(Product product) 
	{
		return productRepository.save(product);
	}
	
	public List<Product> saveMany(List<Product> products) 
	{
		return productRepository.saveAll(products);
	}
	
	public List<Product> getAll() 
	{
		return productRepository.findAll();
	}
	
	public Product getOne(int id) 
	{
		return productRepository.findById(id).orElse(null);
	}
	public void deleteProduct(int id) 
	{
		productRepository.deleteById(id); 
	}
	
	public Product updateProduct(Product product) 
	{
		Product existingProduct = productRepository.findById(product.getPRODUCT_ID()).orElse(null);
		existingProduct.setPRODUCT_NAME(product.getPRODUCT_NAME());
		existingProduct.setPRODUCT_PRICE(product.getPRODUCT_PRICE());
		existingProduct.setPRODUCT_MANU(product.getPRODUCT_MANU());
		existingProduct.setPRODUCT_EXPIRE(product.getPRODUCT_EXPIRE());
		return productRepository.save(existingProduct);
	}

}
