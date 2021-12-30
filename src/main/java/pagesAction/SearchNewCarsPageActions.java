package pagesAction;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pagesLocators.SearchNewCarsPageLocators;
import utilities.SeleniumDriver;

public class SearchNewCarsPageActions {
	
	SearchNewCarsPageLocators searchNewCarsPageLocators = null;
	
	public SearchNewCarsPageActions() {
		searchNewCarsPageLocators = new SearchNewCarsPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), searchNewCarsPageLocators);
	}
	
	public void goToBuyPlusSellTab() {
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(searchNewCarsPageLocators.buyPlusSellTab).perform();
	}
	
	public void chooseNewCarFromDropDown() {
		searchNewCarsPageLocators.newCarsOption.click();
	}
	
	public void chooseMakeOfTheCar(String make)  {
		Select select = new Select(searchNewCarsPageLocators.makesDropdown);
		select.selectByVisibleText(make);
	}
	
	public void chooseModelOfTheCar(String model)  {
		Select select = new Select(searchNewCarsPageLocators.modelDropdown);
		select.selectByVisibleText(model);
	}
	
	public void chooseLocationOfTheCar(String locations)  {
		Select select = new Select(searchNewCarsPageLocators.locationDropdown);
		select.selectByVisibleText(locations);
	}
	
	public void choosePriceOfTheCar(String price)  {
		Select select = new Select(searchNewCarsPageLocators.priceToDropdown);
		select.selectByVisibleText(price);
	}
	
	public void clickSubmit() {
		searchNewCarsPageLocators.searchButton.click();
	}
	

}
