Feature: Validating Exchange Prices for different currencies

  @Rates
  Scenario: Verify Currency rate

  Given I set API server as ""
  When I set API "Content-Type" header as "application/json"
  Then I make API GET call using URL ""
  And I verify API respone status code is 200
