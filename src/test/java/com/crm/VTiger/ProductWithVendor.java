package com.crm.VTiger;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseVT;
import com.crm.FileUtility.VTFileUtilityExcel;
import com.crm.Pom.CreateProductInformPage;
import com.crm.Pom.HomePage;
import com.crm.Pom.ProductPage;

public class ProductWithVendor extends BaseVT
{
   @Test
   public void createProductWithVendor() throws EncryptedDocumentException, IOException
   {
	   //Go to the product page and click on create product
	   HomePage hp = new HomePage(driver);
	   hp.product();
	   ProductPage pp = new ProductPage(driver);
	   pp.createProduct();
	   
	   //fill the mandatory fields
       CreateProductInformPage ip = new CreateProductInformPage(driver);
	   ip.productName("mobile");
	   
	   //Select the vendor by switching the controller to the child window
	   ip.selectVendor();
	   String parent = driver.getWindowHandle();
	   Set<String> child = driver.getWindowHandles();
	   String search_vname=VTFileUtilityExcel.Exceldata("Sheet1", 0, 6);
	   child.remove(parent);
	   for(String str : child)
			{
				driver.switchTo().window(str);
				assertTrue(ip.verifyele.isDisplayed());
				ip.searchField(search_vname);
				ip.search();
				ip.vendorName();
	        }
	   
	   //Come back on parent page save the information 
		  driver.switchTo().window(parent);
		  ip.save();
		
	  //Verify the product is created with given vendor name or not(Integration testing)
		assertEquals( ip.verify_vname.getText(),search_vname);
		Reporter.log("Product is created with given vendor name",true);
   }
}
