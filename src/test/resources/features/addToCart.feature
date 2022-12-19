@Web
Feature: Search Feature

Background: User already login
  Given user input "standard_user" and "secret_sauce"
  And user click login button
  Then user success login with valid account


  Scenario: Add To Cart
    Given user already on product page
    And user click add to cart
    Then user can see the shopping cart added

  Scenario: Remove item added
    Given user already on product page
    And user already add item to cart
    And user click remove button on item add
    Then user can see item removed from shopping cart

  @Sort1
  Scenario: Sort item descending Z to A
    Given user already on product page
    And user click sort dropdown
    Then user choose Name (Z to A)
    And user can see item sorted by name from Z to A

  @Sort2
  Scenario: Sort item by Price from low to high
    Given user already on product page
    And user click sort dropdown
    Then user choose Price (low to high)
    And user can see item sorted by price from low to high

  @Sort3
  Scenario: Sort item by Price from high to low
    Given user already on product page
    And user click sort dropdown
    Then user choose Price (high to low)
    And user can see item sorted by price from high to low

  Scenario: User logout
    Given user already on product page
    And user click sidebar
    And user click logout button
    Then user is now logout from saucedemo
















