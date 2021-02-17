@life
Feature: Life page test


  Background:
  Given the user in application dashboard


  Scenario: Navigate Insurance - Life
    When the user go to the Insurance-Life
    Then verify the page consist of Life Insurance

  @wip
    Scenario: Navigate Finance - Saving
      When the user can navigate to "Finance" and "Savings"
      Then verify the page consist of Savings