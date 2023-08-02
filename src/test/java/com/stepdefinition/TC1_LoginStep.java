package com.stepdefinition;

import java.io.IOException;

import org.junit.Assert;


import com.OmrBranchManager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_LoginStep  {
	

	@Given("User is on OMR branch hotel page")
	public void user_is_on_omr_branch_hotel_page() throws IOException, Exception {

	
		PageObjectManager pom= new PageObjectManager();
		pom.getLoginPage().openSite();
	}

	@When("User login {string} and {string}")
	public void user_login_and(String string, String string2) throws InterruptedException {
		PageObjectManager pom= new PageObjectManager();
		pom.getLoginPage().login(string, string2);

		
	}

	@Then("User should verify success message after login {string}")
	public void user_should_verify_success_message_after_login(String string) {
	PageObjectManager pom= new PageObjectManager();
		boolean successMessage = pom.getExplorehitelpage().getSuccessMessage(string);
		Assert.assertTrue(successMessage);
	}

	@When("User login  {string} and {string} with ENTER key")
	public void user_login_and_with_enter_key(String string, String string2) throws InterruptedException {
		
		PageObjectManager pom= new PageObjectManager();
		pom.getLoginPage().loginwithEnterKey(string, string2);
	}

	@Then("User should verify error message after login {string}")
	public void user_should_verify_error_message_after_login(String string) {
	
		PageObjectManager pom= new PageObjectManager();
		boolean errorMessage = pom.getLoginPage().getErrorMessage(string);
		Assert.assertTrue(errorMessage);
	}

}