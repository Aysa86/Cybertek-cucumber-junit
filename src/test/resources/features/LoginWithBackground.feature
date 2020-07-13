@loginWithBackground
Feature: Login feature
  CBT-22: As a user, I should be able to login with correct credentials
  to different accounts. And dashboard should be displayed.

  # this is how you comment out in feature file

   Background:  Backstory is that user is on the login page
     Given User is on the login page
     # Then User sees title is Library

  Scenario: Librarian login scenario
    When User logs in as an librarian
    Then User should see dashboard



  Scenario: Student login scenario
    When User logs in as a student
    Then User should see dashboard


    @db
  Scenario: Admin login scenario
    When User logs in as an admin
    Then User should see dashboard

