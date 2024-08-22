package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public LoginPage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	
	 private @FindBy(xpath="//input[@name=\"user_name\"]")
	 WebElement username;
	  
	 private @FindBy(xpath="//input[@name=\"user_password\"]")
	 WebElement password;
	  
	 private @FindBy(id="submitButton")
	 WebElement login_button;
	 
	 
	 public void userName(String user)
	 {
		 username.sendKeys(user);
	 }
	 public void password(String pass)
	 {
		 password.sendKeys(pass);
	 }
	 public void loginButton()
	 {
		 login_button.click();
	 }
}
