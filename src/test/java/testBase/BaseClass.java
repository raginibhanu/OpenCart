package testBase;

import java.io.File;


import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	  public static WebDriver driver;
	
	  public Logger logger;
	 public Properties p;
	  

	 
	  
	  @BeforeClass(groups= {"smoke","sanity","Master"})
	  @Parameters({"os","browser"})
	public void setup(String os,String br) throws IOException {
		  

			//loading properties file
			 FileReader file=new FileReader(".//src//test//resources//properties.file");
			 p=new Properties();
			 p.load(file);
			
		 logger=LogManager.getLogger(this.getClass());
		
		
		 if(p.getProperty("execution_env").equalsIgnoreCase("remote")) {
			 
			 DesiredCapabilities cap = new DesiredCapabilities();
			 
			 if(os.equalsIgnoreCase("windows")) {
				 
				 
				 cap.setPlatform(Platform.WIN10);
				 
				 
			 }
			 
			 
			 else if(os.equalsIgnoreCase("mac")) {
				 
				 cap.setPlatform(Platform.MAC);
				 
			 }
			 
			 
			 else {
				 
				 System.out.println("No Operating Os");
				 return;
				 
			 }
			 
			 
			 
			 switch(br.toLowerCase()) {
			 
			 case "chrome":driver=new ChromeDriver();break;
			 case "edge":driver=new EdgeDriver();break;
			 case "firefox":driver=new FirefoxDriver();break;
			 default:System.out.println("No Browser Present");return;		
			 
			 } 
			 
			 
		
			  driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
			 
			 
			 
			 
		 }
		
		 
		 
		 
		  if(p.getProperty("execution_env").equalsIgnoreCase("local")) {
			  
			  switch(br.toLowerCase()) {
				 
				 case "chrome":driver=new ChromeDriver();break;
				 case "edge":driver=new EdgeDriver();break;
				 case "firefox":driver=new FirefoxDriver();break;
				 default:System.out.println("No Browser Present");return;		
				 
				 
				 
				 
				 }
			  
			  
			  
		  }
		 
		 
		 
		 
		 
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(p.getProperty("appUrl"));
		driver.manage().window().maximize();
	//	driver.get(p.getProperty("appUrl"));
		
		
	}
	 @AfterClass(groups= {"smoke","sanity","Master"})    
	public void tearDown() {
		
		driver.quit();		
	}
	
	 
	 
	 public String randomString() {
		 
		String generatedString=         RandomStringUtils.randomAlphabetic(5);
		
		return generatedString;
	 }
	 
	 
	 
	 public String randomNumber() {
		 
			String generatedString=         RandomStringUtils.randomNumeric(10);
			
			return generatedString;
		 }
		 
	 

		public String randomAlphaNumeric()
		{
			String str=RandomStringUtils.randomAlphabetic(3);
			String num=RandomStringUtils.randomNumeric(3);
			
			return (str+"@"+num);
		}
	 
	 
	 
	 
		public String captureScreen(String tname) throws IOException {

			String timeStamp = new  SimpleDateFormat("yyyyMMddhhmmss") .format(new Date());
					
			TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
			File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
			
			String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
			File targetFile=new File(targetFilePath);
			
			sourceFile.renameTo(targetFile);
				
			return targetFilePath;

		}
		
	 
	 
	 
	
	
}