@NOW-13
Feature: smoke test suit

  Background:
		#@NOW-12
    Given go to the application main page


	#{color:#de350b}*USER STORY:*{color}
	#
	#As a user, I should be able to navigate to main features. 
	#
	# 
	#
	#{color:#00875a}*ACCEPTANCE CRITERIAS:*{color}
	#
	#_{color:#172b4d}1- As a user, I should be able to click Insurance button so I should be able to see Health, Life, Employee Benefits sub modules
	#2- As a user, I should be able to click Finance button so I should be able to see Savings and UK Pension Transfers sub modules
	#3- As a user, I should be able to click Lifestyle button so I should be able to see Jobs, Life, Wellness sub modules
	#{color}_
#  @NOW-5 @NOW-6
#  Scenario Outline: Check all modules
#    When  the user navigate to "<module>" and "<sub>"
#    Then  the user should get "NowCompare | <title>"
#    Examples:
#      | module    | sub                  | title                   |
#      | Insurance | Health               | Expat Health Insurance  |
#      | Insurance | Life                 | Expat Life Insurance    |
#      | Insurance | Employee Benefits    | Expat Employee Benefits |
#      | Finance   | Savings              | Expat Savings Plans     |
#      | Finance   | UK Pension Transfers | UK Pension Transfer     |
#      | Lifestyle | Jobs                 | Expat Jobs              |
#      | Lifestyle | Wellness             | Expat Wellness          |

	#{color:#de350b}*USER STORY:*{color}
	#
	#As a user, I should be able to navigate to main features. 
	#
	# 
	#
	#{color:#00875a}*ACCEPTANCE CRITERIA:*{color}
	#
	#_{color:#172b4d}As a user, I should be able to click All Products button so I should be able to see all products.{color}_
#  @NOW-2 @NOW-6
#  Scenario: All Products Button Test
#    When the user click on the All Products button
#    Then verify the menu has following options
#      | Health               |
#      | Life                 |
#      | Employee Benefits    |
#      | Saving               |
#      | UK Pension Transfers |
#      | Jobs                 |
#      | Wellness             |

	#{color:#de350b}*USER STORY:*{color}
	#
	#As a user, I should be able to use Call us now and request call back
	#
	# 
	#
	#{color:#00875a}*ACCEPTANCE CRITERIA:*{color}
	#
	#_{color:#172b4d}1- As a user, I should be able to click request call back buton{color}_
  @NOW-8 @NOW-6
  Scenario: Request Call Back Button Test
    When the user click the request call back button
    Then the user should get the request call back page

	#{color:#de350b}*USER STORY:*{color}
	#
	#As a user, I should be able to navigate to main features. 
	#
	# 
	#
	#{color:#00875a}*ACCEPTANCE CRITERIA:*{color}
	#
	# _{color:#172b4d}As a user, I should be able to click Insurance button so I should be able to see Health, Life, Employee Benefits sub modules
	#
	#{color}_
  @NOW-15
  Scenario: Insurance-health blank input box test
    When the user navigate to "Insurance" and "Health"
    And the user click the Get Quotes button
    Then the user should get warning message "Please select an item in the list."

	#{color:#de350b}*USER STORY:*{color}
	#
	#As a user, I should be able to navigate to main features. 
	#
	# 
	#
	#{color:#00875a}*ACCEPTANCE CRITERIA:*{color}
	#
	# _{color:#172b4d}As a user, I should be able to click Insurance button so I should be able to see Health, Life, Employee Benefits sub modules{color}_
  @NOW-16
  Scenario: Insurance-health positive input box test
    When the user navigate to "Insurance" and "Health"
    And the user chooses 4  insured people select "Australia" and select requirements randomly
    And the user click the Get Quotes button
    Then the user should be in the url "https://www.nowcompare.com/international/en/health-insurance/quote/detail=....."