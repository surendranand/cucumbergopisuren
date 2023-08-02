package com.OmrBranch.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OmrBranchbaseclass.Baseclass;

public class LoginPage extends Baseclass {
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id = "email")
	private  WebElement txtbx_username;
	@FindBy(id = "pass")
	private  WebElement txtbx_password;
	@FindBy(xpath = "//button[@value='login']")
	private  WebElement btn_login;
	@FindBy(xpath = "//div[@id='errorMessage']//b")
	private  WebElement txt_errormessage;
	
	public  WebElement getUsernamebox() {
		return txtbx_username;
	}

	public  WebElement getPasswordbox() {
		return txtbx_password;
	}

	public  WebElement getLoginbutton() {
		return btn_login;
	}

	public  WebElement getTxt_errormessage() {
		return txt_errormessage;
	}

	public  void openSite() throws IOException, Exception {
		getdriver(getpropertyfilevalue("browser"));
		enterurl(getpropertyfilevalue("url"));
		maximizewindow();
	}

	public  void login(String username, String password) throws InterruptedException {
		waitimplicitly();
		sendkeys(getUsernamebox(), username);
		sendkeys(getPasswordbox(), password);
		System.out.println(username+"   "+password);
		waitimplicitly();
		click(getLoginbutton());
	}
	public  void loginwithEnterKey(String username,String password) throws InterruptedException {
		waitimplicitly();

		System.out.println(username+"   "+password);

		sendkeys(getUsernamebox(), username);
		sendkeys(getPasswordbox(), password);
		sendEnterKey(getPasswordbox());
	}
	public  boolean getErrorMessage(String message) {
		waitimplicitly();

		boolean errormessageresult=false;
		String txterrormemessage = gettextfrompage(getTxt_errormessage());
		if (message.contains(txterrormemessage)) {
			errormessageresult=true;
		}
	return errormessageresult;
	}
	
}