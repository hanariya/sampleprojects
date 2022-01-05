package steps;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesAction.CarsGuideHomePageActions;
import pagesAction.CarsSearchPageActions;
import utilities.SeleniumDriver;

public class SearchCarsSteps {
	
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	CarsSearchPageActions carsSearchPageActions = new CarsSearchPageActions();

	@Given("I am on the home page {string} of cars guide website")
	public void i_am_on_the_home_page_of_cars_guide_website(String string) {
		SeleniumDriver.openPage(string);
	}

	@When("I move to the menu")
	public void i_move_to_the_menu(List<String> list) {
		String menu = list.get(1);
		System.out.println("Menu selector isd : "+ menu);
		carsGuideHomePageActions.navigateToBuyPlusSellTab();
	}

	@And("Click on {string} link")
	public void click_on_link(String string) {
		carsGuideHomePageActions.clickOnSearchCarsOption();
	}

	@And("Select car brand as {string} from make dropdown")
	public void select_car_brand_as_from_make_dropdown(String carMake) {
		carsSearchPageActions.selectCarMake(carMake);
	}

	@And("Select car model as {string} from model dropdown")
	public void select_car_model_as_from_model_dropdown(String string) {
		carsSearchPageActions.selectCarModel(string);
	}

	@And("Select location as {string} from location dropdown")
	public void select_location_as_from_location_dropdown(String string) {
		carsSearchPageActions.selectCarLocation(string);
	}

	@And("Select price mas as {string} from price dropdown")
	public void select_price_mas_as_from_price_dropdown(String string) {
		carsSearchPageActions.selectCarPrice(string);
	}

	@And("Click on Find_My_Next_Car button")
	public void click_on_find_my_next_car_button() {
		carsSearchPageActions.clickOnFindButton();
	}

	@Then("I should see list of searched cars")
	public void i_should_see_list_of_searched_cars() {
		System.out.println("Cars List Found");
	}

	@Then("The page title should be {string}")
	public void the_page_title_should_be(String expectedTitle) {
		String actualTitle = SeleniumDriver.getDriver().getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

}
