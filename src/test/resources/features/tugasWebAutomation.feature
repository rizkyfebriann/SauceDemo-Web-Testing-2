@Web
Feature: Continue Shopping

  Background: User already login & add 1 item
    Given user login with "standard_user" and "secret_sauce"
    Then add one item to cart

  Scenario: Continue shopping
    Given user already add one item to cart
    And user sort all item on Product page by Name (Z to A)
    And user add first sorted item (jacket)
    Then user see two item now added on shopping cart
    And user go to shopping cart page
    And user remove last added item on shopping cart
    Then user continue shopping again