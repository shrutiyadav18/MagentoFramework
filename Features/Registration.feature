Feature: Magento Website
@Test
Scenario Outline: Successful Account Registration
    Given the user navigates to create Account page
    When the user enters the <firstName> <lastName> <email> <password> <confirmPassword> into  fields
    Then the user account should get created successfully
    Examples:
     | firstName | lastName | email  | password | confirmPassword |
     | "Test5FN" | "Test5LN" | "test518@gmail.com"  | "test5@123" | "test5@123" |
@Test
Scenario Outline: User logs in with valid credentials
    Given I am on the login page
    When I enter valid login credentials <email> <password>
    Then I should be logged in and redirected to My Account Page
     Examples:
     | email  | password |
     | "test418@gmail.com"  | "test4@123" | 
@Test
Scenario Outline: User logs in with invalid credentials
    Given I am on the sign page
    When I enter invalid login credentials <email> <password>
    Then I should see an error message "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later."
    Examples:
     | email  | password |
     | "test00@gmail.com"   | "test4@233" |
     | "test418@gmail.com"  | "test4@233" |
     | "test00@gmail.com"   | "test4@123" |
     