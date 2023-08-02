package com.stepdefinition;

import static org.junit.Assert.assertTrue;



import com.OmrBranchManager.PageObjectManager;

import io.cucumber.java.en.Then;

public class TC6_CancelBookingStep {
	PageObjectManager pom= new PageObjectManager();
	
	@Then("User click cancel button and accept the poupup for cancelling")
	public void user_click_cancel_button_and_accept_the_poupup_for_cancelling() {
		pom.getCancelbookingpage().clickCancelButton();
		pom.getCancelbookingpage().acceptThePopUpforcancel();
	}
	@Then("User should verify the message after cancelling order {string}")
	public void user_should_verify_the_message_after_cancelling_order(String string) {
		boolean verifyCancelledMessage = pom.getCancelbookingpage().verifyCancelledMessage(string);
		assertTrue(verifyCancelledMessage);
	}
	

	




	
	






}