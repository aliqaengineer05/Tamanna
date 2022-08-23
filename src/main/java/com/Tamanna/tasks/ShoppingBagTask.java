package com.Tamanna.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.Tamanna.userinterfaces.ProductregisterUserinterfaces.BTN_SHOPPING_BAG;

public class ShoppingBagTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SHOPPING_BAG)
        );
    }

    public static Performable inShoppingBag() {
        return Tasks.instrumented(ShoppingBagTask.class);
    }
}
