Feature: Leave request

Scenario Outline: User should able to see the leave list of employees
Given User is on Orange HRM Dashboard page
When User clicks on Leave tab in menu
Then User navigate to leave list tab on leave page
When User select "<fromDate>" and "<toDate>" date in calendar
And User selects any "<status>" from leave with status dropdown
And User selects any "<leavetype>" from leave type dropdown
And User enters "<name>" in employee name textbox
And User selects any "<unit>" from sub-unit dropdown
And User enable the past employee toggle
And click on search button
Then user should able to see list of leave request with below details on the same page

  Examples:
  |fromDate|toDate|status|leavetype     |name       |unit       |
  |Today   | Today| Taken|CAN - Vacation|John Paul  |TechOps    |

#*Date
#*Employee name
#*Leave Type
#*Leave Balance(Days)
#*Number of Days
#*status
#*Comments
#*Action