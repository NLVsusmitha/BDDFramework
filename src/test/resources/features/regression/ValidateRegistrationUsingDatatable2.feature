Feature: To validate Registration functionality
@wip0411b
Scenario: To validate registration functionality  using valid data

Given user starts "chrome" browser
And user launch using url "https://adactinhotelapp.com/"
When user clicks link using xpath "//a[text()='New User Register Here']"
Then user verifies title to be "Adactin.com - New User Registration"
When user enters details in registration form2
|username|password|confirmpassword|fullname|email|captcha|
|susi|susi@123|susi@123|susmitha123|susmithanlv@gmail.com|sample|












