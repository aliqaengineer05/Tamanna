package com.Tamanna.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.Tamanna.userinterfaces.ProductregisterUserinterfaces.*;

public class TotalAmountZero implements Question <Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return ZERO_TOTAL.resolveFor(actor).getText().equals("KWD 0.000");
    }
    public static TotalAmountZero theAmount() {
        return new TotalAmountZero();
    }
}
