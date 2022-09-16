package com.webservice.order.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.webservice.order.entity.Product;

public interfaceProductRepository extends JpaRepository<Product,Integer>
{     }