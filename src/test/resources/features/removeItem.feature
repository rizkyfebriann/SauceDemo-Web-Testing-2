@Web
Feature: Shopping Cart Feature

Background: User already login
  Given user already input valid username & password then login


    Scenario: Remove item from shopping cart
      Given user already add item on shopping cart
      And user remove item from cart
      Then item is removed from cart

    Scenario: User back to Product page
      Given user already on Shopping cart page
      And user click continue shopping button
      Then user back to Product page

    Scenario: User back to Product page and add other item
      Given user back to Product page
      And user add item like tshirt and jacket
      Then two item is added on the cart

    Scenario: User go to checkout Page
      Given user add item like tshirt and jacket
      And user go to Shopping cart page
      And user click Checkout button
      Then user is on Checkout page now