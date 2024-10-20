package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
	protected WebDriver driver ;
	public JavascriptExecutor jse;
	public Select select;
	public Actions action;
	public PageBase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	protected static void clickButton (WebElement btn)
	{
		btn.click();
	}
	protected static void sendText (WebElement txtBtn, String text)
	{
		txtBtn.sendKeys(text);
	}
	 
	public void scrolldown()
	{
		jse.executeScript("scrollBy(1233,605)");
		
	}

}
