package testpack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01_Loginactivity extends Newtestbase
{
	@Test	(priority=1)
	public void validation()
	{
		log.info("apply verification");
		
		String expectedTitle="Swag Labs";
		
		String actualTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
}
