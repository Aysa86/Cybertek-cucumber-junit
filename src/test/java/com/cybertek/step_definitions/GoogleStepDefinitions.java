package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class GoogleStepDefinitions {
    @Given("User is on the Google search page")
    public void user_is_on_the_google_search_page() {

        Driver.getDriver().get("https://www.google.com");

        // Assert.fail("Unpurposed failing here!!!");
        // if first test fails, the rest tests will not be checked
    }



    @Then("User should see title is Google")
    public void user_should_see_title_is_google() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";



        Assert.assertEquals("Actual title doesn't match expected title!", actualTitle, expectedTitle);
       // Assert.assertTrue("Actual title doesn't match expected title!", actualTitle.equals(expectedTitle));
    }


}
