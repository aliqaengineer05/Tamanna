package com.Tamanna.questions;

import com.Tamanna.interactions.ImplicitWait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

import static com.Tamanna.userinterfaces.ProductregisterUserinterfaces.*;

public class TotalValidatePrice implements Question <Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        BTN_CART.resolveFor(actor).click();
        String Item_1_Price = WOMEN_PRODUCT_PRICE.resolveFor(actor).getText().replace("KWD", "").toString();
        ImplicitWait.ofTime(2);
        String Item_2_Price = MEN_PRODUCT_PRICE.resolveFor(actor).getText().replace("KWD", "").toString();
        String MiniCartPrice = Item_1_Price+Item_2_Price;
        System.out.println(MiniCartPrice);
        actor.attemptsTo(
                Click.on(BTN_SHOPPING_BAG)
        );
        String OrderTotal = TOTAL.resolveFor(actor).getText().replace("KWD", "").toString();
        return OrderTotal.equals(MiniCartPrice);

    }


    public static TotalValidatePrice theCartProducts() {
        return new TotalValidatePrice();
    }
}
