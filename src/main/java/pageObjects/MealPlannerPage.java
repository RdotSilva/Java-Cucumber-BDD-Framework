package pageObjects;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MealPlannerPage extends BasePage {

	public @FindBy(xpath = "//a[@class='sign-in-link']") WebElement loginLink;
	public @FindBy(xpath = "//input[@placeholder='Email or Username']") WebElement usernameInput;
	public @FindBy(xpath = "//input[@placeholder='Password']") WebElement passwordInput;
	
	public MealPlannerPage() throws IOException {
		super();
	}
	
	public MealPlannerPage getMealPlannerPage() throws Exception {
		getDriver().get("https://www.eatthismuch.com/");
		return new MealPlannerPage();
	}
	
	public MealPlannerPage clickLoginLink() throws Exception {
		waitAndClickElement(loginLink);
		return new MealPlannerPage();
	}
	
	public MealPlannerPage enterUsername(String username) throws Exception {
		sendKeysToWebElement(usernameInput, username);
		return new MealPlannerPage();
	}
		
}
