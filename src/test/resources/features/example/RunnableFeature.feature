@Sample1
Feature: Example Feature

  Background:
    Given The user launchs Serenity site

  Scenario: Serenity Icon on What Is Serenity Page is correct
    When The user navigates to Documentation then to What Is Serenity
    Then The user can see Serenity Icon