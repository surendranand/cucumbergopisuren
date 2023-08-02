package com.stepdefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import com.OmrBranchManager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC4_BookHotelStep {
	PageObjectManager pom= new PageObjectManager();
	
	@Then("User enters  details {string},{string},{string},{string} and {string}")
	public void user_enters_details_and(String string, String string2, String string3, String string4, String string5) throws InterruptedException {
		
		pom.getBookhotelpage().enterGuestDetails(string, string2, string3, string4, string5);
//		pm.getBook().clickNextButtonforGuestpage();
	}
	@When("User enters Payment details {string}")
	public void user_enters_payment_details(String string, io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
		pom.getBookhotelpage().enterPaymentdetails(string, dataTable);
		pom.getBookhotelpage().submitButtonClick();
		
	}
	@Then("User should verify that selected hotel is Booked")
	public void user_should_verify_that_selected_hotel_is_booked() {
		
		pom.getBookhotelpage().selectedHotelBooked();
	}


	@Then("User should verify Success message {string} and save orderId")
	public void user_should_verify_success_message_and_save_order_id(String string) {
	
		String bookingConfirmMessage = pom.getBookhotelpage().bookingConfirmMessage();
		boolean contains = bookingConfirmMessage.contains(string);
		assertTrue(contains);
	}


	
	@Then("User enter GST details {string},{string} and {string}")
	public void user_enter_gst_details_and(String string, String string2, String string3) {
		
		pom.getBookhotelpage().enterGSTdetails(string, string2, string3);
		
	}
	@Then("User selects special request {string}")
	public void user_selects_special_request(String string) {
	
		pom.getBookhotelpage().enterSpecialRequest(string);
	}
	
	
	
	@When("User submits without payment details")
	public void user_submits_without_payment_details() {
		
		pom.getBookhotelpage().withoutPayment();
		pom.getBookhotelpage().submitButtonClick();
	}
	@Then("User should verify error message {string},{string},{string},{string},{string} and {string}")
	public void user_should_verify_error_message_and(String string, String string2, String string3, String string4, String string5, String string6) {
		
		boolean verifyErrorMessage = pom.getBookhotelpage().verifyErrorMessage(string, string2, string3, string4, string5, string6);
		assertTrue(verifyErrorMessage);
	}


	
	



}