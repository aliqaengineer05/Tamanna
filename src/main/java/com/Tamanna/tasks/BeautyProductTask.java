package com.Tamanna.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static com.Tamanna.userinterfaces.ProductregisterUserinterfaces.BTN_BEAUTY_PRODUCT;

public class BeautyProductTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_BEAUTY_PRODUCT));
    }
    public static Performable thebeautyproduct(){return Tasks.instrumented(BeautyProductTask.class);}
}
