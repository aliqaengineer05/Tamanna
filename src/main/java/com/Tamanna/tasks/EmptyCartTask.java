package com.Tamanna.tasks;

import com.Tamanna.interactions.ImplicitWait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.Tamanna.userinterfaces.ProductregisterUserinterfaces.*;
import static org.apache.commons.io.FileUtils.waitFor;

public class EmptyCartTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(REMOVE_PRODUCT_1),
                ImplicitWait.ofTime(3),
                Click.on(REMOVE_PRODUCT_1));
    }
    public static Performable removeitems() {
        return Tasks.instrumented(EmptyCartTask.class);
    }
}
