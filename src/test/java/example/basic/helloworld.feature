# Gherkin language to write scenarios
# key words - Feature, Scenario, Steps, Background, Scenario Outline and Data Tables


  Feature: Simple Hello World example

    Scenario: Greets user with hello world
      Given Application is run
      Then Greet with hello world