package com.Tamanna.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenBrowser implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Open.url("https://www.tamanna.com/"));
    }
    public static Performable tamanna(){
        return instrumented(OpenBrowser.class);
    }
}


