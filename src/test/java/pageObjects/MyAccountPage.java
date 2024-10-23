package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
		
	}

	
	
	   @FindBy(xpath="//h2[normalize-space()='My Account']")
	   WebElement msg_Heading;
	   
	
	   @FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
	   WebElement logout_link;
	   
	
	
	       public boolean myAccounttext() {
	    	try {
	    		return(msg_Heading.isDisplayed());
	    	}
	    	 catch(Exception e) {
	    		 
	    		 return false;
	    	 }
	    	
	       }
	
	
	
	       public void clickLogout() {
	    	   
	    	   logout_link.click();
	    	      
	       }
	
	
	
}
