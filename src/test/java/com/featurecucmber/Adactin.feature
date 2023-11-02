Feature: Hotel Booking in the Adactin Application
@login
Scenario: To Verify the Login Page in the adactin Web Application

Given To Launch The Url Of The Adactin Web Application
When user Enter The Username In The Username Field 
And user Enter The Password In The Password Field
Then user click the Login Button And Navigate to Next Page
@searh_hotel
Scenario: To Verify the Search Hotel Page

When user Select The Location In The Location Drop-Down Field
And user Select The Hotels In The Hotels Drop-Down Field
And user Select The Room_Types In The Room_Types Drop-Down Field
And user Select the Number_Of_Rooms In The Number_Of_Rooms Field
And user Select the Check_In_Date In The Check_In_Date Drop-Down Field
And user Select the Check_Out_Date In The Check_Out_Date Drop-Down Field
And user Select the Adults_Per_Room In The Adults_Per_Room Drop-Down Field
And user Select the Children_Per_Room In The Children_Per_Room Drop-Down Field
Then user Click the Search Button And Navigate to Next Page
@select_hotel
Scenario: To Verfiy the Select Hotel Page

When user Select The Hotel Name In Select Radio Button
Then user Click the Click Button  And Navigate to Next Page
@book_page
Scenario: To Verfiy the Book A Hotel Page 

When user Enter The First Name in the FirstName Field
And  user Enter The Last Name in the LastName Field
And user Enter the Address in the Billing Address Field
And user Enter the Credit Card Number in the CreditCard Number field
And user Select the Credit Card Type in the CreditCard Type 
And user Select the Expiry month and Expiry Year in the  Expiry Date Dropdown
And user Enter the CVV number in the CVV number field
Then user Click the BookNow Button And It will navigate to the Booking Confirmation Page
@logout
Scenario: To Verify the Booking Confirmation Page Functionality
When user click the Logout Button