package com.hmhco.hmhqe.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.util.concurrent.TimeUnit;

public class BrightcoveVideoPage extends PageObject {


    public void getTheLogs() {

        System.out.println("********************************************* PERFORMANCE LOGS *********************************************");
        for (LogEntry entry : getDriver().manage().logs().get(LogType.PERFORMANCE)) {
            System.out.println(entry.toString());
        }

        System.out.println("********************************************* BROWSER LOGS *********************************************");
        for (LogEntry entry : getDriver().manage().logs().get(LogType.BROWSER)) {
            System.out.println(entry.toString());
        }

        System.out.println("********************************************* CLIENT LOGS *********************************************");
        for (LogEntry entry : getDriver().manage().logs().get(LogType.CLIENT)) {
            System.out.println(entry.toString());
        }




    }


}
