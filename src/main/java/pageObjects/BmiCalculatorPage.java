package pageObjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class BmiCalculatorPage extends BasePage{
	public @FindBy(xpath = "//div[@id='slider_weight']//a") WebElement weightSlider;
	public @FindBy(xpath = "//div[@id='slider_height_feet']//a") WebElement feetSlider;
	public @FindBy(xpath = "//div[@id='slider_height_inch']//a") WebElement inchesSlider;
	
	public BmiCalculatorPage() throws IOException {
		super();
	}
	
	public BmiCalculatorPage getBmiCalculatorPage() throws Exception {
		getDriver().get("https://www.acefitness.org/education-and-resources/lifestyle/tools-calculators/bmi-calculator");
		return new BmiCalculatorPage();
	}
	
	public BmiCalculatorPage enterWeight(int weight) throws Exception {
		int numberOfPresses = weight - 145;
		
		for (int i = 0; i < numberOfPresses ; i++)
		{
			weightSlider.sendKeys(Keys.ARROW_RIGHT);
		}
		return new BmiCalculatorPage();
	}
	
	public BmiCalculatorPage enterHeightFeet(int feet) throws Exception {
		Actions move = new Actions(driver);
		Action action = (Action) move.dragAndDropBy(feetSlider, offSetValue, 0).build();
		action.perform();
		return new BmiCalculatorPage();
	}
	
	public BmiCalculatorPage enterHeightInches() throws Exception {
		int offSetValuePerInch = 20;
		
		Actions move = new Actions(driver);
		Action action = (Action) move.dragAndDropBy(inchesSlider, offSetValuePerInch * 2, 0).build();
		action.perform();
		return new BmiCalculatorPage();
	}
	
	public BmiCalculatorPage confirmCorrectBMI() throws Exception {
		String expectedDisplayedBMI = "16.636";
		
		WebElement displayedBMI = getDriver().findElement(By.xpath("//input[@id='amount_bmi']"));
		WaitUntilWebElementIsVisible(displayedBMI);
		
		Assert.assertEquals(expectedDisplayedBMI, displayedBMI.getAttribute("value"));
		return new BmiCalculatorPage();
	}

}
