Feature: To validate login functionality

Scenario Outline: To valide login using different combination of credentials

Given user starts "chrome" browser
And user launch using url "https://adactinhotelapp.com/"
When user enters text '<username>' in textbox using xpath "//input[@name='username']"
And user enters text '<password>' in textbox using xpath "//input[@name='password']"
And user clicks button using xpath "//input[@name='login']"
Then user verifies title to be '<expected title>'


Examples:
|username| password| expected title|
|susmitha410|Susmitha@275|Adactin.com - Search Hotel|
|susmitha40|Susmitha@275|Adactin.com - Hotel Reservation System|
|susmitha410|Susmitha123|Adactin.com - Hotel Reservation System|
|susmitha40|Susmitha123|Adactin.com - Hotel Reservation System|