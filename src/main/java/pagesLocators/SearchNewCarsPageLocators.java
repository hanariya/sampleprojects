package pagesLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchNewCarsPageLocators {
	
	@FindBy(xpath="//a[@data-gtm-label='top nav car buy and sell']")
	public WebElement buyPlusSellTab;
	
	@FindBy(xpath="//a[@data-gtm-label='sub nav new cars search']")
	public WebElement newCarsOption;
	
	 @FindBy(xpath="//select[@id='makes']")
	 public WebElement makesDropdown;
	 
	 @FindBy(xpath="//select[@id='models']")
	 public WebElement modelDropdown;
	 
	 @FindBy(xpath="//select[@id='locations']")
	 public WebElement locationDropdown;
	 
	 @FindBy(xpath="//select[@id='priceTo']")
	 public WebElement priceToDropdown;
	 
	 @FindBy(xpath="//input[@id='search-submit']")
	 public WebElement searchButton;
}
