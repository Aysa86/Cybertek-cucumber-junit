package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before (order = 2)
    public void setUpScenario(){
        System.out.println("----> Before annotation: Setting up browser");
    }

    @Before(value = "@db", order = 1) // will be applied only to db annotation and will be run
    public void setUpDatabaseConnection(){
        System.out.println("------> BEFORE ANNOTATION DATABASE CONNECTION CREATED <------");
    }


    @After(order = 1)
    public void tearDownScenario(Scenario scenario){
       // System.out.println("----> After annotation: Closing browser");

        //System.out.println("scenario.getName() = " + scenario.getName());
        //System.out.println("scenario.getSourceTagNames() = " + scenario.getSourceTagNames());
        //System.out.println("scenario.isFailed() = " + scenario.isFailed());

        // 1.  we need to take a screen shot using Selenium
        // to be able to take a screenshot we need to cast Driver first

        if (scenario.isFailed()) { // if scenario is failed take me a screenshot
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);


            // we are going to attach it into our report
            // attach method accepts 3 args:1-Screenshot itself, 2-image type, 3-current scenario's name

            scenario.attach(screenshot, "image/png", scenario.getName());
        }

    }

    @After("@db")
    public void tearDownDatabaseConnection(){
        System.out.println("------> AFTER ANNOTATION DATABASE CONNECTION CLOSED <------");
    }

    @BeforeStep
    public void setUpStep(){
        System.out.println("=======> BEFORE STEP: MAKING SCREENSHOT <=======");
    }

    @AfterStep
    public void tearDownStep(){
        System.out.println("=======> AFTER STEP: MAKING SCREENSHOT <=======");
    }



}
