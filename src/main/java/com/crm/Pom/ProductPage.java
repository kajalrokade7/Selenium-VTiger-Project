package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage 
{
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
    private @FindBy(xpath="//img[@alt=\'Create Product...\']")
    WebElement create_product;
  
    public void createProduct()
     {
	  create_product.click();
     }
  
}
