package com.banistmo.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.banistmo.userinterface.DescargaDocumento.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionarInformacionCoorporativa implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(INFORMACION_COORPORATIVA, isVisible()),
                Click.on(INFORMACION_COORPORATIVA),
                WaitUntil.the(PROVEEDORES, isVisible()),
                Click.on(PROVEEDORES)
        );

    }

    public static SeleccionarInformacionCoorporativa seleccionar() { return instrumented(SeleccionarInformacionCoorporativa.class); }

}
