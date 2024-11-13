package testCase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_003_LoginDDT extends BaseClass{

	

	 @Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	 public void loginDDTest(String email,String pass,String msg) throws InterruptedException {
		 
		
		    HomePage hp=new HomePage(driver);
		 
		     hp.myAccountClick();
		     Thread.sleep(3000);
		     hp.loginLinkClick();
		     Thread.sleep(3000);
		  
		     
		  LoginPage lp=new LoginPage(driver);   
		   lp.setUsername(email);
		   lp.setPassword(pass);
		   lp.clickLogin();
		   
		   
		   MyAccountPage map=new MyAccountPage(driver);
		   
		    boolean targetpage=             map.myAccounttext();
		   
		  if(msg.equalsIgnoreCase("Valid")) {
			
			  
		     if(targetpage==true) {
		    	 
		    	 map.clickLogout();
		    	 Thread.sleep(3000);
		    
		    	 Assert.assertTrue(true);
		    	 
		    	 
		     }
		     
		     else {
		    	 
		    	 Assert.assertTrue(false);
		    	 
		     }
		  
		  }  
		  
		  
		  if(msg.equalsIgnoreCase("Invalid")) {
			  
			  if(targetpage==true) {
				  
				  map.clickLogout();
			     Assert.assertTrue(false);
				  
			  }
			  
			  else{
				  
				  Assert.assertTrue(true);
				  
				  
			  }
			  
			  
		  }
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		   
		     
		 
		 
		 
		 
		 
	 }
	
	
	
	
	
	
	
	
	
	
	
}
