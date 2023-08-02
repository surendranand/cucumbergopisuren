package com.stepdefinition;

import static org.junit.Assert.assertTrue;



import com.OmrBranchManager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC5_ChangeBookingStep {
	PageObjectManager pom= new PageObjectManager();

	@Then("User navigates to my booking")
	public void user_navigates_to_my_booking() {
		pom.getChangebookingpage().navigateToMyBooking();
	}

	@Then("User should verify message {string} displayed after navigating")
	public void user_should_verify_message_displayed_after_navigating(String string) {
		pom.getChangebookingpage().verifyMybookingmessage();
	}

	@When("User enters generated order id in search bookings")
	public void user_enters_generated_order_id_in_search_bookings() {
		pom.getChangebookingpage().searchTheOrder();
	}

	@Then("User should verify same order id  as displayed")
	public void user_should_verify_same_order_id_as_displayed() {
		boolean verifyOrderId = pom.getChangebookingpage().verifyOrderId();
		assertTrue(verifyOrderId);
	}

	@Then("User should verify same hotel name is  displayed")
	public void user_should_verify_same_hotel_name_is_displayed() {
		boolean verifyHotelname = pom.getChangebookingpage().verifyHotelname();
		assertTrue(verifyHotelname);
	}

	@Then("User should verify same hotel price is displayed")
	public void user_should_verify_same_hotel_price_is_displayed() {
		boolean verifyHotelprice = pom.getChangebookingpage().verifyHotelprice();
		assertTrue(verifyHotelprice);
		
	}

	@When("User modifies the date {string}")
	public void user_modifies_the_date(String string) {
		
		pom.getChangebookingpage().modifyTheCheckInDate(string);
	}

	@Then("User should verify success message after modifying {string} and order details are same as before")
	public void user_should_verify_success_message_after_modifying_and_order_details_are_same_as_before(String string) {
		pom.getChangebookingpage().verifyUpdatedmessage(string);
	}

	@When("User selects the first displayed order")
	public void user_selects_the_first_displayed_order() {
		pom.getChangebookingpage().firstOrder();
	}

	@When("User selects any one of the orders {string}")
	public void user_selects_any_one_of_the_orders(String string) {
		pom.getChangebookingpage().anyOrderSelect(string);
		pom.getChangebookingpage().clickEditButton();

	}

	@Then("User should verify success message after modifying {string}")
	public void user_should_verify_success_message_after_modifying(String string) {
		boolean verifyUpdatedmessage = pom.getChangebookingpage().verifyUpdatedmessage(string);
		assertTrue(verifyUpdatedmessage);
	}

}