package com.Tamanna.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/purchases.feature",
        glue = "com.Tamanna.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class PurchasesRunner {
}


