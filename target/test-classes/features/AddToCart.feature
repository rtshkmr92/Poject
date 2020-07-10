@regression
Feature: To test add to cart functionality

  @addtocart @sprint2
  Scenario Outline: Title of your scenario outline
    Given The user is in etsy home page
    When The user search for "<item>"
    And The user selects to add an item from search result
    And The user selects the colour, size and quantity
    And The user clicks the add to cart button
    Then The user should see the item added to the cart

    Examples: 
      | item        |
      | mens tshirt |

  @addtocart @sprint2
  Scenario Outline: Title of your scenario outline
    Given The user is in etsy home page
    When The user search for "<item>"
    And The user selects to add an item from search result
    And The user clicks the add to cart button
    Then The user should see the error message

    Examples: 
      | item        |
      | mens tshirt |
