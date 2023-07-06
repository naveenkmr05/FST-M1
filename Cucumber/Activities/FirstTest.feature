@SmokeTest
Feature: Basic Syntax

  Scenario: Testing Training support homepage
    Given user is on the TS homepage
    When the user clicks on the About us link
    Then the user is redirected to the About page
    Then close the browser

