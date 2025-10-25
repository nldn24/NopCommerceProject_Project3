# 🛒 NopCommerce Test Automation Project

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=java)
![Selenium](https://img.shields.io/badge/Selenium-4.36.0-green?style=for-the-badge&logo=selenium)
![TestNG](https://img.shields.io/badge/TestNG-7.11.0-red?style=for-the-badge)
![Maven](https://img.shields.io/badge/Maven-3.2.5+-blue?style=for-the-badge&logo=apache-maven)

**Automated GUI Testing Framework for NopCommerce E-commerce Platform**

[Demo Site](https://demo.nopcommerce.com/) • [Report an Issue](https://github.com/nldn24/NopCommerceProject_Project3/issues)

## 📋 About The Project

This project is a comprehensive GUI test automation framework developed for the [NopCommerce](https://demo.nopcommerce.com/) e-commerce platform. Built with **Selenium WebDriver** and **TestNG**, it follows industry best practices and implements the Page Object Model design pattern.

### ✨ Key Features

- ✅ User-Story driven test structure (BDD-like approach)
- ✅ Page Object Model (POM) design pattern
- ✅ Comprehensive logging with Log4j
- ✅ Detailed test reporting with Allure
- ✅ Configurable test environment
- ✅ Cross-browser support ready


## 🛠️ Tech Stack

| Technology | Version | Purpose |
|:-----------|:--------|:--------|
| **Java** | 21 | Programming Language |
| **Selenium WebDriver** | 4.36.0 | Browser Automation |
| **TestNG** | 7.11.0 | Test Framework & Management |
| **Maven** | 3.2.5+ | Build & Dependency Management |
| **Allure** | 2.30.0 | Test Reporting |
| **Log4j** | 3.0 | Logging Framework |
| **Jackson** | 2.20.0 | JSON Data Binding |


## 📝 Test Scenarios (User Stories)

The project covers 8 comprehensive user stories:

| ID | User Story | Description |
|:---|:-----------|:------------|
| 🔐 **US_501** | User Registration | New user account creation flow |
| 🔑 **US_502** | User Login | User authentication process |
| ✅ **US_503** | Login Combinations | Positive & negative login scenarios |
| 🧭 **US_504** | Tab Menu Control | Navigation menu functionality |
| 🛍️ **US_505** | Products in Tab Menu | Product visibility and control |
| 🎁 **US_506** | Gift Ordering Process | Complete gift purchase workflow |
| 💻 **US_507** | Computer Ordering Process | Computer product purchase flow |
| 🔍 **US_508** | Parameterized Search | Advanced search functionality |


## 📁 Project Structure

```
NopCommerceProject_Project3/
│
├── 📄 pom.xml                          # Maven configuration
├── 📄 README.md                        # Project documentation
│
└── src/
    ├── main/java/
    │   └── Pages/                      # Page Object Model classes
    │       └── BasePage.java           # Base page with common methods
    │
    └── test/
        ├── java/
        │   ├── US_501_UserRegistration/
        │   ├── US_502_UserLogin/
        │   ├── US_503_PositiveAndNegativeLoginCombinations/
        │   ├── US_504_TabMenuControl/
        │   ├── US_505_ControlOfProductsInTheTABMenu/
        │   ├── US_506_GiftOrderingProcess/
        │   ├── US_507_ComputerOrderProcess/
        │   ├── US_508_ParameterizedSearchProcess/
        │   │
        │   └── utility/                # Utility classes
        │       ├── BaseDriver.java     # WebDriver initialization
        │       ├── BaseGUITest.java    # Base test class
        │       └── ConfigReader.java   # Configuration reader
        │
        └── resources/
            └── configuration.properties # Test configuration file
```

## ⚙️ Configuration

Test environment settings are managed in `src/test/resources/configuration.properties` file, including application URL, user credentials, and timeout configurations.


## 🏗️ Design Pattern

This project implements the **Page Object Model (POM)** design pattern, which provides:

- 🎯 **Better code organization** - Separation of test logic and page elements
- 🔄 **Reusability** - Common methods in BasePage class
- 🛡️ **Maintainability** - Easy to update when UI changes
- 📖 **Readability** - Clear and structured test code


## 📊 Test Reporting

The project uses **Allure Framework** for generating beautiful, interactive test reports:

- 📈 Test execution statistics
- 📋 Detailed test steps
- 🖼️ Screenshots on failure
- ⏱️ Execution time tracking
- 📝 Comprehensive logs