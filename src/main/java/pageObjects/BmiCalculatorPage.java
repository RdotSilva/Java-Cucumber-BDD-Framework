package pageObjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class BmiCalculatorPage extends BasePage{
	public @FindBy(xpath = "//div[@id='slider_weight']//a[@class='ui-slider-handle']") WebElement weightSlider;
	public @FindBy(xpath = "//div[@id='slider_height_feet']//a[@class='ui-slider-handle']]") WebElement feetSlider;
	public @FindBy(xpath = "//div[@id='slider_height_inch']//a[@class='ui-slider-handle']") WebElement inchesSlider;
	
	public BmiCalculatorPage() throws IOException {
		super();
	}
	
	public BmiCalculatorPage getContactUsPage() throws Exception {
		getDriver().get("https://www.acefitness.org/education-and-resources/lifestyle/tools-calculators/bmi-calculator");
		return new BmiCalculatorPage();
	}
	
	public BmiCalculatorPage enterWeight() throws Exception {
		Actions move = new Actions(driver);
		Action action = (Action) move.dragAndDropBy(weightSlider, 30, 0).build();
		action.perform();
		return new BmiCalculatorPage();
	}
	
	public BmiCalculatorPage enterHeightFeet() throws Exception {
		Actions move = new Actions(driver);
		Action action = (Action) move.dragAndDropBy(feetSlider, 30, 0).build();
		action.perform();
		return new BmiCalculatorPage();
	}
	
	public BmiCalculatorPage enterHeightInches(String inches) throws Exception {
		Actions move = new Actions(driver);
		Action action = (Action) move.dragAndDropBy(inchesSlider, 30, 0).build();
		action.perform();
		return new BmiCalculatorPage();
	}
	
	public BmiCalculatorPage confirmCorrectBMI() throws Exception {
		
		WebElement expectedBMI = getDriver().findElement(By.xpath("//input[@id='amount_bmi']"));
		WaitUntilWebElementIsVisible(expectedBMI);
		Assert.assertEquals(22.76, expectedBMI.getAttribute("value"));
		return new BmiCalculatorPage();
	}

}
