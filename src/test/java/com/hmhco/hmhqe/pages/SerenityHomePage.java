package com.hmhco.hmhqe.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;


public class SerenityHomePage extends PageObject {


    @FindBy(id = "documentation")
    public WebElementFacade lnkDocumentation;

    @FindBy(id = "whatisserenity")
    public WebElementFacade lnkWhatIsSerenity;

    @FindBy(id = "home")
    public WebElementFacade serenityIcon;

    @FindBy(id = "arse")
    public WebElementFacade arseIcon;


    public void navigateToDocumentation() {
        lnkDocumentation.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void navigateToWhatIsSerenity() {
        lnkWhatIsSerenity.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void verifyIcon() {
        Assert.assertTrue("Serenity Icon is enabled", serenityIcon.isCurrentlyEnabled());
    }

    public void verifyIconFail() {
        arseIcon.getText();
        //Assert.assertTrue("Serenity Icon is enabled", serenityIcon.isCurrentlyEnabled());
    }
}
