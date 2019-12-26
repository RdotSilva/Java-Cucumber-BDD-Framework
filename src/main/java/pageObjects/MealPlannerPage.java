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
	
	public MealPlannerPage checkForSelectedAllergies() throws Exception {
		// Click Settings Button
		// Check for the list-item-on class. This means an allergy is clicked on.
		// <a class="nav-list-item list-item-on" name="allergies2" data-value="peanut" id="c11653_allergies2-0" xpath="1">Peanut</a>
		////a[@id='c11653_allergies2-0'] data value = "tree nuts" "peanut"
		return new MealPlannerPage();
	}
	
	public MealPlannerPage clickOnGenerateMealButton() throws Exception {
		// Click generate meal button
		// //div[@id='2019-12-19']//div[contains(@class,'single_day_view_container')]//div[contains(@class,'container')]//div[contains(@class,'row')]//div[contains(@class,'day_header col-12 col-lg-7 col-xl-6')]//div//div[contains(@class,'day_refresh_button svg-button inline-block')]//*[contains(@class,'etm-icon etm-icon-sm')]
		// <use xlink:href="#icon-refresh3"></use>
		return new MealPlannerPage();
	}
	
	public MealPlannerPage checkMealsForAllergies() throws Exception {
		// Locate meal planner box
		// Scan each child for allergies
		// Assert that item doesn't contain allergies for each child
		
		// //div[contains(@class,'meal_list meal_list_border col-12')]//div//div[1]//div[3]//div[1]//ul[1]
		return new MealPlannerPage();
	}
		
}
