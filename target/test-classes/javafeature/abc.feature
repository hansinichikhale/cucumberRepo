Feature: Amezon Feature
@GmailLoginTestcase
  Scenario: Open Gmail Website
    Given user should able to open Gmail
    When user should enter email
    And user should enter password
    And User should click on login button
    Then sucessfully display homepage
     
  @Amit
  Scenario: checking functionality of inbox tab
    Given user should able to open Gmailwebsite "https://www.bigbasket.com/auth/login/"
    And user should en1ter email ""
    And user clciks on next button 
    And user should enter password ""
    And user clciks on next button
    Then sucessfully loggned in Account
    
    @LOGout 
    Scenario: checking functionality of logout tab
    Given user should able to open Gmail
    When user should enter email
    And user should enter password
    And User should click on login button
    And user should click on logout tab
    Then sucessfully user should be logout
    
    @Flipkart1
    Scenario: cheking functionality of flipkart website
    Given user should be able to open flipkart website "https://www.flipkart.com"
    And user should click on login & signup  button
    And user should enter mobile number "123456789"
    And user should enter flipkart password "X1222"
    And user should click on login button
    And user should click on men tab
    And user should click on clothing tab
    And user should click on t-shirts tab button
    Then successfully display the page
    
    @FlipkartProduct
    Scenario Outline: cheking functionality of flipkart website-product
    Given user should be able to open flipkart website "https://www.amazon.in/"
    And user should enter "<productname>" in searchbox.
   # And user should click on search button.
    Then user should able to view products.
    Examples:
    |productname|
    |Shoes|
    |mobiles|
    |laptop|
    