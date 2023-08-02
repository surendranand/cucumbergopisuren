
Feature: Verifying OMR Branch hotel login automation

  #1
  Scenario Outline: Verify Login with valid credentials
    Given User is on OMR branch hotel page
    When User login "<username>" and "<password>"
    Then User should verify success message after login "Welcome Anbu"

    Examples: 
      | username             | password   |
      | surendranrules@gmail.com | Surenand@2115 |

  #2
  Scenario Outline: Verify Login with valid credentials using ENTER key
    Given User is on OMR branch hotel page
    When User login  "<username>" and "<password>" with ENTER key
    Then User should verify success message after login "Welcome Anbu"

    Examples: 
      | username             | password   |
      | surendranrules@gmail.com | Surenand@2115 |

  #3
  Scenario Outline: Verify Login with invalid credentials
    Given User is on OMR branch hotel page
    When User login "<username>" and "<password>"
    Then User should verify error message after login "Invalid Login details or Your Password might have expired. "

    Examples: 
      | username             | password   |
      | surendranrules@gmail.com | Surenand@2115 |