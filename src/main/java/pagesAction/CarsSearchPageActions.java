package pagesAction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pagesLocators.CarSearchPageLocators;
import utilities.SeleniumDriver;

public class CarsSearchPageActions {

	CarSearchPageLocators carSearchPageLocators = null;

	public CarsSearchPageActions() {
		this.carSearchPageLocators = new CarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carSearchPageLocators);
	}
 
	public void selectCarMake(String carBrand) {
		Select selectCarmaker = new Select(carSearchPageLocators.makesDropdown);
		selectCarmaker.selectByVisibleText(carBrand);
	}

	public void selectCarModel(String carModel) {
		Select selectCarmodel = new Select(carSearchPageLocators.modelDropdown);
		selectCarmodel.selectByVisibleText(carModel);
	}

	public void selectCarLocation(String carLocation) {
		Select selectCarLocation = new Select(carSearchPageLocators.locationsDropdown);
		selectCarLocation.selectByVisibleText(carLocation);
	}

	public void selectCarPrice(String carPrice) {
		Select selectCarPrice = new Select(carSearchPageLocators.priceToDropdown);
		selectCarPrice.selectByValue(carPrice);
	}
	
	public void clickOnFindButton() {
		carSearchPageLocators.searchSubmit.click();
	}

}
