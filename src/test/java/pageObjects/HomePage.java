package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	 JavascriptExecutor js;
     
	public HomePage(WebDriver driver) {
		
		
		super(driver);
	
	}
	
	
	@FindBy(xpath="//ul[@class='list-inline']//li[2]/descendant::span[2]")
	
	WebElement my_account;
	
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement register_link_click;
	
	

	@FindBy(xpath="//a[normalize-space()='Login']")
	
	WebElement login_link;
	
	
	
	
	
	public void myAccountClick() throws InterruptedException {
		
	//	my_account.click();
		
		   
		   js = (JavascriptExecutor) driver;
			   
	  js.executeScript("arguments[0].click();",my_account);
		
		
		
	}
	
	
	public void registerLinkClick() {
		
		register_link_click.click();
		
	}
	
	
	public void loginLinkClick() {
		
		 login_link.click();		
	}
	
	

}
