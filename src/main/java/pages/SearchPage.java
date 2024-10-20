package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SearchPage extends PageBase {

	public SearchPage(WebDriver driver) {
		super(driver);
		jse= (JavascriptExecutor) driver;
	}
	
	//@FindBy (xpath = "(//label[@class='trig -df -i-ctr -prxs'])[1]")
	//WebElement laptopTypeMenu;
	
	//@FindBy (xpath = "(//label[@class='trig -df -i-ctr -prxs'])[2]")
	//WebElement pricemenu;
	
	@FindBy (css = "a.fk-cb.-me-start.-fsh0._chkd")
	WebElement shippedButton;
	
	@FindBy (xpath = "(//a[@class='fk-cb -me-start -fsh0'])[5]")
	WebElement laptopTypeBtn;
	
	@FindBy (xpath = "(//input[@class='pi'])[1]")
	WebElement minPriceTextbox;
	
	@FindBy (xpath = "(//input[@class='pi'])[2]")
	WebElement maxPriceTextbox;
	
	@FindBy (css = "button.btn._def.-fsh0")
	WebElement implementButton;
	public void selectMinPrice(String mnPrice)
	{
		minPriceTextbox.clear();
		sendText(minPriceTextbox, mnPrice);		
	}
	public void selectMaxPrice(String mxPrice)
	{
		maxPriceTextbox.clear();
		sendText(maxPriceTextbox, mxPrice);
		clickButton(implementButton);
	}
	public void shipped()
	{
		clickButton(shippedButton);
	}
	
	

}
