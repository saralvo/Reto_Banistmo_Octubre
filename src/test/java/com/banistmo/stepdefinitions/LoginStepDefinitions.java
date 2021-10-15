package com.banistmo.stepdefinitions;

import com.banistmo.userinterface.InicioDeSesion;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class LoginStepDefinitions {

    private InicioDeSesion pagina;

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.aNewActor().can(
                BrowseTheWeb.with(driver));
    }

    @Cuando("^Lucia intenta abrir la pagina$")
    public void luciaIntentaAbrirLaPagina() {
        theActorCalled("actor").attemptsTo(
                Open.browserOn(pagina)
        );
    }

    @Entonces("^deberia ver el inicio de sesion$")
    public void deberiaVerElInicioDeSesion() {

    }



}
