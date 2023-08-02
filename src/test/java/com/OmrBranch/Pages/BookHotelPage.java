package com.OmrBranch.Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OmrBranchbaseclass.Baseclass;

public class BookHotelPage extends Baseclass {
	public static String orderId;

	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
//	==================================

	@FindBy(xpath = "//h2[@class='px-3 py-2']")
	private static WebElement text_bookhotelmessage;
	@FindBy(id = "own")
	private static WebElement rad_myself;
	@FindBy(id = "user_title")
	private static WebElement ddn_saltutation;
	@FindBy(id = "first_name")
	private static WebElement txtbx_firstname;
	@FindBy(id = "last_name")
	private static WebElement txtbx_lastname;
	@FindBy(id = "user_phone")
	private static WebElement txtbx_phone;
	@FindBy(id = "user_email")
	private static WebElement txtbx_email;
	@FindBy(id = "gst")
	private static WebElement chk_gst;
	@FindBy(id = "gst_registration")
	private static WebElement txtbx_gstnumber;
	@FindBy(id = "company_name")
	private static WebElement txtbx_companyname;
	@FindBy(id = "company_address")
	private static WebElement txtbx_companyaddress;
	@FindBy(id = "step1next")
	private static WebElement btn_next1;
	@FindBy(id = "other_request")
	private static WebElement txtbx_otherrequest;
	@FindBy(id = "step2next")
	private static WebElement btn_next2;
	@FindBy(xpath = "//div[@class='credit-card pm']")
	private static WebElement btn_cards;
	@FindBy(id = "payment_type")
	private static WebElement ddn_paymentcardtype;
	@FindBy(id = "card_type")
	private static WebElement ddn_cardtype;
	@FindBy(id = "card_no")
	private static WebElement txtbx_cardnumber;
	@FindBy(id = "card_name")
	private static WebElement txtbx_cardname;
	@FindBy(id = "card_month")
	private static WebElement ddn_cardmonth;
	@FindBy(id = "card_year")
	private static WebElement ddn_cardyear;
	@FindBy(id = "cvv")
	private static WebElement txtbx_cvv;
	@FindBy(id = "submitBtn")
	private static WebElement btn_submit;
	@FindBy(xpath = "//div[@id='invalid-payment_type']")
	private static WebElement text_paymenttypeerror;
	@FindBy(xpath = "//div[@id='invalid-card_type']")
	private static WebElement text_cardtypeerror;
	@FindBy(xpath = "//div[@id='invalid-card_no']")
	private static WebElement text_cardnoerror;
	@FindBy(xpath = "//div[@id='invalid-card_name']")
	private static WebElement text_cardnameerror;
	@FindBy(xpath = "//div[@id='invalid-card_month']")
	private static WebElement text_cardmontherror;
	@FindBy(xpath = "//div[@id='invalid-cvv']")
	private static WebElement text_cardcvverror;
	@FindBy(xpath = "//h2[@name='booking-code']//strong")
	private static WebElement text_orderid;
	@FindBy(xpath = "//h2[@name='booking-code']")
	private static WebElement text_bookedmessage;
	@FindBy(xpath = "//p//strong")
	private static WebElement text_bookedhotelmessage;
	@FindBy(id = "step1next")
	private List<WebElement> btn_next1forvalidation;
	@FindBy(id = "step2next")
	private List<WebElement> btn_next2forvalidation;

	
//	===========================================

	public static WebElement getRad_myself() {
		return rad_myself;
	}

	public static String getOrderId() {
		return orderId;
	}

	public List<WebElement> getBtn_next1forvalidation() {
		return btn_next1forvalidation;
	}

	public List<WebElement> getBtn_next2forvalidation() {
		return btn_next2forvalidation;
	}

	public static WebElement getText_bookedmessage() {
		return text_bookedmessage;
	}

	public static WebElement getDdn_saltutation() {
		return ddn_saltutation;
	}

	public static WebElement getTxtbx_firstname() {
		return txtbx_firstname;
	}

	public static WebElement getTxtbx_lastname() {
		return txtbx_lastname;
	}

	public static WebElement getTxtbx_phone() {
		return txtbx_phone;
	}

	public static WebElement getTxtbx_email() {
		return txtbx_email;
	}

	public static WebElement getChk_gst() {
		return chk_gst;
	}

	public static WebElement getTxtbx_gstnumber() {
		return txtbx_gstnumber;
	}

	public static WebElement getTxtbx_companyname() {
		return txtbx_companyname;
	}

	public static WebElement getTxtbx_companyaddress() {
		return txtbx_companyaddress;
	}

	public static WebElement getBtn_next1() {
		return btn_next1;
	}

	public static WebElement getTxtbx_otherrequest() {
		return txtbx_otherrequest;
	}

	public static WebElement getBtn_next2() {
		return btn_next2;
	}

	public static WebElement getBtn_cards() {
		return btn_cards;
	}

	public static WebElement getDdn_paymentcardtype() {
		return ddn_paymentcardtype;
	}

	public static WebElement getDdn_cardtype() {
		return ddn_cardtype;
	}

	public static WebElement getTxtbx_cardnumber() {
		return txtbx_cardnumber;
	}

	public static WebElement getTxtbx_cardname() {
		return txtbx_cardname;
	}

	public static WebElement getDdn_cardmonth() {
		return ddn_cardmonth;
	}

	public static WebElement getDdn_cardyear() {
		return ddn_cardyear;
	}

	public static WebElement getTxtbx_cvv() {
		return txtbx_cvv;
	}

	public static WebElement getBtn_submit() {
		return btn_submit;
	}

	public static WebElement getText_paymenttypeerror() {
		return text_paymenttypeerror;
	}

	public static WebElement getText_cardtypeerror() {
		return text_cardtypeerror;
	}

	public static WebElement getText_cardnoerror() {
		return text_cardnoerror;
	}

	public static WebElement getText_cardnameerror() {
		return text_cardnameerror;
	}

	public static WebElement getText_cardmontherror() {
		return text_cardmontherror;
	}

	public static WebElement getText_cardcvverror() {
		return text_cardcvverror;
	}

	public static WebElement getText_orderid() {
		return text_orderid;
	}

	public static WebElement getText_bookedhotelmessage() {
		return text_bookedhotelmessage;
	}

	public static WebElement getText_bookhotelmessage() {
		return text_bookhotelmessage;
	}

//	===============================

	public boolean bookHotelSuccessMessage(String message) {
		boolean messageresult=false;
		String bookhotelmessage = gettextfrompage(getText_bookhotelmessage());
		if (bookhotelmessage.contains(message)) {
			messageresult=true;
		}return messageresult;
	}

	public void enterGuestDetails(String salutation, String firstname, String lastname, String mobileno,
			String email) throws InterruptedException {
		waitimplicitly();
		Thread.sleep(1500);
		click(getRad_myself());
//		clickElement(btn_next1);
		selectoptionbytext(getDdn_saltutation() , salutation);
		sendkeys(getTxtbx_firstname(), firstname);
		sendkeys(getTxtbx_lastname(), lastname);
		sendkeys(getTxtbx_phone(), mobileno);
		sendkeys(getTxtbx_email(), email);
	}

	public void submitButtonClick() {
		
		click(btn_submit);
	}

	public void enterGSTdetails(String gstnumber, String companyname, String companyaddress) {
		
		click(chk_gst);
		sendkeys(getTxtbx_gstnumber(), gstnumber);
		sendkeys(getTxtbx_companyname(), companyname);
		sendkeys(getTxtbx_companyaddress(), companyaddress);
	}

	public void enterSpecialRequest(String request) {
		if ((getBtn_next1forvalidation().size())==1) {
			clickNextButtonforGuestpage();
		}
		sendkeys(getTxtbx_otherrequest(), request);
	}

	public  void clickNextButtonforGuestpage() {
		click(getBtn_next1());
	}

	public  void clickNextButtonforrequestpage() {
		click(getBtn_next2());
	}

	public void enterPaymentdetails(String cardtype, io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		if (getBtn_next1().isDisplayed()) {
			clickNextButtonforGuestpage();
		}
		if (getBtn_next2().isDisplayed()) {
			clickNextButtonforrequestpage();
		}
		click(getBtn_cards());
		selectoptionbytext(getDdn_paymentcardtype(), cardtype);
		List<Map<String, String>> row = dataTable.asMaps();
		switch (cardtype) {
		case "Credit Card":
			Map<String, String> ccolumn = row.get(0);
			Thread.sleep(1500);
			String cardname = ccolumn.get("selectcard");
			String[] splitname = cardname.split(" ");
			sendkeys(getDdn_cardtype(), splitname[1]);
			String cardnumber = ccolumn.get("entercardnumber");
			Thread.sleep(1500);
			sendkeys(getTxtbx_cardnumber(), cardnumber);
			
			String nameoncard = ccolumn.get("enterYourNameOnCard");
			sendkeys(getTxtbx_cardname(), nameoncard);
			String month = ccolumn.get("selectMonth");
			selectoptionbytext(getDdn_cardmonth(), month);
			String year = ccolumn.get("selectYear");
			selectoptionbytext(getDdn_cardyear(), year);
			String cvv = ccolumn.get("enterCvvOnCard");
			sendkeys(getTxtbx_cvv(), cvv);
			break;
		case "Debit Card":
			Map<String, String> dcolumn = row.get(4);
			String dcardnumber = dcolumn.get("entercardnumber");
			sendkeys(getTxtbx_cardnumber(), dcardnumber);
			String dcardname = dcolumn.get("selectcard");
			String[] dsplitname = dcardname.split(" ");
			sendkeys(getDdn_cardtype(), dsplitname[1]);
			String dnameoncard = dcolumn.get("enterYourNameOnCard");
			sendkeys(getTxtbx_cardname(), dnameoncard);
			String dmonth = dcolumn.get("selectMonth");
			selectoptionbytext(getDdn_cardmonth(), dmonth);
			String dyear = dcolumn.get("selectYear");
			selectoptionbytext(getDdn_cardyear(), dyear);
			String dcvv = dcolumn.get("enterCvvOnCard");
			sendkeys(getTxtbx_cvv(), dcvv);

			break;

		default:
			break;
		}

	}
	
	public void withoutPayment() {
		if (getBtn_next1().isDisplayed()) {
			clickNextButtonforGuestpage();
		}
		if (getBtn_next2().isDisplayed()) {
			clickNextButtonforrequestpage();
		}
		click(getBtn_cards());
	}

	public boolean verifyErrorMessage(String string, String string2, String string3, String string4, String string5, String string6) {
		boolean result=false;
		List<String> errorlist = new ArrayList<>();
		List<String> errorlistfromfeature = new ArrayList<>();
		errorlistfromfeature.add(string);
		errorlistfromfeature.add(string2);
		errorlistfromfeature.add(string3);
		errorlistfromfeature.add(string4);
		errorlistfromfeature.add(string5);
		errorlistfromfeature.add(string6);

		String textpaymenterror = gettextfrompage(getText_paymenttypeerror());
		errorlist.add(textpaymenterror);
		String textcarderror = gettextfrompage(getText_cardtypeerror());
		errorlist.add(textcarderror);
		String textcardnumerror = gettextfrompage(getText_cardnoerror());
		errorlist.add(textcardnumerror);
		String textnameoncarderror = gettextfrompage(getText_cardnameerror());
		errorlist.add(textnameoncarderror);
		String textcardmonerror = gettextfrompage(getText_cardmontherror());
		errorlist.add(textcardmonerror);
		
		String textcardcvverror = gettextfrompage(getText_cardcvverror());
		errorlist.add(textcardcvverror);
		if(errorlist.size()==errorlistfromfeature.size()) {
			result=true;
		}
		return result;
	}

	public String bookingConfirmMessage() {
		String bookingconfirmmessage = gettextfrompage(getText_bookedmessage());
		orderId = gettextfrompage(getText_orderid());
		return bookingconfirmmessage;
	}
	
	public String selectedHotelBooked() {
		String bookedhotel = gettextfrompage(getText_bookedhotelmessage());
		return bookedhotel;
	}

}