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

import cucumber.api.DataTable;

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
		
		for (int i = 0; i < numberOfPresses ; i++) {
			weightSlider.sendKeys(Keys.ARROW_RIGHT);
		}
		
		return new BmiCalculatorPage();
	}
	
	public BmiCalculatorPage enterHeightFeet(int feet) throws Exception {
		int offSetValuePerFoot = 40;
		int offSetValue = 0;
		
		if (feet < 5) {
			offSetValue = offSetValuePerFoot * (5 - feet);
			offSetValue = -offSetValue;
		}
		
		if (feet > 5) {
			offSetValue = offSetValuePerFoot * (feet - 5);
		}
		
		Actions move = new Actions(driver);
		Action action = (Action) move.dragAndDropBy(feetSlider, offSetValue, 0).build();
		action.perform();
		
		return new BmiCalculatorPage();
	}
	
	public BmiCalculatorPage enterHeightInches(DataTable inchDataTable, int row, int column) throws Exception {
		List<List<String>> inchData = inchDataTable.raw();
		int offSetValuePerInch = 20;
		int offSetValue = 0;
		
		int inches = Integer.parseInt(inchData.get(row).get(column));
		
		if (inches < 7 ) {
			offSetValue = offSetValuePerInch * (7 - inches);
			offSetValue = -offSetValue;
		}
		
		if (inches > 7) {
			offSetValue = offSetValuePerInch * (inches - 7);
		}
		
		Actions move = new Actions(driver);
		Action action = (Action) move.dragAndDropBy(inchesSlider, offSetValue, 0).build();
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
