@Web
Feature: Checkout item

Background:
  Given user input "standard_user" and "secret_sauce"
  And user click login button
  Then user success login with valid account
  And user click add to cart
  Then user can see the shopping cart added
  And user go to Shopping cart page
  And user click Checkout button


  @CheckoutItem
  Scenario: Checkout Item
    And user input "Rizky" and "Febrian" and "101010"
    And user click continue button
    Then user can see checkout overview
    And user click finish button
    Then user can see success checkout