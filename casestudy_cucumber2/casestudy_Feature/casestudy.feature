Feature: product purchase
      
@register
Scenario: Register to an application
Given Launch the browser
Given I open my application
And Click on SignUp
When I enter user Name as "bfcsjdffi"
And I enter First Name as "Rachana"
And I enter Last Name as "Paderu"
And I enter password as "rachana123"
And I enter Confirm Password as "rachana123"
And I select Gender as Female
And I enter E-Mail as "rachanapaderu@gmail.com"
And I enter Mobile Number as "9177000000"
And I enter DOB as "06/14/1998"
And I enter Address as "Koti,Hyderabad"
And I select any Security Question
And I enter Security answer as "Orange"
And I click on Register button
Then User must registered sucessfully

@Login
  Scenario Outline: Login
    Given user name is "<username>" and password is "<password>"
    When click on login
    Then home page is launched

    Examples:
      | username | password    |
      | lalitha  | password123 |
      
 @search 
 Scenario:
    Given user search for the required product
    When user clicks on Find Details
    And user clicks in Add To Cart 
    Then user shall be redirected to View Cart page
    
 @payment
    Scenario:
    Given user proceeds to checkout
    When  user proceeds to Pay
    And user enters the required details
    Then Order placed sucessfully

