Feature: Request Call Back


  Background:
		#@NOW-12
    Given go to the application main page

  @NOW-8
  Scenario: Request Call Back Button Test
    When the user click the request call back button
    Then the user should get the request call back page

  @NOW-14
  Scenario Outline: Call us now button test <phone>
    When the user click on the Call us now button
    Then verify all "<city>" has corresponding "<phone>" numbers
    Examples:
      | city      | phone            |
      | Hong Kong | +852 5808 1248   |
      | Shanghai  | +86 21 5116 7136 |
      | Beijing   | +86 21 5116 7136 |
      | Indonesia | +62 21 515 7716  |
      | Thailand  | +66 2105 4268    |
      | UK        | +44 203 129 2715 |
      | Dubai     | +971 4248 2949   |
      | USA       | +1 64 6918 1402  |

