# New feature for second Stage
# Tags: @Purchases
# language: en
# Author : alejoil777@gmail.com

Feature: Make Web Purchases
    As a buyer in Women Store
    I want to be able to make purchases of the different products available in the store
    To obtain the products without having to go to a physical store, risking my safety and saving time

  @Purchases
  Scenario: Add 10 unique items to the shopping cart and then remove all the items from the shopping cart one by one
    Given there is a user browsing the 'main' web page
    When add 10 unique items to shopping cart
    And remove all items from shopping cart, one by one
    Then the shopping cart is empty