package com.Tamanna.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

import static com.Tamanna.userinterfaces.ProductregisterUserinterfaces.BTN_CART;

public class CartTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(BTN_CART),
                Click.on(BTN_CART));
    }

    public static Performable theCart() {
        return Tasks.instrumented(CartTask.class);
    }
}
