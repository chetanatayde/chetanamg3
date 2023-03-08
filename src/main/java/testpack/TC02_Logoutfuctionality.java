package testpack;

import org.testng.annotations.Test;

public class TC02_Logoutfuctionality extends Newtestbase

{
	@Test
	public void validation2()
	{
	
		
	
		log.info("apply varification");
	
	String expectedTitle="Swag Labs";
	String actualTitle=driver.getTitle();
	
	if(expectedTitle.equals(actualTitle))
	{
		log.info("Log out testcase is passed");
	}
	else
	{
		log.info("Log out testcase is failed");
	}
		
}	
	
	
	

}
