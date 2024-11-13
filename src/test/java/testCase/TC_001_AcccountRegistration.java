package testCase;



import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AcccountRegistration extends BaseClass {

	
	       
	
	       @Test(groups= {"smoke"})
	       public void Accountregistration() throws InterruptedException  {
	    	   
	    	   HomePage hp=new HomePage(driver);
	    	   logger.info("**** STARTING REGISTER AN ACCOCONT ******");
	    	 
	    	   hp.myAccountClick();
	    	   Thread.sleep(3000);;
	    	   
	    	   logger.info("click my account drop down");
	    	   
	    	   hp.registerLinkClick();
	    	   Thread.sleep(3000);
	    	   logger.info("click on register link");
	    	   
	    	   AccountRegistrationPage rp=new AccountRegistrationPage(driver);
	    	  try { 
	    	   logger.info("enter the customer details");
	    	    rp.firstName(randomString().toUpperCase());
	    	    rp.lastName(randomString().toUpperCase());
	    	    rp.Email(randomString()+"@gamil.com");
	    	    rp.PhoneNumber(randomNumber());
	    	   

	    	String password	= randomAlphaNumeric();
	    	   rp.Password(password);
	    	   rp.ConfirmPassword(password);
	    	   
	    	   rp.Privacypolicy();
	    	   logger.info("after finishing custmer details");
	    	   rp.Continue();
	    	   Thread.sleep(3000);
	    	   
	    	     
	    		 SoftAssert soft=new SoftAssert();
	    	   
	    	   String actmsg=	   rp.ConfirmationAccountSucess();

	   	    soft.assertEquals(actmsg,"Your Account Has Been Created!");
	   	    
	    	  }
	    	  catch(Exception e) {
	    	   
	   
	      
	    	
	    	  
	    	  
	    	  }  
	    	  
	     
	    	    
	       }
	
	
	 
}
