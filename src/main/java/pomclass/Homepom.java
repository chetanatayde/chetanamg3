package pomclass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepom
{
	WebDriver driver;
	@FindBy(xpath="//button[@id=\"react-burger-menu-btn\"]")WebElement settingbtn;
	public void clicksettingbtn()
	   {
		settingbtn.click();
		}
	@FindBy(xpath="//a[@id=\"logout_sidebar_link\"]")WebElement logoutbtn;
	public void clicklogoutbtn()
	{
	logoutbtn.click();
	}

	@FindBy(xpath="//div[@class=\"inventory_item_name\"]")WebElement bagproduct;
	public void clickbackproduct()
	{
		bagproduct.click();
	}

	@FindBy(xpath="//a[@class='shopping_cart_link']")WebElement addtocart;
	public String getTextfromaddtocart()
	{
		String actualproductselected=addtocart.getText();
		return actualproductselected;
	}

	@FindBy(xpath="//button[text()='Add to cart']") 
	List<WebElement>multiproducts;
	public void clickonmultiproducts()
	{
		for(int i=0;i<multiproducts.size();i++)
		{
			multiproducts.get(i).click();
		}
	}




	public Homepom(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}



	
	
}
