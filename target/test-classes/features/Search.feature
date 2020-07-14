Feature: Search
  Agile Story: As a user I should be able to search when I'm on Google search page.

  Background: User should be on google search page
    Given User is on the Google search page


  Scenario: Google default title verification
    Given User is on the Google search page
    Then User should see title is Google

         # work in progress ==> @wip
  Scenario: Google title verification after search
    When User searches apple
    Then User should see apple in the title


  Scenario: Google title verification after search
    When User searches "peach"
    Then User should see "peach" in the title

  @wip
  Scenario: Google -About- link page title verification
    Then User should see About link
    And User clicks to About link
    Then User should see title Google - About Google, Our Culture & Company News
@googleTable
  Scenario: Google search page footer links verification
    Then User should see six links in the footer
    # command D generates skobki
      | Advertising      |
      | Business         |
      | How Search Works |
      | Privacy          |
      | Terms            |
      | Settings         |











