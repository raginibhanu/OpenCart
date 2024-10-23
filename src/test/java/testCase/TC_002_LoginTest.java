package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass {

	
	@Test(groups={"sanity"})
	public void verifyLogin() throws InterruptedException {
		
		
		
		  logger.info("****** Started Tc_002_TestCase");
	      HomePage hp=new HomePage(driver);
	    
	         hp.myAccountClick();
	          Thread.sleep(3000);
	         
	              hp.loginLinkClick();
	             logger.info("login link click on home page under register link");
	
	
	      LoginPage lp=new LoginPage(driver);
	      
	       lp.setUsername(p.getProperty("Email"));
	       lp.setPassword(p.getProperty("Password"));
	       lp.clickLogin();
	       Thread.sleep(5000);
	       
	       MyAccountPage map=new MyAccountPage(driver);
	       
	    boolean status=   map.myAccounttext();
	    
	    Assert.assertEquals(status,true);
	       
	
	
	
	
	
	
	
	
	
	}
	
	
	
}
