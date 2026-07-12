Feature: Shopping Cart
  Scenario: Add a single item to cart
    Given the user has selected a product
    When they click "Add to Cart"
    Then the cart count should increase to "1"