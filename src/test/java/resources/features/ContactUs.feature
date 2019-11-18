Feature: Submit data to webdriveruniversity.com using contact us form

Scenario: Submit valid data via contact us form
	Given I access webdriveruniversity contact us form
	When I enter a valid first name
	When I enter a valid last name
	| woods | jackson | jones |
	And I enter a valid email address
	And I enter comments
	| example comment one | example comment two |
	When I click on the submit button
	Then the information should successfully be submitted via the contact us form