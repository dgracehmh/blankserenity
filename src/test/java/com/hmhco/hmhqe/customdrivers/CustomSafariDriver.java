package com.hmhco.hmhqe.customdrivers;

import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

/**
 * Created by graced on 12/09/2017.
 */
public class CustomSafariDriver implements DriverSource {
    @Override
    public WebDriver newDriver() {
        SafariOptions options = new SafariOptions();


        //options.setUseCleanSession(true);


        DesiredCapabilities capabilities = DesiredCapabilities.safari();
        capabilities.setCapability(SafariOptions.CAPABILITY, options);

        return new SafariDriver(options);
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}
