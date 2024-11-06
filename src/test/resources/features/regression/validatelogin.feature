Feature: To validate login functionality
@wip0411 @smoke 

Scenario: To valide login using valid credentials
Given user starts "chrome" browser
And user launch using url "https://adactinhotelapp.com/"
When user enters text "susmitha410" in textbox using xpath "//input[@name='username']"
And user enters text "Susmitha@275" in textbox using xpath "//input[@name='password']"
And user clicks button using xpath "//input[@name='login']"
Then user verifies title to be "Adactin.com - Search Hotel"

