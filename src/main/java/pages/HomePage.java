package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase
{

	public HomePage(WebDriver driver) {
		super(driver);
			}
	@FindBy (css = "button.btn._prim.-df.-mla")
	WebElement cookieButton;
	
	@FindBy (xpath = "//label[@for='fi-nl-pop-legalText']")
	WebElement checkox;
	
	@FindBy (id = "fi-nl-pop-email")
	WebElement mailTextBox;
	
	@FindBy (xpath = "(//button[@class='btn _prim _md -fw -mhxs'])[1]")
	WebElement gender;
	
	
	@FindBy (id = "fi-q")
	WebElement searchTextBox;
	
	@FindBy (css = "button.btn._prim._md.-mls.-fsh0")
	WebElement searchButton;
	
	@FindBy (xpath = "//div[@class='sug _open']")
	public WebElement productList;
	
	public void sendNews(String mailText)
	{
		mailTextBox.clear();
		sendText(mailTextBox, mailText);
		clickButton(checkox);
		clickButton(gender);
	}
	
	public void search(String text)
	{
		clickButton(cookieButton);
		sendText(searchTextBox, text);
		clickButton(searchButton);
	}
	public void searchSuggestions(String mytext)
	{
		searchTextBox.clear();
		sendText(searchTextBox, mytext);
	}
	public void searchFilters(String mysearch)
	{
		searchTextBox.clear();
		sendText(searchTextBox, mysearch);
		clickButton(searchButton);
		
	}

}
