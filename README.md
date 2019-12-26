# Behavior Driven Development Testing Framework

BDD testing framework built using Java, JUnit, Selenium, and Cucumber using Gherkin syntax.

This framework is designed to run various automated tests in the browser using Selenium.

Examples of current tests that are set up:
- Navigate to BMI Calculator and ensure correct output given specific input.
- Navigate to login screen and ensure user has made it to landing page after entering correct login details.
- Navigate to contact form and ensure correct message is displayed after submitting correct contact form details.
- Navigate to product page and ensure alert box is displayed with correct promo code after clicking product link.

This is a work in progress and I'm currently adding new features. 

## Installation

1. Install Maven dependencies.

```
mvn install
```

## Executing tests

1. Run Maven command in terminal to execute tests.

```
mvn test
```

## Changing configuration properties

Use the config.properties folder to configure properties.

1. Change webdriver type.

```
browser=chrome
```

## Built With

- Java
- Maven
- Selenium
- Cucumber
- Junit
- Eclipse

## Screenshots

![Coming Soon](https://upload.wikimedia.org/wikipedia/commons/8/80/Comingsoon.png "Coming Soon")

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
