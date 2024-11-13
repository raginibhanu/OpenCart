package testCase;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.LogoutPage;
import testBase.BaseClass;

public class TC_004_LogoutFunctionality extends BaseClass {

	
	 JavascriptExecutor js;
	@Test
	public void LogOut() throws InterruptedException {
		


		  HomePage hp=new HomePage(driver);
		
	       hp.myAccountClick();
	       Thread.sleep(3000);
		
	       hp.loginLinkClick();
	       Thread.sleep(3000);
	     
	       
		
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(p.getProperty("Email"));
	    Thread.sleep(3000);
	    lp.setPassword(p.getProperty("Password"));
		Thread.sleep(2000);
		lp.clickLogin();
		Thread.sleep(3000);
		
		hp.myAccountClick();
		Thread.sleep(5000);
		
		LogoutPage lop=new LogoutPage(driver);
		
       List<WebElement> lists=		lop.MyAccountDropDownlist();
		
		for(int i=1;i<=lists.size();i++) {
			
			
		String text=lists.get(i).getText();
		
		
		  if(text.equalsIgnoreCase(lop.LogoutText())) {
			  
			  
			  Assert.assertEquals(text,"Logout");
			  
			  
			  
			  lists.get(i).click();
			  
			  
		  }
			
			
			
		}
		
		
		
		
	      hp.myAccountClick();
	 boolean status=    hp.LoginlinkDisplayed();
		
    Assert.assertEquals(status,true,"After Sucessfully LogOut,Login Link Is available In My Account DropDown");	
		
	 
	  
	  
	  
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
