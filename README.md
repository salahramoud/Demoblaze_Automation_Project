# Demoblaze Automation Testing Framework

## Overview

This project is a UI Automation Testing Framework for the Demoblaze website using Selenium WebDriver and TestNG.

The framework follows the Page Object Model (POM) design pattern to improve maintainability, readability, and scalability.

## Tech Stack

* Java
* Selenium WebDriver
* TestNG
* Maven
* GitHub Actions
* WebDriverManager
* Page Object Model (POM)

## Project Structure

```text
src
└── test
    └── java
        └── com.demoblaze
            ├── base
            ├── config
            ├── factory
            ├── pages
            ├── testcases
            └── utils
```

### Packages Description

| Package   | Description                                         |
| --------- | --------------------------------------------------- |
| base      | Contains BaseTest and common setup/teardown methods |
| config    | Configuration files and project settings            |
| factory   | Driver initialization and management                |
| pages     | Page Object classes                                 |
| testcases | Test classes                                        |
| utils     | Utility and helper methods                          |

## Test Scenarios

### Login Tests

* Valid Login

### Sign Up Tests

* Register a new user
* Validate registration messages

### Add To Cart Tests

* Select product
* Add product to cart
* Verify cart contents

### Complete Order Tests

* Place order successfully
* Verify order confirmation

## Design Pattern

The framework uses:

* Page Object Model (POM)
* Factory Pattern

## Running Tests Locally

Clone the repository:

```bash
git clone https://github.com/salahramoud/Demoblaze_Automation_Project.git
```

Navigate to the project directory:

```bash
cd Demoblaze_project
```

Run tests:

```bash
mvn clean test
```

## Continuous Integration

GitHub Actions is configured to automatically execute tests on every push to the repository.

Workflow file:

```text
.github/workflows/selenium.yml
```

## Author

Salah Eldin Ibrahim Amin

Electronics and Communication Engineer

Interested in:

* Software Testing
* Test Automation
* Embedded Systems
