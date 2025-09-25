# Selenium TestNG Project with Allure Reporting

This is a demo project for Selenium Page Object Model with Allure reporting.

### Pre-requisites
* Java
* Maven
* [Allure](https://docs.qameta.io/allure/#_installing_a_commandline)
* IntelliJ IDEA

### Additional Configs
1. Allure Report
2. Added Logs

### Steps
1. Clone this project
2. Open the project in Intellij IDEA
3. Run TestNG.XML
4. Open the terminal in Intellij IDEA
5. Execute **`allure serve allure-results`**

If you want to generate the report as a static HTML site:
- allure generate --single-file allure-results
- allure generate --single-file allure-results --clean -o allure-report

Above command will create allure html report in allure-report folder.

### Report -

<img width="1908" height="894" alt="image" src="https://github.com/user-attachments/assets/b8fc8206-bd5a-49a6-9f7a-ea020a6ebfb0" />
