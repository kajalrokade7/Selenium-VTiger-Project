package com.crm.Pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CreateProductInformPage 
{
    public CreateProductInformPage(WebDriver driver)
    {
	  PageFactory.initElements(driver, this);
    }
  
  private @FindBy(xpath="//input[@name='productname']")
  WebElement product_name;
  
  private @FindBy(xpath="//img[@title='Select']")
  WebElement select_vendor;
  
  private @FindBy(id="search_txt")
  WebElement search_field;
  
  private @FindBy(xpath="//input[@name='search']")
  WebElement search;
  
//  private @FindBy(xpath="//a[@href='javascript:window.close();']")
//  WebElement vendorname;
  
  private @FindBy(linkText="kajal")
  WebElement vendorname;
  
  public @FindBy(xpath="//img[@src='themes/images/basicSearchLens.gif']")
  WebElement verifyele;
  
  private @FindBy(xpath="//input[@class='crmbutton small save']")
  WebElement save;
  
  public @FindBy(id="mouseArea_Vendor Name")
  WebElement verify_vname;
  
  public void productName(String name)
  {
	  product_name.sendKeys(name);
  }
  public void selectVendor()
  {
	  select_vendor.click();
  }
  public void searchField(String name)
  {
	  search_field.sendKeys(name);
  }
  public void search()
  {
	  search.click();
  }
  public void vendorName()
  {
	  vendorname.click();
  }
  public void save()
  {
	  save.click();
  }
  
  
}
