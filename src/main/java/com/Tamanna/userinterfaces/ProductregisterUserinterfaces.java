package com.Tamanna.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductregisterUserinterfaces {

    public static final Target BTN_WOMEN = Target.the("button women").locatedBy("(//a[@href='/women/overview'])[1]");
    public static final Target BTN_MEN = Target.the("button men").locatedBy("(//a[@href='/men/overview'])[1]");
    public static final Target BTN_BEAUTY = Target.the("button clothing").locatedBy("//a[@href='/women-beauty']");
    public static final Target BTN_ACCESSORIES = Target.the("button accessories").locatedBy("//a[@href='/men-accessories']");
    public static final Target BTN_BEAUTY_PRODUCT = Target.the("button dresses").locatedBy("(//div[@data-cy='product-grid']//div)[1]");
    public static final Target BTN_ACCESSORIES_PRODUCT= Target.the("accessories product").locatedBy("//div[@id='__next']/div/div[2]/main/div/div[3]/div[2]/div[2]/div[2]/div/div/a/div/span/img");
    public static final Target BTN_HOME = Target.the("button home").locatedBy("svg");
    public static final Target BTN_ADD_TO_CART = Target.the("button dresses").locatedBy("//button[text()='Add to cart']");
    public static final Target BTN_CART = Target.the("cart").locatedBy("//span[2]");
    public static final Target BTN_SHOPPING_BAG = Target.the("shopping bag").locatedBy("//button[text()='GO TO SHOPPING BAG']");
    public static final Target TOTAL = Target.the("total price").locatedBy("//p[text()='Total']/following-sibling::p");
    public static final Target REMOVE_PRODUCT_1 = Target.the("Product").locatedBy("(//button)[6]");
    public static final Target REMOVE_PRODUCT_2 = Target.the("Product").locatedBy("//h3[text()='1 item']");
    public static final Target AUTENTICATION = Target.the("autentication").locatedBy("//*[@class = 'icon-user left']");
    public static final Target WOMEN_PRODUCT_PRICE = Target.the("autentication").locatedBy("(.//*[normalize-space(text()) and normalize-space(.)='GO TO SHOPPING BAG'])[1]/preceding::p[12]");
    public static final Target MEN_PRODUCT_PRICE = Target.the("autentication").locatedBy("(.//*[normalize-space(text()) and normalize-space(.)='GO TO SHOPPING BAG'])[1]/preceding::p[8]");
    public static final Target ZERO_TOTAL = Target.the("autentication").locatedBy("(//p[text()='KWD 0.000'])[2]");



}
