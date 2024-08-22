package com.crm.VTiger; //Testcase 3 (Create contact with support start date and end date)

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseVT;
import com.crm.BaseClass.DateClass;
import com.crm.FileUtility.VTFileUtilityExcel;
import com.crm.Pom.contactPage;
@Listeners(com.crm.Listeners.VTListeners.class)  //To record the events
public class ContactTestcase extends BaseVT
{
  @Test
  public void createConWithSupportSEDate() throws EncryptedDocumentException, IOException, InterruptedException
  {
	  //Go to the contact page and click on create contact
	  contactPage ref = new contactPage(driver);
	  ref.contacts();
	  ref.createContact();
	  
	  //Fill the mandatory fields
	  ref.lastName(VTFileUtilityExcel.Exceldata("sheet1", 0, 3));
	  
	  //Enter the start date and end date by accessing date from another utility class
	  String start_date=DateClass.date1("yyyy-MM-dd", 2);
	  String end_date=DateClass.date1("yyyy-MM-dd", 5);
	  ref.startDate(start_date);
	  ref.endDate(end_date);
	  
	  //Save the information
	  ref.save();
	  
	  //To verify the expected date is displayed or not
	  assertEquals(start_date,ref.verify_startdate.getText());
	  Reporter.log("Expected Start date is displayed ",true);
	  assertEquals(end_date,ref.verify_enddate.getText());
	  Reporter.log("Expected end date is displayed",true);
	  
   }
}
