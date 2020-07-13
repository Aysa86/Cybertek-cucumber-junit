package com.cybertek.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    @Before (order = 2)
    public void setUpScenario(){
        System.out.println("----> Before annotation: Setting up browser");
    }

    @Before(value = "@db", order = 1) // will be applied only to db annotation and will be run
    public void setUpDatabaseConnection(){
        System.out.println("------> BEFORE ANNOTATION DATABASE CONNECTION CREATED <------");
    }


    @After
    public void tearDownScenario(){
        System.out.println("----> After annotation: Closing browser");
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
