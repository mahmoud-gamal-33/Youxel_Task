package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SearchPage;

public class ComplexSearchTest extends TestBase {
	HomePage home;
	SearchPage sch;
	String mySearch = "laptop";
	String minimumPrice="35000";
	String maximumPrice="50000";
	
	
	@Test
	public void multipleSearchQuery()
	{
		home=new HomePage(driver);
		sch = new SearchPage(driver);
		home.searchFilters(mySearch);
		sch.selectMinPrice(minimumPrice);
		sch.selectMaxPrice(maximumPrice);
		Assert.assertTrue(driver.getCurrentUrl().contains("laptop"));
	}

}
