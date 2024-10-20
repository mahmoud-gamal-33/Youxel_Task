package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;
import pages.HomePage;

public class SimpleSearchTest extends TestBase {
	HomePage home = new HomePage(driver);
	String myMail="test510@tset.com";
	String mySearchText= "iPhone";
	String suggestedText = "samsung";
	@Test(priority =  1)
	public void simpleSearch() 
	{
		home = new HomePage(driver);
		home.sendNews(myMail);
		home.search(mySearchText);
		Assert.assertTrue(driver.getPageSource().contains("iphone"));
	}
	@Test (priority =  2)
	public void searchWithSuggestions()
	{
		driver.navigate().to("https://www.jumia.com.eg/ar/");
		home.searchSuggestions(suggestedText);
		Assert.assertTrue(home.productList.isDisplayed());
	}

}
