package com.webservice.order.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.webservice.room.entity.Customer;

public interfaceCustomerRepository extends JpaRepository<Customer,Integer>
{     }