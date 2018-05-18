package com.hmhco.hmhqe.testsuites.steps.serenity;

import com.hmhco.hmhqe.pages.BrightcoveVideoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class BrightcovePageSteps extends ScenarioSteps {


    @Steps
    private BrightcoveVideoPage brightcoveVideoPage;

    @Step
    public void openVideoUrl(String url) {
        brightcoveVideoPage.openAt(url);
    }

    @Step
    public void grabNetworkLogs() {
        brightcoveVideoPage.getTheLogs();
    }

}
