
Feature: Modification of Order automation

 
  Scenario Outline: Validating specific order id and modifying checkin date
    Given User is on OMR branch hotel page
    When User login "<username>" and "<password>"
    Then User should verify success message after login "Welcome Anbu"
    When User search "<stateName>","<cityName>","<roomType>","<checkIndate>","<checkOutDate>","<rooms>","<adults>" and "<childs>"
    Then User should verify success message after search hotel "Select Hotel"
    When User select the first hotel and save the hotelname,price
    And User accept the popup alert and book hotel
    Then User should verify the success message after booking "Book Hotel"
    And User enters  details "<salutation>","<firstName>","<lastName>","<mobileNo>" and "<email>"
    When User enters Payment details "<selectCardType>"
      | selectcard        | entercardnumber  | enterYourNameOnCard | selectMonth | selectYear | enterCvvOnCard |
      | Credit Visa       | 5555555555552223 | surendran              | December    |       2023 |            786 |
      | Credit Mastercard | 5555555555552223 | surendran              | April       |       2023 |            494 |
      | Credit Amex       | 5555555555552223 | surendran              | June        |       2023 |            604 |
      | Credit Discover   | 5555555555552223 | surendran              | December    |       2023 |            123 |
    Then User should verify Success message "Booking is Confirmed" and save orderId
    Then User should verify that selected hotel is Booked
    And User navigates to my booking
    Then User should verify message "Bookings" displayed after navigating
    When User enters generated order id in search bookings
    Then User should verify same order id  as displayed
    Then User should verify same hotel name is  displayed
    And User should verify same hotel price is displayed
    When User modifies the date "<newCheckIn>"
    Then User should verify success message after modifying "Booking updated successfully"

    Examples: 
      | username             | password   | stateName  | cityName   | roomType | checkIndate | checkOutDate | rooms | adults  | childs | salutation | firstName | lastName | mobileNo   | email            | enterRegistrationNumber | enterCompanyName       | enterCompanyAddress | anyOtherRequest                      | selectCardType | newCheckIn |
      | surendranrules@gmail.com | Surenand@2115 | Tamil Nadu | Coimbatore | Luxury   | 2023-06-23  | 2023-06-24   | 2-Two | 3-Three |      1 | Mr.        | surendran    | Shelby   | 9876543210 | tommy@shelby.com |              9043592058 | Greens Tech OMR Branch | Thoraipakkam        | Reserve party hall room for partying | Credit Card    | 2023-06-26 |

  
  Scenario Outline: Modifying the first order in my bookings and verify message
    Given User is on OMR branch hotel page
    When User login "<username>" and "<password>"
    Then User should verify success message after login "Welcome Anbu"
    And User navigates to my booking
    Then User should verify message "Bookings" displayed after navigating
    When User selects the first displayed order
    When User modifies the date "<newCheckIn>"
    Then User should verify success message after modifying "Booking updated successfully" and order details are same as before

    Examples: 
      | username             | password   | newCheckIn |
      | surendranrules@gmail.com | Surenand@2115 | 2023-06-27 |

  
  Scenario Outline: Modifying the existing order in my bookings and verify message
    Given User is on OMR branch hotel page
    When User login "<username>" and "<password>"
    Then User should verify success message after login "Welcome Gobinath"
    And User navigates to my booking
    Then User should verify message "Bookings" displayed after navigating
    When User selects any one of the orders "<orderId>"
    When User modifies the date "<newCheckIn>"
    Then User should verify success message after modifying "Booking updated successfully"

    Examples: 
      | username             | password   | newCheckIn | orderId    |
      | surendranrules@gmail.com | Surenand@2115 | 2023-06-27 | TVAWW39551 |