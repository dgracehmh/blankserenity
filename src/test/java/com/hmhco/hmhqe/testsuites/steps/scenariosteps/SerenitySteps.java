package com.hmhco.hmhqe.testsuites.steps.scenariosteps;


import com.hmhco.hmhqe.testsuites.steps.serenity.SerenityPageSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * Created by graced on 21/09/2017.
 */
public class SerenitySteps {

    @Steps
    private SerenityPageSteps serenityPageSteps;


    @Given("The user launchs Serenity site")
    public void launchSite() {
        serenityPageSteps.openSerenityUrl();
    }

    @When("The user navigates to Documentation then to What Is Serenity")
    public void navigateToDocumentationAndWhatIs() {
        serenityPageSteps.navigateToDocumentation();
        serenityPageSteps.navigateToWhatIsSerenity();
    }

    @Then("The user can see Serenity Icon")
    public void verifySerenityIcon() {
        serenityPageSteps.verifySerenityIcon();
    }

    @Then("The horse can see Serenity Icon Fail")
    public void verifySerenityIconFail() {
        serenityPageSteps.verifySerenityIconFail();
    }


}
