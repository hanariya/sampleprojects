package pagesLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarSearchPageLocators {
	
	@FindBy(xpath="//select[@id='makes']")
	public WebElement makesDropdown;
	
	@FindBy(xpath="//select[@id='models']")
	public WebElement modelDropdown;
	
	@FindBy(xpath="//select[@id='locations']")
	public WebElement locationsDropdown;
	
	@FindBy(xpath="//select[@id='priceTo']")
	public WebElement priceToDropdown;
	
	@FindBy(xpath="//input[@id='search-submit']")
	public WebElement searchSubmit;

}
