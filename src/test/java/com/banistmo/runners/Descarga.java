package com.banistmo.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/descarga_documento.feature",
        glue = {"com.banistmo.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class Descarga {
}
