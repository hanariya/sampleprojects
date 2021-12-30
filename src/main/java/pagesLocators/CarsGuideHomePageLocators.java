package pagesLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarsGuideHomePageLocators {

	
	@FindBy(xpath="//a[@href='/buy-a-car/all-new-and-used']")
	public WebElement buyPlusSellTab;
	
	@FindBy(xpath="//a[@href='/car-reviews']")
	public WebElement reviewTab;
	
	@FindBy(xpath="//a[@data-gtm-label='sub nav search cars']")
	public WebElement searchCars;
	
	@FindBy(xpath="//a[@data-gtm-label='sub nav used cars search']")
	public WebElement searchUsedCars;
	
	@FindBy(xpath="//a[@data-gtm-label='sub nav new cars search']")
	public WebElement searchNewCars;
	
	@FindBy(xpath="//a[@data-gtm-label='sub nav sell my car']")
	public WebElement sellMyCar;
}
