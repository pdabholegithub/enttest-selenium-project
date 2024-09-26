# enttest-selenium-project
**Project Overview**
This project is designed to automate web-based test cases using Selenium WebDriver with Java. The framework integrates with TestNG as the testing framework and Maven for dependency management. The project demonstrates common web automation scenarios like navigation, form interaction, assertions, and validations.

**Prerequisites**
Make sure you have the following installed on your machine:

Java (JDK 8 or higher)
Maven (for build management)
Selenium WebDriver
TestNG (testing framework)
Web browser (Chrome, Firefox, etc.)
IDE (Eclipse/IntelliJ IDEA)
**Installation**
**Clone the repository:**
git clone https://github.com/username/enttest-selenium-project.git
**Navigate to the project directory:**
cd enttest-selenium-project
**Import the project into your IDE:**
In Eclipse/IntelliJ, go to File -> Open Project and select the cloned folder.
Ensure that Maven is enabled in the IDE (for Eclipse, install the M2Eclipse plugin).
Install dependencies: The project uses Maven to manage dependencies, so all required libraries (like Selenium WebDriver) will be downloaded automatically.

**Run this Maven command to download the dependencies:**
mvn clean install
Configuration
Browser Configuration:
The project uses a config.properties file in the src/test/resources directory for configuration settings.
**Example config.properties:**
browser=chrome
baseUrl=https://www.example.com
driverPath=path/to/chromedriver
**TestNG Suite Configuration:**
Test cases are defined in the testng.xml file located in the root directory.
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Test">
    <classes>
      <class name="ent_test.test_Watch_Demo"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->
**Running the Tests**
You can run the tests using the following commands:
**Using Maven:**
mvn test
**Using TestNG:**
Right-click on testng.xml and select Run As -> TestNG Suite.
**Command to verify the build:**
**You can also run:**
mvn verify
This command ensures that the tests are executed after the build process is completed.

**Test Structure**
Page Object Model (POM):

All web page interactions are stored in Page Classes within the src/main/java/pages/ directory.
**Test Cases:**
Located in the src/test/java/testcases/ directory.
Test cases use the POM to interact with the web pages.
**Reporting**
After test execution, TestNG generates a detailed HTML report, which can be found in the test-output folder.

**Create a new branch:**
git checkout -b feature/your-feature-name
Make your changes.

**Commit and push the changes:**
git commit -m "Add your commit message"
git push origin feature/your-feature-name
Create a pull request, and it will be reviewed.
