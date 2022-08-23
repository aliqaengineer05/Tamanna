package com.Tamanna.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static com.Tamanna.userinterfaces.ProductregisterUserinterfaces.*;

public class BeautyTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_BEAUTY));
    }
    public static Performable theBeautyCat(){return Tasks.instrumented(BeautyTask.class);}
}
