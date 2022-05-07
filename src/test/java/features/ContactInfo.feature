Feature: ContactInfo
	
	@SmokeTest
  Scenario Outline: Checking contactus funtions funtionality
    Given User clicked on the contact us button in homepage
    Then contact us page is opened
    When user filled all the details <email>,<reference>,<message>
    Then clicked on the send button

    
    Examples:
    |email									|reference|message									|
    |wexom38833@ishop2k.com	|ABCD123	|My order is delayed			|