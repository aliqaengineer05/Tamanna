package com.Tamanna.tasks;

import com.Tamanna.interactions.ImplicitWait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static com.Tamanna.userinterfaces.ProductregisterUserinterfaces.*;

public class AddToCartTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ADD_TO_CART),
                ImplicitWait.ofTime(2));
    }
    public static Performable inAddCart() {return Tasks.instrumented(AddToCartTask.class);
    }
}
