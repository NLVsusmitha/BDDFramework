Feature: To validate Registration functionality
@wip0411a
Scenario: To validate registration functionality  using valid data

Given user starts "chrome" browser
And user launch using url "https://adactinhotelapp.com/"
When user clicks link using xpath "//a[text()='New User Register Here']"
Then user verifies title to be "Adactin.com - New User Registration"
When user enters text "susi" in textbox using xpath "//input[@name='username']"
And user enters text "susi@123" in textbox using xpath "//input[@name='password']"
And user enters text "susi@123" in textbox using xpath "//input[@name='re_password']"
And user enters text "susmitha123" in textbox using xpath "//input[@name='full_name']"
And user enters text "susmithanlv@gmail.com" in textbox using xpath "//input[@name='email_add']"
And user enters text "sample" in textbox using xpath "//input[@name='captcha']"












