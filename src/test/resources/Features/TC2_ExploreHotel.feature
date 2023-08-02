
Feature: Explore the hotel features automation

  Scenario Outline: Explore hotels with valid credentials and verify hotel page
    Given User is on OMR branch hotel page
    When User login "<username>" and "<password>"
    Then User should verify success message after login "Welcome Anbu"
    When User search "<stateName>","<cityName>","<roomType>","<checkIndate>","<checkOutDate>","<rooms>","<adults>" and "<childs>"
    Then User should verify success message after search hotel "Select Hotel"

    Examples: 
      | username                 | password      | stateName  | cityName   | roomType | checkIndate | checkOutDate | rooms | adults  | childs |
      | surendranrules@gmail.com | Surenand@2115 | Tamil Nadu | Coimbatore | Deluxe   | 2023-06-23  | 2023-06-24   | 2-Two | 3-Three |      1 |

  Scenario Outline: Explore hotels with multiple roomtype and verify roomtypes
    Given User is on OMR branch hotel page
    When User login "<username>" and "<password>"
    Then User should verify success message after login "Welcome Anbu"
    When User search "<stateName>","<cityName>","<roomType>","<checkIndate>","<checkOutDate>","<rooms>","<adults>" and "<childs>"
    Then User should verify success message after search hotel "Select Hotel"
    And User should verify after search "<roomType>" in header

    Examples: 
      | username                 | password      | stateName  | cityName   | roomType                            | checkIndate | checkOutDate | rooms | adults  | childs |
      | surendranrules@gmail.com | Surenand@2115 | Tamil Nadu | Coimbatore | Standard/Deluxe/Suite/Luxury/Studio | 2023-06-23  | 2023-06-24   | 2-Two | 3-Three |      1 |

  Scenario Outline: Explore hotels with specific roomtype and verify roomtype in hotelname
    Given User is on OMR branch hotel page
    When User login "<username>" and "<password>"
    Then User should verify success message after login "Welcome Anbu"
    When User search "<stateName>","<cityName>","<roomType>","<checkIndate>","<checkOutDate>","<rooms>","<adults>" and "<childs>"
    Then User should verify success message after search hotel "Select Hotel"
    And User should verify hotel name ends with "<roomType>" in hotelname

    Examples: 
      | username                 | password      | stateName  | cityName   | roomType | checkIndate | checkOutDate | rooms | adults  | childs |
      | surendranrules@gmail.com | Surenand@2115 | Tamil Nadu | Coimbatore | Luxury   | 2023-06-23  | 2023-06-24   | 2-Two | 3-Three |      1 |

  Scenario Outline: Explore hotels without any field and verify error message
    Given User is on OMR branch hotel page
    When User login "<username>" and "<password>"
    Then User should verify success message after login "Welcome Anbu"
    When User search hotel without any details
    And user should verify error message "Please select state","Please select city","Please select Check-in date","Please select Check-out date","Please select no. of rooms" and "Please select no. of adults"

    Examples: 
      | username                 | password      |
      | surendranrules@gmail.com | Surenand@2115 |
