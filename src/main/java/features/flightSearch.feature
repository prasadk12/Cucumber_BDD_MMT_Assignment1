@smoke
Feature: Search for available flights on MMT
 
  @onewaytrip
  Scenario: Search One Way Trip Flight
    Given I am on MMT flight booking search page
    When I perform one way search
    | From | To  |
    | Pune | Mumbai |
    Then Search Result should display available flights for one way trip
    
   @roundtrip
  Scenario: Search Round Trip Flight
    Given I am on MMT flight booking search page
    When I perform round trip search
    | From | To  |
    | Pune | Mumbai |
    Then Search Result should display available flights for round trip



