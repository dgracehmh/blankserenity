package com.hmhco.hmhqe.testsuites.steps.scenariosteps;

import com.hmhco.hmhqe.testsuites.steps.serenity.BrightcovePageSteps;
import com.hmhco.hmhqe.testsuites.steps.serenity.SerenityPageSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BrightcoveSteps {

    @Steps
    private BrightcovePageSteps brightcovePageSteps;


    @Given("I launch '(.*)' in headless browser")
    public void launchVideoUrl(String url) {
        brightcovePageSteps.openVideoUrl(url);
    }


    @Given("I grab the network logs")
    public void grabTheLogs() {
        brightcovePageSteps.grabNetworkLogs();
    }
}
