package com.hmhco.hmhqe.testsuites;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/example/RunnableFeature.feature")
public class SerenityTestSuite {
}
