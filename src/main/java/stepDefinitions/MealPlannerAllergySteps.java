package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class MealPlannerAllergySteps extends DriverFactory {
	
	@Given("^user has selected common allergies from the Diet Exclusions setting$")
	public void user_has_selected_common_allergies_from_the_Diet_Exclusions_setting() throws Exception {
	    mealPlannerPage.checkForSelectedAllergies();
	}

	@When("^user navigates to the meal planner page$")
	public void user_navigates_to_the_meal_planner_page() throws Exception {
		mealPlannerPage.getMealPlannerPage();
	}

	@When("^user clicks the meal generation button$")
	public void user_clicks_the_meal_generation_button() throws Exception {
	    mealPlannerPage.clickOnGenerateMealButton();
	}

	@Then("^the meal planner should not show any meals with allergies$")
	public void the_meal_planner_should_not_show_any_meals_with_allergies() throws Exception {
	    mealPlannerPage.checkMealsForAllergies();
	}
}
