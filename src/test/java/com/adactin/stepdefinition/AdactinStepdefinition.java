package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.runnercucmber.AdactinRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdactinStepdefinition {
	public static WebDriver driver= AdactinRunner.driver;
	@Given("^To Launch The Url Of The Adactin Web Application$")
	public void to_Launch_The_Url_Of_The_Adactin_Web_Application() throws Throwable {
		driver.get("https://adactinhotelapp.com/");

	}

	@When("^user Enter The Username In The Username Field$")
	public void user_Enter_The_Username_In_The_Username_Field() throws Throwable {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Priyanka2810K");
	}

	@When("^user Enter The Password In The Password Field$")
	public void user_Enter_The_Password_In_The_Password_Field() throws Throwable {
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Priyanka@2810@");
	}

	@Then("^user click the Login Button And Navigate to Next Page$")
	public void user_click_the_Login_Button_And_Navigate_to_Next_Page() throws Throwable {
		WebElement Login_Button = driver.findElement(By.xpath("//input[@id='login']"));
		Login_Button.click();
	}

	@When("^user Select The Location In The Location Drop-Down Field$")
	public void user_Select_The_Location_In_The_Location_Drop_Down_Field() throws Throwable {
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		Select a= new Select(location);	
		a.selectByValue("London");
	}

	@When("^user Select The Hotels In The Hotels Drop-Down Field$")
	public void user_Select_The_Hotels_In_The_Hotels_Drop_Down_Field() throws Throwable {
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select b= new Select(hotels);
		b.selectByIndex(2);
	}

	@When("^user Select The Room_Types In The Room_Types Drop-Down Field$")
	public void user_Select_The_Room_Types_In_The_Room_Types_Drop_Down_Field() throws Throwable {
		WebElement room = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select c= new Select(room);
		c.selectByVisibleText("Super Deluxe");
	}

	@When("^user Select the Number_Of_Rooms In The Number_Of_Rooms Field$")
	public void user_Select_the_Number_Of_Rooms_In_The_Number_Of_Rooms_Field() throws Throwable {
		WebElement no_of_rooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select d= new Select(no_of_rooms);
		d.selectByIndex(6);
	}

	@When("^user Select the Check_In_Date In The Check_In_Date Drop-Down Field$")
	public void user_Select_the_Check_In_Date_In_The_Check_In_Date_Drop_Down_Field() throws Throwable {
		
		WebElement check_in_date = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		check_in_date.sendKeys("01/11/2023");
	}

	@When("^user Select the Check_Out_Date In The Check_Out_Date Drop-Down Field$")
	public void user_Select_the_Check_Out_Date_In_The_Check_Out_Date_Drop_Down_Field() throws Throwable {
		
		WebElement check_out_date = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		check_out_date.sendKeys("7/11/2023");
	}

	@When("^user Select the Adults_Per_Room In The Adults_Per_Room Drop-Down Field$")
	public void user_Select_the_Adults_Per_Room_In_The_Adults_Per_Room_Drop_Down_Field() throws Throwable {
		
		WebElement adult_per_room = driver.findElement(By.id("adult_room"));
		Select e =new Select(adult_per_room);
		e.selectByIndex(1);
	}

	@When("^user Select the Children_Per_Room In The Children_Per_Room Drop-Down Field$")
	public void user_Select_the_Children_Per_Room_In_The_Children_Per_Room_Drop_Down_Field() throws Throwable {
		WebElement children_room = driver.findElement(By.xpath("//table[@class='login']//following::select[@id='child_room']"));
		Select f= new Select(children_room);
		f.selectByValue("3");
	}

	@Then("^user Click the Search Button And Navigate to Next Page$")
	public void user_Click_the_Search_Button_And_Navigate_to_Next_Page() throws Throwable {
		WebElement submit_Btn = driver.findElement(By.name("Submit"));
		submit_Btn.click();
	}

	@When("^user Select The Hotel Name In Select Radio Button$")
	public void user_Select_The_Hotel_Name_In_Select_Radio_Button() throws Throwable {

	 	WebElement radio_btn = driver.findElement(By.id("radiobutton_0"));
	 	radio_btn.click();
	}

	@Then("^user Click the Click Button  And Navigate to Next Page$")
	public void user_Click_the_Click_Button_And_Navigate_to_Next_Page() throws Throwable {
		WebElement continue_btn = driver.findElement(By.name("continue"));
	 	continue_btn.click();
	}

	@When("^user Enter The First Name in the FirstName Field$")
	public void user_Enter_The_First_Name_in_the_FirstName_Field() throws Throwable {
		WebElement	frt_name = driver.findElement(By.xpath("//input[@id='first_name']"));
	 	frt_name.sendKeys("Priyanka");
	}

	@When("^user Enter The Last Name in the LastName Field$")
	public void user_Enter_The_Last_Name_in_the_LastName_Field() throws Throwable {

	 	WebElement	last_name = driver.findElement(By.xpath("//input[@id='last_name']"));
	 	last_name.sendKeys("Karthikeyan");
	}

	@When("^user Enter the Address in the Billing Address Field$")
	public void user_Enter_the_Address_in_the_Billing_Address_Field() throws Throwable {
		WebElement addresss = driver.findElement(By.id("address"));
		addresss.sendKeys("153 Boundary St , Brisbane City ,Queensland ,4101");
	}

	@When("^user Enter the Credit Card Number in the CreditCard Number field$")
	public void user_Enter_the_Credit_Card_Number_in_the_CreditCard_Number_field() throws Throwable {
		WebElement ccnum = driver.findElement(By.xpath("//input[@name='cc_num']"));
		ccnum.sendKeys("5185423367585833");
	}

	@When("^user Select the Credit Card Type in the CreditCard Type$")
	public void user_Select_the_Credit_Card_Type_in_the_CreditCard_Type() throws Throwable {
		WebElement cctype = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select v = new Select(cctype);
		v.selectByVisibleText("Master Card");
	}

	@When("^user Select the Expiry month and Expiry Year in the  Expiry Date Dropdown$")
	public void user_Select_the_Expiry_month_and_Expiry_Year_in_the_Expiry_Date_Dropdown() throws Throwable {

		WebElement ccexpmon = driver.findElement(By.id("cc_exp_month"));
		Select n = new Select(ccexpmon);
		n.selectByValue("1");
		WebElement ccexpyear = driver.findElement(By.id("cc_exp_year"));
		Select m = new Select(ccexpyear);
		m.selectByValue("2030");
	}

	@When("^user Enter the CVV number in the CVV number field$")
	public void user_Enter_the_CVV_number_in_the_CVV_number_field() throws Throwable {


		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("224");
	}

	@Then("^user Click the BookNow Button And It will navigate to the Booking Confirmation Page$")
	public void user_Click_the_BookNow_Button_And_It_will_navigate_to_the_Booking_Confirmation_Page() throws Throwable {
		WebElement booknow = driver.findElement(By.xpath("//input[@name='book_now']"));
		booknow.click();
		Thread.sleep(5000);
	}

	@When("^user click the Logout Button$")
	public void user_click_the_Logout_Button() throws Throwable {
		driver.findElement(By.id("my_itinerary")).click();
	}
	

}
