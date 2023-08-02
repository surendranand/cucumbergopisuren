package com.stepdefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;



import com.OmrBranchManager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_ExploreHotelStep {
	PageObjectManager pom= new PageObjectManager();
	@When("User search {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_search_and(String string, String string2, String string3, String string4, String string5,
			String string6, String string7, String string8) {
		

		pom.getExplorehitelpage().searchHotel(string, string2, string3, string4, string5, string6, string7, string8);
	}

	@Then("User should verify success message after search hotel {string}")
	public void user_should_verify_success_message_after_search_hotel(String string) {
		

		String successMessageSearchHotel = pom.getSelecthotelpage().successMessageSearchHotel();
		assertEquals(successMessageSearchHotel, string);
	}

	@Then("User should verify after search {string} in header")
	public void user_should_verify_after_search_in_header(String string) {
		

		boolean contains = pom.getSelecthotelpage().roomTypeInHeader().contains(string);
		assertTrue(contains);
		
	}

	@Then("User should verify hotel name ends with {string} in hotelname")
	public void user_should_verify_hotel_name_ends_with_in_hotelname(String string) {
		

		boolean hotelnameEndsWithRoomType = pom.getSelecthotelpage().hotelnameEndsWithRoomType(string);
		assertTrue(hotelnameEndsWithRoomType);
	}

	@When("User search hotel without any details")
	public void user_search_hotel_without_any_details() {
	

		pom.getExplorehitelpage().searchHotelWithoutDetails();
	}

	@When("user should verify error message {string},{string},{string},{string},{string} and {string}")
	public void user_should_verify_error_message_and(String string, String string2, String string3, String string4,
			String string5, String string6) throws InterruptedException {
		

		boolean verifyErrorMessage = pom.getExplorehitelpage().verifyErrorMessage(string, string2, string3, string4, string5, string6);
		assertTrue(verifyErrorMessage);
	}


}