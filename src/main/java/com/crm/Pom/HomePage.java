package com.crm.Pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.BaseClass.BaseVT;

public class HomePage extends BaseVT
{
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
   private @FindBy(xpath="(//td[@class=\"small\"])[5]/table/tbody/tr/td/a")
   List<WebElement> header;
   
 private  @FindBy(xpath="//a[text()='Calendar']")
   WebElement calendar;
   
 private  @FindBy(xpath="//a[text()='Leads']")
   WebElement leads;
   
  private @FindBy(xpath="//a[text()='Organizations']")
   WebElement organization;
   
  private @FindBy(xpath="//a[text()='Contacts']")
   WebElement contacts;
   
  private @FindBy(xpath="//a[text()='Opportunities']")
   WebElement opportunities;
   
private  @FindBy(xpath="//a[text()='Products']")
   WebElement products;
   
  private @FindBy(xpath="//a[text()='Documents']")
   WebElement documents;
   
 private @FindBy(xpath="//a[text()='Email']")
   WebElement email;
   
 private @FindBy(xpath="//a[text()='Trouble Tickets']")
   WebElement trtickets;
   
 private  @FindBy(xpath="//a[text()='Dashboard']")
   WebElement dashboard;
   
 private @FindBy(xpath="//a[@href='javascript:;']")
   WebElement more;
 
 public void moreOpt() throws InterruptedException
 {
	 Actions act = new Actions(driver);
	 act.moveToElement(more).build().perform();
	 
	 Thread.sleep(2000);
 }
 public void product()
 {
	 products.click();
 }
 public void calendar()
 {
	 calendar.click();
 }
 public void leads()
 {
	 leads.click();
 }
 public void organization()
 {
	 organization.click();
 }
 public void contacts()
 {
	contacts.click();
 }
 public void opportunities()
 {
	 opportunities.click();
 }
 public void products()
 {
	 products.click();
 }
 public void documents()
 {
	 documents.click();
 }
 public void email()
 {
	 email.click();
 }
 public void trTickets()
 {
	 trtickets.click();
 }
 public void dashboard()
 {
	 dashboard.click();
 }
 
 
 
   


/*public void headerElements() throws InterruptedException
{
	for(WebElement web : header)
	{
		web.click();
		Thread.sleep(6000);
	}
}*/


}
