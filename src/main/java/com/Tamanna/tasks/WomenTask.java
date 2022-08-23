package com.Tamanna.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.Tamanna.userinterfaces.ProductregisterUserinterfaces.*;

public class WomenTask implements Task {

    public static Performable theWomen(){return Tasks.instrumented(WomenTask.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_WOMEN));


    }
}
