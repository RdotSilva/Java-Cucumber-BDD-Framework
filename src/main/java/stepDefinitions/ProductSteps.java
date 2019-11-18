package stepDefinitions;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductSteps {
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

	@Given("^user navigates to \"([^\"]*)\" website$")
	public void user_navigates_to_website(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user clicks on \"([^\"]*)\"$")
	public void user_clicks_on(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user should be presented with a promo alert$")
	public void user_should_be_presented_with_a_promo_alert() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
