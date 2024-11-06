Feature: To validate login functionality

Background: to start browser and launch app
Given user starts "chrome" browser
And user launch using url "https://adactinhotelapp.com/"

Scenario: To valide login using valid credentials


When user enters text "susmitha410" in textbox using xpath "//input[@name='username']"
And user enters text "Susmitha@275" in textbox using xpath "//input[@name='password']"
And user clicks button using xpath "//input[@name='login']"
Then user verifies title to be "Adactin.com - Search Hotel"


Scenario: To valide login using valid and invalid  credentials


When user enters text "susmitha410" in textbox using xpath "//input[@name='username']"
And user enters text "Susmitha@5" in textbox using xpath "//input[@name='password']"
And user clicks button using xpath "//input[@name='login']"
Then user verifies title to be "Adactin.com - Hotel Reservation System"

Scenario: To valide login using invalid and valid  credentials


When user enters text "susmitha40" in textbox using xpath "//input[@name='username']"
And user enters text "Susmitha@275" in textbox using xpath "//input[@name='password']"
And user clicks button using xpath "//input[@name='login']"
Then user verifies title to be "Adactin.com - Hotel Reservation System"

Scenario: To valide login using invalid and invalid  credentials


When user enters text "susmitha40" in textbox using xpath "//input[@name='username']"
And user enters text "Susmitha@5" in textbox using xpath "//input[@name='password']"
And user clicks button using xpath "//input[@name='login']"
Then user verifies title to be "Adactin.com - Hotel Reservation System"

