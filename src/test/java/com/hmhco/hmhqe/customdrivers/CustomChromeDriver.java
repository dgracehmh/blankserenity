package com.hmhco.hmhqe.customdrivers;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomChromeDriver implements DriverSource {

    private Logger logger = LoggerFactory.getLogger(CustomChromeDriver.class);

    @Override
    public final WebDriver newDriver() {
        ChromeDriverManager.getInstance().setup();

        ChromeOptions options = new ChromeOptions();
        //Uncomment if you want to run against headless chrome
        //options.addArguments("--headless");
        //options.addArguments("--disable-gpu");
        ChromeDriver chromeDriver = new ChromeDriver(options);

        logger.info("Using ChromeDriver with config -> " + chromeDriver.getCapabilities().toString());
        logger.info("Using ChromeDriver with options -> " + options.toString());

        chromeDriver.manage().window().maximize();

        return chromeDriver;
    }

    @Override
    public final boolean takesScreenshots() {
        return true;
    }
}

