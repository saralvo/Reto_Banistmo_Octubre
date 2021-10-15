package com.banistmo.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://empresas.banistmolabs.com/login")

public class InicioDeSesion extends PageObject {
    public static final Target USERNAME = Target.the("username").located(By.id("inp_user"));

}
