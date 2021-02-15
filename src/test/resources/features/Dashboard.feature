Feature: Dashboard page

  @dashboard
  Scenario: test the all products menu options
    Given the user in application dashboard
    When the user click on the All Products button
    Then verify the menu has following options
      | Health               |
      | Life                 |
      | Employee Benefits    |
      | Saving               |
      | UK Pension Transfers |
      | Jobs                 |
      | Wellness             |

  @tag
  Scenario Outline: check all modules <title>
    Given the user in application dashboard
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