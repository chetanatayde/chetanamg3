package testpack;



import org.testng.annotations.Test;

import pomclass.Homepom;



public class TC03_Addtocartfunctionality extends Newtestbase
{

	@Test
	public void validation3()
	{
		
		//s private WebDriver driver;
		log.info("apply validation");
		Homepom hp= new Homepom(driver);
        hp.clickbackproduct();
		
		String expectedproductselected="1";
		String actualproductselected=hp.getTextfromaddtocart();
		
		if(expectedproductselected.equals(actualproductselected))
		{
			log.info("all product add to cart testcase is passed");
		}
		else
		{
			log.info("all product add to cart testcase is failed");
		}
	}
}
