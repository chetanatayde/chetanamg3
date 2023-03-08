package testpack;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import pomclass.Newpom;

public class Newtestbase
{
	 WebDriver driver;
	 Logger log=Logger.getLogger("org.Saucedemoproject");
	 @Parameters("browserName")
	 
	 
		@BeforeMethod
		public void setup(String browserName)
		{
			if(browserName.equals("Chrome"))
			{
				
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");

		 driver = new ChromeDriver();
			}
			else if(browserName.equals("Firefox"))
			{		
				System.setProperty("webdriver.chrome.driver", "G:\\geckodriver.exe");

				 driver = new FirefoxDriver();
					}
			else
				{
				System.out.println("Throw error");		
				}
			
			PropertyConfigurator.configure("log4j.properties");
		
			driver.manage().window().maximize();
			log.info("Window is maximized");


		driver.get("https://www.saucedemo.com/");
		log.info("Url is opened");

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		Newpom x=new Newpom(driver);
		x.sendusername();
		log.info("Username is enterd");

		x.sendpassword();
		log.info("Password is enterd");

		x.clickloginbtn();
		log.info("Click on loginbtn");
		
		//Log out fuctionality
//	Homepom hp=new Homepom(driver);
//	
//		hp.clicksettingbtn();
//		System.out.println("Click on setting button");
//		
//		hp.clicklogoutbtn();
//		System.out.println("Click on logout button");
		
//		hp.clickbackproduct();
//	System.out.println("click on bagproduct");

//	hp.clickonmultiproducts();
//	System.out.println("Clicked on all products");
//	
//	hp.getTextfromaddtocart();
//	System.out.println("add to cart contains 1 items");
//	 

		}
		
		@AfterMethod
		public void teardown()
		{
			driver.quit();;
			log.info("Browser is closed");
			log.info("End of program");
	
	
		}
}
