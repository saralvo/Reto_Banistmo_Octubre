package com.banistmo.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.grupobancolombia.com/")

public class DescargaDocumento extends PageObject {

    public static final Target CLOSE = Target.the("cerrar pantalla")
            .locatedBy("//*[@id=\"modal-prehome-fenix\"]/div/div/div[1]/button");

    public static final Target ACERCA_DE_NOSOTROS = Target.the("acerca de nosotros")
            .locatedBy("//*[@id=\"header-nosotros\"]");

}
