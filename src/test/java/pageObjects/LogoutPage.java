package pageObjects;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage{

	
	
	
	
	public LogoutPage(WebDriver driver) {
		super(driver);
		
	}

	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//li//a")
	List<WebElement> LogoutDropdowns;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//li[5]//a")
	
	WebElement Logout1_link;
	
	@FindBy(xpath="(//a[@class='list-group-item'][normalize-space()='Logout'])[1]")
	WebElement Logoutlink2;
	
	
	
	public List<WebElement> MyAccountDropDownlist(){
		return LogoutDropdowns;
		
		
		
		
	}
	
	
	public String LogoutText() {
		
		
		
	String Logouttext1=	Logout1_link.getText();
	
	return Logouttext1;
		
	}
	
	
	
	public void ClickLogoutlink1() {
		
		
		
		Logout1_link.click();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public void ClickLogoutlink2() {
		
		
		
		 Logoutlink2.click();
		
		
	}
	
	
	
	
	
}
