package com.Tamanna.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static com.Tamanna.userinterfaces.ProductregisterUserinterfaces.BTN_MEN;

public class MenTask implements Task {

    public static Performable theMen(){return Tasks.instrumented(MenTask.class);}


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_MEN));



    }
}
