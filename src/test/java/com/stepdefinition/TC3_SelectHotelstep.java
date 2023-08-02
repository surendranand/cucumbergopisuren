package com.stepdefinition;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;


import com.OmrBranchManager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC3_SelectHotelstep {
	
	PageObjectManager pom= new PageObjectManager();
	@When("User select the first hotel and save the hotelname,price")
	public void user_select_the_first_hotel_and_save_the_hotelname_price() {
	
		pom.getSelecthotelpage().selectFirstHotel();

	}

	@When("User accept the popup alert and book hotel")
	public void user_accept_the_popup_alert_and_book_hotel() {
		
		pom.getSelecthotelpage().acceptTheAlert();
	}

	@Then("User should verify the success message after booking {string}")
	public void user_should_verify_the_success_message_after_booking(String string) {
		
		boolean bookHotelSuccessMessage = pom.getBookhotelpage().bookHotelSuccessMessage(string);
		assertTrue(bookHotelSuccessMessage);
	}

	@When("User dismiss the popup")
	public void user_dismiss_the_popup() {
		
		pom.getSelecthotelpage().dismissTheAlert();
	}

	@Then("User should verify success message {string}")
	public void user_should_verify_success_message(String string) {
		
		String successMessageSearchHotel = pom.getSelecthotelpage().successMessageSearchHotel();
		Assert.assertEquals(successMessageSearchHotel, string);
	}

	@Then("User sort the list by name in ascending")
	public void user_sort_the_list_by_name_in_ascending() {
		
		pom.getSelecthotelpage().sortByNameAscending();
	}

	@Then("User should verify the hotel list is in ascending")
	public void user_should_verify_the_hotel_list_is_in_ascending() {
	
		
		boolean verifySortByNameAscending = pom.getSelecthotelpage().verifySortByNameAscending();
		assertTrue(verifySortByNameAscending);
	}

	@When("User unselect the  room type {string}")
	public void user_unselect_the_room_type(String string) {
		
		pom.getSelecthotelpage().unselectTheRoomTypes(string);
	}

	@Then("User should verify room list before and after unselecting roomtype")
	public void user_should_verify_room_list_before_and_after_unselecting_roomtype() {
		
		boolean verifyListOfHotelAfterUnselect = pom.getSelecthotelpage().verifyListOfHotelAfterUnselect();
		assertFalse(verifyListOfHotelAfterUnselect);
	}

}