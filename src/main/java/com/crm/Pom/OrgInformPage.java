package com.crm.Pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.BaseClass.BaseVT;

public class OrgInformPage extends BaseVT
{
	 public OrgInformPage(WebDriver driver)
	 {
	   PageFactory.initElements(driver, this);
	 }
	
	
   private @FindBy(xpath="//input[@name=\"accountname\"]")
   WebElement orgname;
   
   private @FindBy(xpath="(//input[@class=\"detailedViewTextBox\"])[2]")
   WebElement website;
  
   private @FindBy(xpath="//input[@value=\"  Save  \"]")
   WebElement save;
 
   private @FindBy(xpath="//select[@name='industry']")
   WebElement industry;
 
 
 


     public @FindBy(id="dtlview_Organization Name")
     WebElement orgname2;

     private @FindBy(xpath="//img[@style='padding: 0px;padding-left:5px']")
     WebElement signout;

     private@FindBy(xpath="//a[contains(text(),'Sign Out')]")
     WebElement sout;
 
     public@FindBy(id="mouseArea_Organization Name")
     WebElement verify_org;
	
	 public void orgName(String name)
	 {
		 orgname.sendKeys(name);
	 }
	 public void website(String url)
	 {
		 website.sendKeys(url);
	 }
	 public void save()
	 {
		 save.click();
	 }
	 public void industry(String text)
	 {
		Select se = new Select(industry);
		se.selectByVisibleText(text);
	 }
	
	 
	
	 public void signOut()
	 {
		 Actions act = new Actions(driver);
		 act.moveToElement(signout).build().perform();
		 sout.click();
	 }
	 
	
		
	 
	 
	 
	 
}
