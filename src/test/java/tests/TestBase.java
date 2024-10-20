package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import utilities.Helper;

public class TestBase {
	public static WebDriver driver;
	@BeforeSuite
	@Parameters
	public void startDriver(@Optional("chrome") String browserName)
	{
		if (browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"/resources/chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver .navigate().to("https://www.jumia.com.eg/ar/");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	}
	@AfterSuite
	public void closeDriver()
	{
		driver.quit();
	}
	@AfterMethod
	public void takescreenshot (ITestResult result)
	{
		if (result.getStatus() == ITestResult.FAILURE)
		{
			System.out.println("error");
			System.out.println("taking screenshot");
			Helper.capturescreenshot(driver, result.getTestName());
			
		}
	}

}
