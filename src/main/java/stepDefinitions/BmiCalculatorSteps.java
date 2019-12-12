package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class BmiCalculatorSteps extends DriverFactory{
	
	@Given("^I access acefitness BMI calculator$")
	public void i_access_acefitness_BMI_calculator() throws Exception {
		bmiCalculatorPage.getBmiCalculatorPage();
	}

	@When("^I enter a valid weight$")
	public void i_enter_a_valid_weight() throws Exception {
	    bmiCalculatorPage.enterWeight(155);
	}

	@When("^I enter a valid height in feet$")
	public void i_enter_a_valid_height_in_feet() throws Exception {
	    bmiCalculatorPage.enterHeightFeet(6);
	}

	@When("^I enter a valid height in inches$")
	public void i_enter_a_valid_height_in_inches(DataTable inchDataTable) throws Exception {
	    bmiCalculatorPage.enterHeightInches(inchDataTable, 0, 8);
	}

	@Then("^The estimated BMI value should be displayed correctly$")
	public void the_estimated_BMI_value_should_be_displayed_correctly() throws Exception {
	    bmiCalculatorPage.confirmCorrectBMI();
	}

}
