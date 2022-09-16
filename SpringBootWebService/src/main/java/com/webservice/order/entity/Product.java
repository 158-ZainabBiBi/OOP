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
@Table(name = "product")
public class Product 
{
	@Id
	@GeneratedValue
	@Column(name = "productid")
	private int PRODUCT_ID;
	@Column(name = "product_name")
	private String PRODUCT_NAME;
	
	@Column(name = "product_price")
	private String PRODUCT_PRICE;
	
	@Column(name = "product_manu")
	private String PRODUCT_MANU;
	
	@Column(name = "product_expire")
	private String PRODUCT_EXPIRE;
	
	public Product() 
	{    }
	
	public Product(int pRODUCT_ID, String pRODUCT_NAME, String pRODUCT_PRICE, String pRODUCT_MANU, String pRODUCT_EXPIRE) 
	{
		super();
		PRODUCT_ID = pRODUCT_ID;
		PRODUCT_NAME = pRODUCT_NAME;
		PRODUCT_PRICE = pRODUCT_PRICE;
		PRODUCT_MANU = pRODUCT_MANU;
		PRODUCT_EXPIRE = pRODUCT_EXPIRE;
	}
	
	public int getPRODUCT_ID() 
	{
		return PRODUCT_ID;
	}
	public void setPRODUCT_ID(int pRODUCT_ID) 
	{
		PRODUCT_ID = pRODUCT_ID;
	}
	public String getPRODUCT_NAME() 
	{
		return PRODUCT_NAME;
	}
	public void setPRODUCT_NAME(String pRODUCT_NAME) 
	{
		PRODUCT_NAME = pRODUCT_NAME;
	}
	public String getPRODUCT_PRICE() 
	{
		return PRODUCT_PRICE;
	}
	public void setPRODUCT_PRICE(String pRODUCT_PRICE) 
	{
		PRODUCT_PRICE = pRODUCT_PRICE;
	}
	public String getPRODUCT_MANU() 
	{
		return PRODUCT_MANU;
	}
	public void setPRODUCT_MANU(String pRODUCT_MANU) 
	{
		PRODUCT_MANU = pRODUCT_MANU;
	}
	public String getPRODUCT_EXPIRE() 
	{
		return PRODUCT_EXPIRE;
	}
	public void setPRODUCT_EXPIRE(String pRODUCT_EXPIRE) 
	{
		PRODUCT_EXPIRE = pRODUCT_EXPIRE;
	}
}