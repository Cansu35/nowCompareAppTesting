@dashboard
Feature:As a user, I should be able to navigate to main features

  Background:
  #@NOW-12
    Given go to the application main page

  @NOW-2
  Scenario: All Products Button Test
    When the user click on the All Products button
    Then verify the menu has following options
      | Health               |
      | Life                 |
      | Employee Benefits    |
      | Saving               |
      | UK Pension Transfers |
      | Jobs                 |
      | Wellness             |

  @NOW-5
  Scenario Outline: check all modules <title>
    When  the user navigate to "<module>" and "<sub>"
    Then  the user should get "NowCompare | <title>"
    Examples:
      | module    | sub                  | title                   |
      | Insurance | Health               | Expat Health Insurance  |
      | Insurance | Life                 | Expat Life Insurance    |
      | Insurance | Employee Benefits    | Expat Employee Benefits |
      | Finance   | Savings              | Expat Savings Plans     |
      | Finance   | UK Pension Transfers | UK Pension Transfer     |
      | Lifestyle | Jobs                 | Expat Jobs              |
      | Lifestyle | Wellness             | Expat Wellness          |

  @NOW-15
  Scenario: Insurance-health blank input box test
    When the user navigate to "Insurance" and "Health"
    And the user click the Get Quotes button
    Then the user should get warning message "Please select an item in the list."


  @NOW-16
  Scenario: Insurance-health positive input box test
    When the user navigate to "Insurance" and "Health"
    And the user chooses 4  insured people select "Australia" and select requirements randomly
    And the user click the Get Quotes button
    Then the user should be in the url "https://www.nowcompare.com/international/en/health-insurance/quote/detail="
