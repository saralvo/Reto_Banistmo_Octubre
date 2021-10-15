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

    public static final Target INFORMACION_COORPORATIVA = Target.the("informacion")
            .locatedBy("//a[@id='serv']");

    public static final Target PROVEEDORES = Target.the("proveedores")
            .locatedBy("//a[contains(text(),'Proveedores')]");

    public static final Target POLITICAS_TRATAMIENTO = Target.the("politicas tratamiento")
            .locatedBy("//h2[contains(text(),'Políticas de tratamiento y de protección de datos ')]");

    public static final Target DESCARGA= Target.the("descarga")
            .locatedBy("(//a[contains(text(),'Descarga el documento')])[2]");

    public static final Target TITULO= Target.the("titulo")
            .locatedBy("//*[@id=\"title\"]/text(políticas-tratamiento-y-protección-de-datos-personales-de-proveedores-grupo-bancolombia.pdf.pdf)");

}
