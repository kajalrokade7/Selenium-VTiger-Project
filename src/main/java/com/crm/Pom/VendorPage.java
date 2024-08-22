package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorPage 
{
    public VendorPage(WebDriver driver)
    {
	  PageFactory.initElements(driver, this);
    }
    
   private @FindBy(xpath="//a[text()='Vendors']")
   WebElement vendors;

   private @FindBy(xpath="//img[@alt='Create Vendor...']")
   WebElement create_vendor;

   private @FindBy(xpath="//input[@name='vendorname']")
   WebElement vendor_name;

   private @FindBy(xpath="//input[@value='  Save  ']")
   WebElement save;

   public void vendors()
   {
	vendors.click();
   }
   public void createVendor()
   {
	create_vendor.click();
   }
   public void VendorName(String name)
   {
	vendor_name.sendKeys(name);
   }
   public void save()
   {
	save.click();
   }

}
