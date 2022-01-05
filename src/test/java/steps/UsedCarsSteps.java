package steps;

import pagesAction.CarsGuideHomePageActions;
import pagesAction.CarsSearchPageActions;

import java.util.List;

import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class UsedCarsSteps {
	
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	CarsSearchPageActions carsSearchPageActions = new CarsSearchPageActions();
	
	@And("Choose on {string} link")
	public void choose_on_link(String string) {
		carsGuideHomePageActions.clickOnSearchUsedCarsOption();
	}
	
	@And("Select model of the car as from model dropdown")
	public void select_model_of_the_car_as_from_model_dropdown(List<String> list) {
	 String menu = list.get(1);
	 carsSearchPageActions.selectCarModel(menu);
	}


}
