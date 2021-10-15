package com.banistmo.stepdefinitions;

import com.banistmo.task.SeleccionarAcercaDeNosotros;
import com.banistmo.userinterface.DescargaDocumento;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DescargaStepDefinitions {

    private DescargaDocumento pagina;

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.aNewActor().can(
                BrowseTheWeb.with(driver));
    }

    @Dado("^que Sara abre la pagina de bancolombia$")
    public void queSaraAbreLaPaginaDeBancolombia() {
        theActorCalled("actor").attemptsTo(
                Open.browserOn(pagina)
        );
    }


    @Dado("^que va a la sesion de proveedores$")
    public void queVaALaSesionDeProveedores() {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarAcercaDeNosotros.darClick()
        );
    }

    @Cuando("^intenta descargar el documento$")
    public void intentaDescargarElDocumento() {
    }

    @Entonces("^deberia ver el archivo$")
    public void deberiaVerElArchivo() {
    }


}
