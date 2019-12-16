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
	public @FindBy(xpath = "//button[contains(text(), 'Edit Week')]") WebElement mealPlannerConfirmText;
	
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
	
	public MealPlannerPage enterPassword(String password) throws Exception {
		sendKeysToWebElement(passwordInput, password);
		
		return new MealPlannerPage();
	}
	
	public MealPlannerPage clickOnSubmitButton() throws Exception {
		WebElement submitButton = getDriver().findElement(By.xpath("//button[contains(text(), 'Log in')]"));
		waitAndClickElement(submitButton);
		return new MealPlannerPage();
	}
	
	public MealPlannerPage confirmUserCanAccessMealPlanner() throws Exception {
		WaitUntilWebElementIsVisible(mealPlannerConfirmText);
		Assert.assertEquals("Edit Week", mealPlannerConfirmText.getText());
		return new MealPlannerPage();
	}
	
	public MealPlannerPage confirmUserOnLandingPage() throws Exception {
		WebElement landingPageConfirmText = getDriver().findElement(By.xpath("//h1[contains(text(),'Put your diet on autopilot')]"));
		WaitUntilWebElementIsVisible(landingPageConfirmText);
		Assert.assertEquals("Put your diet on autopilot", landingPageConfirmText.getText());
		return new MealPlannerPage();
	}
		
}
