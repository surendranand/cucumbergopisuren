Feature: Book hotel automation

  Scenario Outline: Book hotel without gst and special request
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
      | Credit Visa       | 5555555555552223 | surendran           | December    |       2023 |            786 |
      | Credit Mastercard | 5555555555552223 | surendran           | April       |       2023 |            494 |
      | Credit Amex       | 5555555555552223 | surendran           | June        |       2023 |            604 |
      | Credit Discover   | 5555555555552223 | surendran           | December    |       2023 |            123 |
      | Debit Visa        | 5555555555552222 | surendran           | December    |       2023 |            456 |
      | Debit Mastercard  | 5555555555552222 | surendran           | April       |       2023 |            045 |
      | Debit Amex        | 5555555555552222 | surendran           | June        |       2023 |            653 |
      | Debit Discover    | 5555555555552222 | surendran           | December    |       2023 |            987 |
    Then User should verify Success message "Booking is Confirmed" and save orderId
    Then User should verify that selected hotel is Booked

    Examples: 
      | username                 | password      | stateName  | cityName   | roomType | checkIndate | checkOutDate | rooms | adults  | childs | salutation | firstName | lastName | mobileNo   | email            | selectCardType |
      | surendranrules@gmail.com | Surenand@2115 | Tamil Nadu | Coimbatore | Luxury   | 2023-06-23  | 2023-06-24   | 2-Two | 3-Three |      1 | Mr.        | surendran | Shelby   | 9876543210 | tommy@shelby.com | Credit Card    |
      | surendranrules@gmail.com | Surenand@2115 | Tamil Nadu | Coimbatore | Luxury   | 2023-06-23  | 2023-06-24   | 2-Two | 3-Three |      1 | Mr.        | surendran | Shelby   | 9876543210 | tommy@shelby.com | Debit Card     |

  Scenario Outline: Book hotel with gst and special request
    Given User is on OMR branch hotel page
    When User login "<username>" and "<password>"
    Then User should verify success message after login "Welcome Anbu"
    When User search "<stateName>","<cityName>","<roomType>","<checkIndate>","<checkOutDate>","<rooms>","<adults>" and "<childs>"
    Then User should verify success message after search hotel "Select Hotel"
    When User select the first hotel and save the hotelname,price
    And User accept the popup alert and book hotel
    Then User should verify the success message after booking "Book Hotel"
    And User enters  details "<salutation>","<firstName>","<lastName>","<mobileNo>" and "<email>"
    Then User enter GST details "<enterRegistrationNumber>","<enterCompanyName>" and "<enterCompanyAddress>"
    And User selects special request "<anyOtherRequest>"
    When User enters Payment details "<selectCardType>"
      | selectcard        | entercardnumber  | enterYourNameOnCard | selectMonth | selectYear | enterCvvOnCard |
      | Credit Visa       | 5555555555552223 | surendran           | December    |       2023 |            786 |
      | Credit Mastercard | 5555555555552223 | surendran           | April       |       2023 |            494 |
      | Credit Amex       | 5555555555552223 | surendran           | June        |       2023 |            604 |
      | Credit Discover   | 5555555555552223 | surendran           | December    |       2023 |            123 |
      | Debit Visa        | 5555555555552222 | surendran           | December    |       2023 |            456 |
      | Debit Mastercard  | 5555555555552222 | surendran           | April       |       2023 |            045 |
      | Debit Amex        | 5555555555552222 | surendran           | June        |       2023 |            653 |
      | Debit Discover    | 5555555555552222 | surendran           | December    |       2023 |            987 |
    Then User should verify Success message "Booking is Confirmed" and save orderId
    Then User should verify that selected hotel is Booked

    Examples: 
      | username                 | password      | stateName  | cityName   | roomType | checkIndate | checkOutDate | rooms | adults  | childs | salutation | firstName | lastName | mobileNo   | email            | enterRegistrationNumber | enterCompanyName       | enterCompanyAddress | anyOtherRequest                      | selectCardType |
      | surendranrules@gmail.com | Surenand@2115 | Tamil Nadu | Coimbatore | Luxury   | 2023-06-23  | 2023-06-24   | 2-Two | 3-Three |      1 | Mr.        | surendran | Shelby   | 9876543210 | tommy@shelby.com |              9043592058 | Greens Tech OMR Branch | Thoraipakkam        | Reserve party hall room for partying | Credit Card    |
      | surendranrules@gmail.com | Surenand@2115 | Tamil Nadu | Coimbatore | Luxury   | 2023-06-23  | 2023-06-24   | 2-Two | 3-Three |      1 | Mr.        | surendran | Shelby   | 9876543210 | tommy@shelby.com |              9043592058 | Greens Tech OMR Branch | Thoraipakkam        | Reserve party hall room for partying | Debit Card     |

  Scenario Outline: Book hotel without payment details and verify error message
    Given User is on OMR branch hotel page
    When User login "<username>" and "<password>"
    Then User should verify success message after login "Welcome Anbu"
    When User search "<stateName>","<cityName>","<roomType>","<checkIndate>","<checkOutDate>","<rooms>","<adults>" and "<childs>"
    Then User should verify success message after search hotel "Select Hotel"
    When User select the first hotel and save the hotelname,price
    And User accept the popup alert and book hotel
    Then User should verify the success message after booking "Book Hotel"
    And User enters  details "<salutation>","<firstName>","<lastName>","<mobileNo>" and "<email>"
    Then User enter GST details "<enterRegistrationNumber>","<enterCompanyName>" and "<enterCompanyAddress>"
    And User selects special request "<anyOtherRequest>"
    When User submits without payment details
    Then User should verify error message "Please select your card type","Please select your card","Please provide your card number","Please provide name on your card","Please provide your Card Expiry Date" and "Please provide your Card's security code"

    Examples: 
      | username                 | password      | stateName  | cityName   | roomType | checkIndate | checkOutDate | rooms | adults  | childs | salutation | firstName | lastName | mobileNo   | email            | enterRegistrationNumber | enterCompanyName       | enterCompanyAddress | anyOtherRequest                      |
      | surendranrules@gmail.com | Surenand@2115 | Tamil Nadu | Coimbatore | Luxury   | 2023-06-23  | 2023-06-24   | 2-Two | 3-Three |      1 | Mr.        | surendran | Shelby   | 9876543210 | tommy@shelby.com |              9043592058 | Greens Tech OMR Branch | Thoraipakkam        | Reserve party hall room for partying |
