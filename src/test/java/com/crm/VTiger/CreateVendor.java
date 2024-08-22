package com.crm.VTiger; //Testcase 5(Create vendor)

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseVT;
import com.crm.FileUtility.VTFileUtilityExcel;
import com.crm.Pom.HomePage;
import com.crm.Pom.VendorPage;
@Listeners(com.crm.Listeners.VTListeners.class)             //To record the events
public class CreateVendor extends BaseVT
{
	@Test
	public void createVendor() throws InterruptedException, EncryptedDocumentException, IOException
	{
		//Move the cursor on more option and click on vendor
		HomePage hp = new HomePage(driver);
		hp.moreOpt();
		VendorPage vp = new VendorPage(driver);
		vp.vendors();
		
		//Click on create vendor and fill the mandatory fields
		vp.createVendor();
		vp.VendorName(VTFileUtilityExcel.Exceldata("Sheet1", 0, 5));
		
		//Save the information
		vp.save();
		
		
	}

}
