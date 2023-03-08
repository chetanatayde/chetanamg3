package testpack;


import org.testng.annotations.Test;

import pomclass.Homepom;



public class TC04_Allproductaddtocart extends Newtestbase
{
	
	@Test(priority=-3)
	public void verifytitle()
	{
		String title=driver.getTitle();
		String exptitle="Swag Labs";
		if(exptitle.equals(title))
		{
			log.info("Title testcase is passed");
		}
		else
		{
			log.info("Title testcase is failed");
		}
	}
	@Test
public void validation4()
{
	
	Homepom hp=new Homepom(driver);
	hp.clickonmultiproducts();
	log.info("Clicked on all products");
	
	hp.getTextfromaddtocart();
	log.info("add to cart contains 6 items");
	 
	
	hp.clickbackproduct();
	log.info("click on bagproduct");
	

	String expectedproductselected="6";
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
