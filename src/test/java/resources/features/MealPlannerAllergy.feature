Feature: Check that meal planner doesn't recommend meals containing ingredients are listed as allergies in the Diet Exclusions setting

Scenario: Generated meals do not contain items listed as allergies
	Given user logged in as a registered user
	And user has selected common allergies from the Diet Exclusions setting
	When user navigates to the meal planner page
	And user clicks the meal generation button
	Then the meal planner should not show any meals with allergies