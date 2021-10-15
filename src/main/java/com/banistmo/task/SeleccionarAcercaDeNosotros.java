package com.banistmo.task;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.banistmo.userinterface.DescargaDocumento.ACERCA_DE_NOSOTROS;
import static com.banistmo.userinterface.DescargaDocumento.CLOSE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionarAcercaDeNosotros implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(CLOSE),
                WaitUntil.the(CLOSE, isVisible()),
                Click.on(CLOSE),
                WaitUntil.the(ACERCA_DE_NOSOTROS ,isVisible()),
                Click.on(ACERCA_DE_NOSOTROS)
        );

    }

    public static SeleccionarAcercaDeNosotros darClick() { return instrumented(SeleccionarAcercaDeNosotros.class); }

}
