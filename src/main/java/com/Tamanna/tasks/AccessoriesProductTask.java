package com.Tamanna.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static com.Tamanna.userinterfaces.ProductregisterUserinterfaces.BTN_ACCESSORIES_PRODUCT;

public class AccessoriesProductTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
               // ImplicitWait.ofTime(2),
                Click.on(BTN_ACCESSORIES_PRODUCT));
    }
    public static Performable inAccessoriesProduct(){return Tasks.instrumented(AccessoriesProductTask.class);
    }

}
