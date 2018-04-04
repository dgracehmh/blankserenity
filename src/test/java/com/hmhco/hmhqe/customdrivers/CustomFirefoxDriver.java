package com.hmhco.hmhqe.customdrivers;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by graced on 14/12/2016.
 */
public class CustomFirefoxDriver implements DriverSource {
    @Override
    public WebDriver newDriver() {
        FirefoxDriverManager.getInstance().setup();
        return new FirefoxDriver();
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}

