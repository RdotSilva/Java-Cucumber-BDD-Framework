Feature: Submit data to acefitness.org using BMI calculator

Scenario: Submit valid data via BMI calculator
	Given I access acefitness BMI calculator
	When I enter a valid weight
	When I enter a valid height in feet
	| 4 | 5 | 6 |
	When I enter a valid height in inches
	Then The estimated BMI value should be displayed correctly