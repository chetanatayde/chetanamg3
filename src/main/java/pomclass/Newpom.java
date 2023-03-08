package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Newpom 
{
	 WebDriver driver;
		@FindBy(xpath="//input[@id='user-name']")WebElement username;
		public void sendusername()
		{
			username.sendKeys("standard_user");
			
		}
		@FindBy(xpath="//input[@id='password']")WebElement password;
		public void sendpassword()
		{
			password.sendKeys("secret_sauce");
		}
		
		@FindBy(xpath="//input[@type=\"submit\"]")WebElement login;
		public void clickloginbtn()
		{
			login.click();
		}
		public Newpom(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}	


}
