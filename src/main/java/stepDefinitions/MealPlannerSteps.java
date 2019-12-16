package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class MealPlannerSteps extends DriverFactory{
	@Given("^user logged in as a registered user$")
	public void user_logged_in_as_a_registered_user() throws Exception {
	    
	}

	@When("^user navigates to the eatthismuch\\.com website$")
	public void user_navigates_to_the_eatthismuch_com_website() throws Exception {
	    mealPlannerPage.getMealPlannerPage();
	}

	@When("^user navigates to the login page$")
	public void user_navigates_to_the_login_page() throws Exception {
	    mealPlannerPage.clickLoginLink();
	}

	@When("^user enters a valid username$")
	public void user_enters_a_valid_username() throws Exception {
	    mealPlannerPage.enterUsername("mealplan999");
	}

	@When("^user enters a valid password$")
	public void user_enters_a_valid_password() throws Exception {
	    mealPlannerPage.enterPassword("4FB&2c$");
	}

	@Then("^user should be presented with the Meal Planner page$")
	public void user_should_be_presented_with_the_Meal_Planner_page() throws Exception {
	    mealPlannerPage.confirmUserCanAccessMealPlanner();
	}

	@Given("^user is not logged in as a registered user$")
	public void user_is_not_logged_in_as_a_registered_user() throws Exception {
	   
	}
	
	@When("^user navigates to the eatthismuch website$")
	public void user_navigates_to_the_eatthismuch_website() throws Exception {
	    mealPlannerPage.getMealPlannerPage();
	}

	@Then("^user should be presented with the landing page$")
	public void user_should_be_presented_with_the_landing_page() throws Exception {
	    mealPlannerPage.confirmUserOnLandingPage();
	}

}
