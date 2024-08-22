package com.crm.VTiger;   //Testcase 4(Create contact with organization name)

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseVT;
import com.crm.FileUtility.VTFileUtilityExcel;
import com.crm.Pom.contactPage;
@Listeners(com.crm.Listeners.VTListeners.class)      //To record the testcase events
public class ContactWithOrg extends BaseVT          
{
	@Test
	  public void createConWithOrg() throws EncryptedDocumentException, IOException, InterruptedException
	  {
		  //Click on contact and create a contact
		  contactPage ref = new contactPage(driver);
		  ref.contacts();
		  ref.createContact();
		  
		  //Fill the mandatory fields
		  ref.lastName(VTFileUtilityExcel.Exceldata("sheet1", 0, 3));
		  
		 //add organization name
		  ref.orgAdd();
		  
		 //search the organization after switching the controller to child page
		  String parent = driver.getWindowHandle();
		  Set<String> child = driver.getWindowHandles();
		  String search_orgname=VTFileUtilityExcel.Exceldata("Sheet1", 0, 4);
		  child.remove(parent);
		  for(String str : child)
			{
			   driver.switchTo().window(str);
				assertTrue(ref.verifyelement.isDisplayed());
	            ref.searchField(search_orgname);
			    ref.search();
			    ref.clickOrg();
			}
		  
		  //come back to the parent page and save the information
		  driver.switchTo().window(parent);
		  ref.save();
		  
		  //To verify the contact is created with given organization name or not(Integration testing)
		  assertEquals(ref.verify_orgname.getText(),search_orgname);
		  Reporter.log("Contact is created with given organization name",true);
		  
    }
		  
}
