Feature: Check if a user can access the meal planner paged based on their login status

Scenario: User can access meal plan page
	Given user logged in as a registered user
	When user navigates to the eatthismuch.com website
	When user navigates to the login page
	When user enters a valid username
	When user enters a valid password
	Then user should be presented with the Meal Planner page
	
Scenario: User can not access meal plan page
	Given user is not logged in as a registered user
	When user navigates to the eatthismuch.com website
	Then user should be presented with the landing page