package com.OmrBranch.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OmrBranchbaseclass.Baseclass;

public class CancelBookingpage extends Baseclass {
	public CancelBookingpage() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(xpath = "//a[@class='cancle btn filter_btn']")
	private static WebElement btn_cancelbutton;
	@FindBy(xpath = "//li[@class='alertMsg']")
	private static WebElement text_cancelledmessage;

	public static WebElement getBtn_cancelbutton() {
		return btn_cancelbutton;
	}

	public static WebElement getText_cancelledmessage() {
		return text_cancelledmessage;
	}



	public void clickCancelButton() {
		click(getBtn_cancelbutton());
	}

	public void acceptThePopUpforcancel() {
		okAlert();
	}

	public boolean verifyCancelledMessage(String string) {
		boolean messageresult = false;
		String cancelmessage = gettextfrompage(getText_cancelledmessage());
		if (string.equalsIgnoreCase(cancelmessage)) {
			messageresult = true;
		}
		return messageresult;
	}
	

}