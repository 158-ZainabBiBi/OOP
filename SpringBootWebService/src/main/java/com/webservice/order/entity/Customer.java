package com.webservice.order.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customer")
public class Customer 
{
	@Id
	@GeneratedValue
	@Column(name = "customerid")
	private int CUSTOMER_ID;
	@Column(name = "customer_name")
	private String CUSTOMER_NAME;
	
	@Column(name = "customer_mobile")
	private String CUSTOMER_MOBILE;
	
	@Column(name = "customer_email")
	private String CUSTOMER_EMAIL;
	
	@Column(name = "customer_address")
	private String CUSTOMER_ADDRESS;
	
	public Customer() 
	{    }
	
	public Customer(int cUSTOMER_ID, String cUSTOMER_NAME, String cUSTOMER_MOBILE, String cUSTOMER_EMAIL, String cUSTOMER_ADDRESS) 
	{
		super();
		CUSTOMER_ID = cUSTOMER_ID;
		CUSTOMER_NAME = cUSTOMER_NAME;
		CUSTOMER_MOBILE = cUSTOMER_MOBILE;
		CUSTOMER_EMAIL = cUSTOMER_EMAIL;
		CUSTOMER_ADDRESS = cUSTOMER_ADDRESS;
	}
	
	public int getCUSTOMER_ID() 
	{
		return CUSTOMER_ID;
	}
	public void setCUSTOMER_ID(int cUSTOMER_ID) 
	{
		CUSTOMER_ID = cUSTOMER_ID;
	}
	public String getCUSTOMER_NAME() 
	{
		return CUSTOMER_NAME;
	}
	public void setCUSTOMER_NAME(String cUSTOMER_NAME) 
	{
		CUSTOMER_NAME = cUSTOMER_NAME;
	}
	public String getCUSTOMER_MOBILE() 
	{
		return CUSTOMER_MOBILE;
	}
	public void setCUSTOMER_MOBILE(String cUSTOMER_MOBILE) 
	{
		CUSTOMER_MOBILE = cUSTOMER_MOBILE;
	}
	public String getCUSTOMER_EMAIL() 
	{
		return CUSTOMER_EMAIL;
	}
	public void setCUSTOMER_EMAIL(String cUSTOMER_EMAIL) 
	{
		CUSTOMER_EMAIL = cUSTOMER_EMAIL;
	}
	public String getCUSTOMER_ADDRESS() 
	{
		return CUSTOMER_ADDRESS;
	}
	public void setCUSTOMER_ADDRESS(String cUSTOMER_ADDRESS) 
	{
		CUSTOMER_ADDRESS = cUSTOMER_ADDRESS;
	}
}