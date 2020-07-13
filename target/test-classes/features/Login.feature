@login
Feature: Login feature
  CBT-22: As a user, I should be able to login with correct credentials
  to different accounts. And dashboard should be displayed.

  # this is how you comment out in feature file

  @librarian  @employee # anything that we can remember and group
  Scenario: Librarian login scenario
    Given User is on the login page
    When User logs in as an librarian
    Then User should see dashboard


    @student
    Scenario: Student login scenario
      Given User is on the login page
      When User logs in as a student
      Then User should see dashboard

      @admin @employee
      Scenario: Admin login scenario
        Given User is on the login page
        When User logs in as an admin
        Then User should see dashboard



