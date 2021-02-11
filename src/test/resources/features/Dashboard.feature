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

