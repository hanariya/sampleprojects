package pagesAction;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pagesLocators.CarsGuideHomePageLocators;
import utilities.SeleniumDriver;

public class CarsGuideHomePageActions {
	CarsGuideHomePageLocators carsGuideHomePageLocators = null;

	public CarsGuideHomePageActions() {
		this.carsGuideHomePageLocators = new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);
	}

	public void navigateToBuyPlusSellTab() {
		System.out.println("Inside CarsGuideHomePageActions navigateToBuyPlusSellTab method ");
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.buyPlusSellTab).perform();
	}

	public void clickOnSearchCarsOption() {
		carsGuideHomePageLocators.searchCars.click();
	}


	public void clickOnSearchUsedCarsOption() {
		carsGuideHomePageLocators.searchUsedCars.click();
	}
	
	public void navigateToReviewTab() {
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.reviewTab).perform();
	}
}
