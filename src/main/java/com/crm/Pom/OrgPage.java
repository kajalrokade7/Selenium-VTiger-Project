package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgPage 
{
	public OrgPage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	
     private @FindBy(xpath="//a[text()='Organizations']")
	 WebElement org;
	
     private  @FindBy(xpath="//img[@alt=\"Create Organization...\"]")
     WebElement createorg;
 
     public void org()
    {
	 org.click();
    }
     
    public void createOrg()
    {
	 createorg.click();
    }
 
}
