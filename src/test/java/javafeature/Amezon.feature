Feature: Amezon Feature
@Tag1
  Scenario: Open Amezon website and navigate to any cart
    Given user is able open amezon
    When user navigates to amezon website
    And user click on cart button
    Then sucessfully cart page disaplyed
     
  @LoginTest
  Scenario: Login as a authenticated user
    Given user is on homepage
    When user navigates to Login Page
    And user enters username and Password
    Then success message is displayed
    
    @AmezonLogin
  Scenario: User should able to login in Amezon
    Given user is able open amezon
    When user click sign button
    And user enter email
    And user enter password
    And userclick on login button
    And user click on amezon search button
    And user click on search button
    
    Then success message is displayed
    
    @AmezonDuplicate
    Scenario: User should able to login in Amezon
    Given  Hansini should open  Amezon website
    When Hansini should click on sign in button
    And Hansini enter email
    And Hansini enter password
    And Hansini clicks  on login button
    Then success message is displayed
    
     @Amit
  Scenario: checking functionality of inbox tab
    Given user should able to open Gmailwebsite "https://www.gmail.com"
    And user should enter email "pazdfd@gmail.com"
    And user clciks on next button 
    And user should enter password "Xm@20gg16"
    And user clciks on next button
    Then sucessfully loggned in Account
    
    
    
    