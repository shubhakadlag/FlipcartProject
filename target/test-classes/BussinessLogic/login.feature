Feature: Login Functionality
Background: User is on Flipcartmain page and mouse over on login button
Given user open "Chrome" browser with exe "D:\\software testing\\Automation Support\\chromedriver.exe"
Given user enter url as "https://www.flipkart.com/"
Given user cancle initial Login window
Given user move on Login button



@SmokeTest
Scenario: Login functionality with valid credentials
When user click on my profile
When user enter "kadlagshubhangi@gmail.com" as username
When user enter "12shubha" as password
When user click on login button
Then Application shows profile to user
