package stepDefinitions;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUsSteps {
	WebDriver driver;
	
	@Before()
	public void setup() throws IOException {
		System.setProperty("webdriver.chrome.driver", Paths.get(System.getProperty("user.dir")).toRealPath() + "\\src\\test\\java\\resources\\other\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	}
	
	@After()
	public void tearDown() {
		this.driver.manage().deleteAllCookies();
		this.driver.quit();
	}
	
	@Given("^I access webdriveruniversity contact us form$")
	public void i_access_webdriveruniversity_contact_us_form() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I enter a valid first name$")
	public void i_enter_a_valid_first_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I enter a valid last name$")
	public void i_enter_a_valid_last_name(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    throw new PendingException();
	}

	@And("^I enter a valid email address$")
	public void i_enter_a_valid_email_address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@And("^I enter comments$")
	public void i_enter_comments(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    throw new PendingException();
	}

	@When("^I click on the submit button$")
	public void i_click_on_the_submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^the information should successfully be submitted via the contact us form$")
	public void the_information_should_successfully_be_submitted_via_the_contact_us_form() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
