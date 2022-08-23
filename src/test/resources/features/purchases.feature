Feature: User can add multiple items to cart

  @GuestUserCanAddWomenBeautyProduct
  Scenario: User can add women Beauty
    Given The user is on Homepage
    When the user clicks Women
    And user clicks Beauty
    And user clicks Beauty Product
    Then user clicks on add to cart

  @GuestUserCanAddMenAccessories
  Scenario: user can add men accessories
    Given the user is on Homepage
    When the user clicks Men
    And User Clicks Accessories
    And User Clicks Accessories product
    Then user clicks on add to cart

  @GuestUserVerifiesShoppingBagHasProductPriceAndQuantity
  Scenario: user verifies shopping cart has 2 items in cart
    Given the user is on Homepage
    When the user clicks Cart
    And User Clicks ShoppingBag
    And user verifies the total price
    And User Clicks on RemoveItems from Cart
    Then User verifies that total is zero
    #And user is taken to the Authentication screen