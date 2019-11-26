package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class ContactUsSteps extends DriverFactory {
	
	@Given("^I access webdriveruniversity contact us form$")
	public void i_access_webdriveruniversity_contact_us_form() throws Exception {
		contactUsPage.getContactUsPage();
	}

	@When("^I enter a valid first name$")
	public void i_enter_a_valid_first_name() throws Exception {
		contactUsPage.enterFirstName("Tom");
	}

	@When("^I enter a valid last name$")
	public void i_enter_a_valid_last_name(DataTable dataTable) throws Exception {
		contactUsPage.enterLastName(dataTable, 0, 1);
	}

	@And("^I enter a valid email address$")
	public void i_enter_a_valid_email_address() throws Exception {
		contactUsPage.enterEmailAddress("fake@email.com");
	}

	@And("^I enter comments$")
	public void i_enter_comments(DataTable dataTable) throws Exception {
		contactUsPage.enterComments(dataTable, 0, 1);
	}

	@When("^I click on the submit button$")
	public void i_click_on_the_submit_button() throws Exception {
		contactUsPage.clickOnSubmitButton();
	}

	@Then("^the information should successfully be submitted via the contact us form$")
	public void the_information_should_successfully_be_submitted_via_the_contact_us_form() throws Exception {
		contactUsPage.confirmContactUsFormSubmissionWasSuccessful();
	}
}
