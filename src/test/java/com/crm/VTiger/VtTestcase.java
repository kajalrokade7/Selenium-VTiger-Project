package com.crm.VTiger;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.crm.BaseClass.BaseVT;
import com.crm.FileUtility.VTFileUtilityExcel;
import com.crm.JavaUtility.Random1;
import com.crm.Pom.OrgInformPage;
import com.crm.Pom.OrgPage;

@Listeners(com.crm.Listeners.VTListeners.class)
public class VtTestcase extends BaseVT
{
	
  @Test
  public void createOrganization() throws EncryptedDocumentException, IOException, InterruptedException
  {
	 //Navigate to organization page and click on create organization
	 OrgPage ref1 = new OrgPage(driver);
	 ref1.org();
	 ref1.createOrg();
	 
	 //Fill the mandatory fields and save the details
	 OrgInformPage ref2 = new OrgInformPage(driver);
	 String organizationname=VTFileUtilityExcel.Exceldata("Sheet1", 0, 0)+Random1.randomNum();
	 ref2.orgName(organizationname);
	 ref2.website(VTFileUtilityExcel.Exceldata("Sheet1", 1, 1));
	 ref2.save();
	 
	 //To verify the given organization name is displayed or not
	 assertTrue(organizationname.equals(ref2.verify_org.getText()));
     Reporter.log("Organization created successfully with given org name",true);
  } 
}
