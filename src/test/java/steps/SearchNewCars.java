package steps;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesAction.SearchNewCarsPageActions;
import pagesLocators.SearchNewCarsPageLocators;
import utilities.ExcelReader;
import utilities.SeleniumDriver;

public class SearchNewCars {

	SearchNewCarsPageActions searchNewCarsPageActions = new SearchNewCarsPageActions();
	SearchNewCarsPageLocators searchNewCarsPageLocators = new SearchNewCarsPageLocators();

	@Given("Open the page {string}")
	public void open_the_page(String websiteUrl) {
		SeleniumDriver.openPage(websiteUrl);
	}

	@When("navigate to the menu buy+sell")
	public void navigate_to_the_menu_buy_sell() {
		searchNewCarsPageActions.goToBuyPlusSellTab();
	}

	@And("choose the new car seach from menu")
	public void choose_the_new_car_seach_from_menu() {
		searchNewCarsPageActions.chooseNewCarFromDropDown();
	}

	@And("choose make from the given sheetname {string} and row number {int}")
	public void choose_make_from_the_given_sheetname_and_row_number(String sheetName, Integer rowNum)
			throws InvalidFormatException, IOException, InterruptedException {

		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader
				.getData("K:\\Selenium\\Projects\\Cucumber\\src\\test\\resources\\excelData.xlsx", sheetName);
		String make = testData.get(rowNum).get("make");
		System.out.println("The make of the car is : " + make);
		searchNewCarsPageActions.chooseMakeOfTheCar(make);

	}

	@And("choose model from the given sheetname {string} and row number {int}")
	public void choose_model_from_the_given_sheetname_and_row_number(String sheetName, Integer rowNum) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader
				.getData("K:\\Selenium\\Projects\\Cucumber\\src\\test\\resources\\excelData.xlsx", sheetName);
		String model = testData.get(rowNum).get("model");
		System.out.println("The make of the car is : " + model);
		searchNewCarsPageActions.chooseModelOfTheCar(model);
	}

	@And("choose location from the given sheetname {string} and row number {int}")
	public void choose_location_from_the_given_sheetname_and_row_number(String sheetName, Integer rowNum) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader
				.getData("K:\\Selenium\\Projects\\Cucumber\\src\\test\\resources\\excelData.xlsx", sheetName);
		String location = testData.get(rowNum).get("location");
		System.out.println("The make of the car is : " + location);
		searchNewCarsPageActions.chooseLocationOfTheCar(location);
	}

	@And("choose price from the given sheetname {string} and row number {int}")
	public void choose_price_from_the_given_sheetname_and_row_number(String sheetName, Integer rowNum)
			throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader
				.getData("K:\\Selenium\\Projects\\Cucumber\\src\\test\\resources\\excelData.xlsx", sheetName);
		String price = testData.get(rowNum).get("price");
		System.out.println("The make of the car is : " + price);
		searchNewCarsPageActions.choosePriceOfTheCar(price);
	}

	@Then("The page title should be from the given sheetname {string} and row number {int}")
	public void the_page_title_should_be_from_the_given_sheetname_and_row_number(String sheetName, Integer rowNum) 
		throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader
				.getData("K:\\Selenium\\Projects\\Cucumber\\src\\test\\resources\\excelData.xlsx", sheetName);
		String Actualtitle = testData.get(rowNum).get("title");
		System.out.println("The make of the car is : " + Actualtitle);
		String expectedTitle = SeleniumDriver.getTitle();
		Assert.assertEquals(Actualtitle, expectedTitle);
		Thread.sleep(10000);
	}

}
