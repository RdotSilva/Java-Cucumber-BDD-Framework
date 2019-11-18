Feature: Products

Scenario Outline: Validate promo code alert is visible when clicking on the special offers link
	Given user navigates to "<url>" website
	When user clicks on "<button>"
	Then user should be presented with a promo alert
	
	Examples:
	|				url														|				button				|
	| http://www.webdriveruniversity.com/Page-Object-Model/products.html	| 		#container-special-offers	|