package com.crm.BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.crm.JavaUtility.JavaUtilityVT;
import com.crm.Pom.LoginPage;
import com.crm.Pom.OrgInformPage;

public class BaseVT 
{
	  public static WebDriver driver;
	
	  //Cross browser testing achieved with data driven testing
	  
	  @BeforeClass         
	   public void preCondition() throws IOException
	    {
		  //Entering into webpage
		  String browser = JavaUtilityVT.logindata("browser");
		  String url = JavaUtilityVT.logindata("url");
		  if(browser.equals("chrome")) {
			   driver = new ChromeDriver();
		   }
		   
		   else if(browser.equals("edge")) {
			   driver =new EdgeDriver();
		   }
		   else if (browser.equals("firefox")) {
			   driver = new FirefoxDriver();
		   }
		   else {
			   driver = new EdgeDriver();
		   }
		   
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(url);
		
	}
	  //Login to application
	  @BeforeMethod
	  public void login() throws IOException
	  {
		 LoginPage ref = new LoginPage(driver);
		  ref.userName(JavaUtilityVT.logindata("username"));
		  ref.password(JavaUtilityVT.logindata("password"));
		  ref.loginButton();
	  }
	  
	 //SignOut
	  @AfterMethod
	  public void signOut()
	  {
		 OrgInformPage org = new OrgInformPage(driver);
		 org.signOut();
	  }
	  
	  //Quit 
	  @AfterClass
	  public void postCondition()
      {
		  driver.quit();
	  }
}
