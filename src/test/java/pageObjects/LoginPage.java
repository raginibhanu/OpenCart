package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	 JavascriptExecutor js;
	
	
    	public LoginPage(WebDriver driver) {
	   	super(driver);
		
     	}

	
	
    	 @FindBy(xpath="//input[@id='input-email']")
    	 WebElement txt_email_box;
    	 
	
	     @FindBy(xpath="//input[@id='input-password']")
	     WebElement txt_password_box;
	     
	     @FindBy(xpath="//input[@value='Login']")
	     WebElement btn_login;
	     
	     
	
	     public void setUsername(String uname) {

	    	 
	    	 
	    	 txt_email_box.sendKeys(uname);
	    	 
	     }
	
	
	     public void setPassword(String pass) {
	    	 
	    	 
	    	 
	    	 txt_password_box.sendKeys(pass);
	    	 
	    	 
	    	 
	     }
	
	
	   public void clickLogin() {
		   
		   btn_login.click();
	   }
	
	
}
