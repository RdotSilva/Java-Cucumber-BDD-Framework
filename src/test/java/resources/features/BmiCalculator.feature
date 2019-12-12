Feature: Submit data to acefitness.org using BMI calculator

Scenario: Submit valid data via BMI calculator
	Given I access acefitness BMI calculator
	When I enter a valid weight
	When I enter a valid height in feet
	When I enter a valid height in inches
	| 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 |
	Then The estimated BMI value should be displayed correctly