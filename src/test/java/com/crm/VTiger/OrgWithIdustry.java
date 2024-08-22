package com.crm.VTiger;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.crm.BaseClass.BaseVT;
import com.crm.FileUtility.VTFileUtilityExcel;
import com.crm.JavaUtility.Random1;
import com.crm.Pom.OrgInformPage;
import com.crm.Pom.OrgPage;
@Listeners(com.crm.Listeners.VTListeners.class)
public class OrgWithIdustry extends BaseVT
{
 @Test
 public void createOrgWithIndustry() throws EncryptedDocumentException, IOException
 {  
	 //Navigate to the organization page and click on create organization
	 OrgPage ref1 = new OrgPage(driver);
	 ref1.org();
	 ref1.createOrg();
	 
     //Fill the mandatory fields and select the industry
	 OrgInformPage ref2 = new OrgInformPage(driver);
     ref2.orgName(VTFileUtilityExcel.Exceldata("Sheet1", 0, 0)+Random1.randomNum());
	 ref2.website(VTFileUtilityExcel.Exceldata("Sheet1", 0, 1));
	 ref2.industry(VTFileUtilityExcel.Exceldata("Sheet1", 0, 2));
	 
	 //save the information
	 ref2.save();
 }
}
