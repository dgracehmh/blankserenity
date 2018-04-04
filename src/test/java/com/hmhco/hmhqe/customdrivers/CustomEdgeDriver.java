package com.hmhco.hmhqe.customdrivers;

import io.github.bonigarcia.wdm.EdgeDriverManager;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * Created by graced on 14/12/2016.
 */
public class CustomEdgeDriver implements DriverSource {
    @Override
    public WebDriver newDriver() {
        EdgeDriverManager.getInstance().setup();
        return new EdgeDriver();
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}
