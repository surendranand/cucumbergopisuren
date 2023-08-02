
Feature: Select the hotel automation

  Scenario Outline: Select the hotel and accept the alert and verify message
    Given User is on OMR branch hotel page
    When User login "<username>" and "<password>"
    Then User should verify success message after login "Welcome Anbu"
    When User search "<stateName>","<cityName>","<roomType>","<checkIndate>","<checkOutDate>","<rooms>","<adults>" and "<childs>"
    Then User should verify success message after search hotel "Select Hotel"
    When User select the first hotel and save the hotelname,price
    And User accept the popup alert and book hotel
    Then User should verify the success message after booking "Book Hotel"

    Examples: 
      | username                 | password      | stateName  | cityName   | roomType | checkIndate | checkOutDate | rooms | adults  | childs |
      | surendranrules@gmail.com | Surenand@2115 | Tamil Nadu | Coimbatore | Luxury   | 2023-06-23  | 2023-06-24   | 2-Two | 3-Three |      1 |

  Scenario Outline: Select the hotel and dismiss the alert and verify message
    Given User is on OMR branch hotel page
    When User login "<username>" and "<password>"
    Then User should verify success message after login "Welcome Anbu"
    When User search "<stateName>","<cityName>","<roomType>","<checkIndate>","<checkOutDate>","<rooms>","<adults>" and "<childs>"
    Then User should verify success message after search hotel "Select Hotel"
    When User select the first hotel and save the hotelname,price
    And User dismiss the popup
    Then User should verify success message "Select Hotel"

    Examples: 
      | username                 | password      | stateName  | cityName   | roomType | checkIndate | checkOutDate | rooms | adults  | childs |
      | surendranrules@gmail.com | Surenand@2115 | Tamil Nadu | Coimbatore | Luxury   | 2023-06-23  | 2023-06-24   | 2-Two | 3-Three |      1 |

  Scenario Outline: Sort the hotel by name in ascending
    Given User is on OMR branch hotel page
    When User login "<username>" and "<password>"
    Then User should verify success message after login "Welcome Anbu"
    When User search "<stateName>","<cityName>","<roomType>","<checkIndate>","<checkOutDate>","<rooms>","<adults>" and "<childs>"
    Then User should verify success message after search hotel "Select Hotel"
    And User sort the list by name in ascending
    Then User should verify the hotel list is in ascending

    Examples: 
      | username                 | password      | stateName  | cityName   | roomType | checkIndate | checkOutDate | rooms | adults  | childs |
      | surendranrules@gmail.com | Surenand@2115 | Tamil Nadu | Coimbatore | Luxury   | 2023-06-23  | 2023-06-24   | 2-Two | 3-Three |      1 |

  Scenario Outline: Unselect the room type and verify the listing
    Given User is on OMR branch hotel page
    When User login "<username>" and "<password>"
    Then User should verify success message after login "Welcome Anbu"
    When User search "<stateName>","<cityName>","<roomType>","<checkIndate>","<checkOutDate>","<rooms>","<adults>" and "<childs>"
    Then User should verify success message after search hotel "Select Hotel"
    When User unselect the  room type "<roomType>"
    Then User should verify room list before and after unselecting roomtype

    Examples: 
      | username                 | password      | stateName  | cityName   | roomType | checkIndate | checkOutDate | rooms | adults  | childs |
      | surendranrules@gmail.com | Surenand@2115 | Tamil Nadu | Coimbatore | Luxury   | 2023-06-23  | 2023-06-24   | 2-Two | 3-Three |      1 |
