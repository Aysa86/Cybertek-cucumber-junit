package com.cybertek.step_definitions;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {

    // creating the page object
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

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

    @When("User searches apple")
    public void user_searches_apple() {

        // sending value into search box using page object
        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);
    }


    @Then("User should see apple in the title")
    public void user_should_see_apple_in_the_title() {
       String expectedTitle = "apple - Google Search";
       String actualTitle = Driver.getDriver().getTitle();

       Assert.assertEquals(actualTitle, expectedTitle);
    }


    @When("User searches {string}") // Cucumber recognize  "" as a string, we have to pass string as an argument
    public void userSearches(String searchValue) {

        // sending value into search box using page object
        googleSearchPage.searchBox.sendKeys(searchValue + Keys.ENTER);
    }

    @Then("User should see {string} in the title")
    public void userShouldSeeInTheTitle(String searchValue) {

        String expectedTitle = searchValue + " - Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Then("User should see About link")
    public void userShouldSeeAboutLink() {

        // asserting that about link is displayed
        Assert.assertTrue(googleSearchPage.aboutLink.isDisplayed());

    }

    @And("User clicks to About link")
    public void userClicksToAboutLink() {
        // clicking to about link
        googleSearchPage.aboutLink.click();

    }

    @Then("User should see title Google - About Google, Our Culture & Company News")
    public void userShouldSeeTitleGoogleAboutGoogleOurCultureCompanyNews() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google - About Google, Our Culture & Company News";

        Assert.assertTrue(actualTitle.equals(expectedTitle));


    }
}
