# LimecsFeedbackFormTesting

The purpose of this autotest to check whether there is a sending a message via the feedback form at filling fields are not valid data (on GoogleChrome).

Autotest  fills the field "name", "email" , "message" and click a button to send. 

It is necessary to specify the location of the chrome driver:
This can be done in the Action.startDriver

You must specify the location of where to write logs:
This can be done in the /src/main/resources/log4j.properties

IDE: Intellij Idea
PL: Java
Test framework: Junit
Webdriver: Selenium WebDriver
Logger: log4j
Assembly: Maven
