Feature: Wiki title and search verification

  Background: User is on the Wiki home page
    Given User is on the Wikipedia home page

@wiki
  Scenario: Search functionality title verification
    When User searches "Steve Jobs" in the wiki search page
    Then User should see "Steve Jobs" in the wiki title


