package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountRegistrationPage extends BasePage {
	  JavascriptExecutor js;
	 
	public AccountRegistrationPage(WebDriver driver) {
		
		
		super(driver);
		
	}

	
	  @FindBy(xpath="//input[@id='input-firstname']")
	  WebElement txtFirstname;
	  
	
	  @FindBy(xpath="//input[@id='input-lastname']")
	  WebElement txtLastname;
	  
	  @FindBy(xpath="//input[@id='input-email']")
	  WebElement txtEmail;
	  
	  @FindBy(xpath="//input[@id='input-telephone']")
	  WebElement txtPhonenumber;
	  
	  @FindBy(xpath="//input[@id='input-password']")
	  WebElement txtPassword;
	  
	  @FindBy(xpath="//input[@id='input-confirm']")
	  WebElement txtConfirmpassword;
	  
	  @FindBy(xpath="//input[@name='agree']")
	
	   WebElement btn_privacy_policy;
	  
	  @FindBy(xpath="//input[@value='Continue']")
	  WebElement btn_continue;
	  
	  @FindBy(xpath="//div[@id='common-success']/descendant::h1")
	  WebElement ac_sucessful_msg;
	  
	
	    public void firstName(String fname) {
	    	
	    	txtFirstname.sendKeys(fname);
	    	
	    }
	    
	    public void lastName(String lname) {
	    	
	    	 txtLastname.sendKeys(lname);
	    	
	    	
	    	
	    	
	    }
	    
	
	    
	    public void Email(String email) {
	    	
	    	
	    	txtEmail.sendKeys(email);
	    }
	    
	    
	    public void PhoneNumber(String phone) {
	    	
	    	txtPhonenumber.sendKeys(phone);
	    	
	    }
	    
	    
	    public void Password(String pass) {
	    	
	    	txtPassword.sendKeys(pass);
	    	
	    }
	    
	    
	    public void ConfirmPassword(String conpass) {
	    	txtConfirmpassword.sendKeys(conpass);
	    }
	
	    
	    public void Privacypolicy() {
	    	
	    	btn_privacy_policy.click();
	    
	    }
	    
	   public void Continue() {
		   
		 btn_continue.click();
		   
		   
		//   js = (JavascriptExecutor) driver;
		   
		 //  js.executeScript("arguments[0].click();",btn_continue);
		   
	   }
	    
	    
	    
	    public String ConfirmationAccountSucess() {
	    	
	        String text=	ac_sucessful_msg.getText();
	    	
	    	
	        return text;
	
	    }
	    
	    
	    
	    
	    
}
