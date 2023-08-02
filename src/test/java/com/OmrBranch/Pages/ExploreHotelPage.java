package com.OmrBranch.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OmrBranchbaseclass.Baseclass;

public class ExploreHotelPage extends Baseclass {

	public ExploreHotelPage() {

		PageFactory.initElements(Baseclass.driver, this);

	}

//	===============================
	@FindBy(xpath = "//a[@data-testid='username']")
	private WebElement txt_Welcomemessage;
	@FindBy(id = "state")
	private WebElement ddn_state;
	@FindBy(xpath = "//select[@class='form-control selectpicker select2 select2-hidden-accessible']")
	private WebElement ddn_city;
	@FindBy(id = "room_type")
	private WebElement ddn_roomtype;
	@FindBy(name = "check_in")
	private WebElement cal_checkin;
	@FindBy(name = "check_out")
	private WebElement cal_checkout;
	@FindBy(id = "no_rooms")
	private WebElement ddn_rooms;
	@FindBy(id = "no_adults")
	private WebElement ddn_noadults;
	@FindBy(id = "no_child")
	private WebElement txtbx_nochilds;
	private WebElement fr_search;
	@FindBy(xpath = "//button[@id='searchBtn']")
	private WebElement btn_searchhotel;
	@FindBy(id = "resetBtn")
	private WebElement btn_reset;
//	@FindBy(xpath = "//div[@class='invalid-feedback animated fadeInDown']")
//	private List<WebElement> list_errormessage;
	@FindBy(xpath = "//div[@class='invalid-feedback animated fadeInDown']")
	private List<WebElement> list_errormessage;
	@FindBy(xpath = "//div[@id='invalid-state']")
	private WebElement txt_errormsgstate;
	@FindBy(xpath = "//div[@id='invalid-city']")
	private WebElement txt_errormsgcity;
	@FindBy(xpath = "//div[@id='invalid-check_in']")
	private WebElement txt_errormsgcheckin;
	@FindBy(xpath = "//div[@id='invalid-check_out']")
	private WebElement txt_errormsgcheckout;
	@FindBy(xpath = "//div[@id='invalid-no_rooms']")
	private WebElement txt_errormsgrooms;
	@FindBy(xpath = "//div[@id='invalid-no_adults']")
	private WebElement txt_errormsgadults;

//	===============================	

	public WebElement getTxt_errormsgstate() {
		return txt_errormsgstate;
	}

	public List<WebElement> getList_errormessage() {
		return list_errormessage;
	}

	public WebElement getTxt_errormsgcity() {
		return txt_errormsgcity;
	}

	public WebElement getTxt_errormsgcheckin() {
		return txt_errormsgcheckin;
	}

	public WebElement getTxt_errormsgcheckout() {
		return txt_errormsgcheckout;
	}

	public WebElement getTxt_errormsgrooms() {
		return txt_errormsgrooms;
	}

	public WebElement getTxt_errormsgadults() {
		return txt_errormsgadults;
	}

	public WebElement getDdn_state() {
		return ddn_state;
	}

	public WebElement getDdn_city() {
		return ddn_city;
	}

	public WebElement getDdn_roomtype() {
		return ddn_roomtype;
	}

	public WebElement getCal_checkin() {
		return cal_checkin;
	}

	public WebElement getCal_checkout() {
		return cal_checkout;
	}

	public WebElement getDdn_rooms() {
		return ddn_rooms;
	}

	public WebElement getDdn_noadults() {
		return ddn_noadults;
	}

	public WebElement getTxtbx_nochilds() {
		return txtbx_nochilds;
	}

	public WebElement getFr_search() {
		return fr_search;
	}

	public WebElement getBtn_searchhotel() {
		return btn_searchhotel;
	}

	public WebElement getBtn_reset() {
		return btn_reset;
	}

	public WebElement getTxt_Welcomemessage() {
		return txt_Welcomemessage;
	}

//	===============================

	public boolean getSuccessMessage(String string) {
		waitimplicitly();

		boolean successmessageresult = false;
		String txtwelcomemessage = gettextfrompage(getTxt_Welcomemessage());
		if (string.equalsIgnoreCase(txtwelcomemessage)) {
			System.out.println(txtwelcomemessage);
			successmessageresult = true;
		}
		return successmessageresult;
	}

	public void searchHotel(String state, String city, String roomType, String checkIndate, String checkOutDate,
			String rooms, String adults, String childs) {
		waitimplicitly();

		selectoptionbytext(getDdn_state(), state);
		waitimplicitly();
		selectoptionbytext(getDdn_city(), city);
		waitimplicitly();
		String[] split = roomType.split("/");
		if (split.length > 1) {
			for (int i = 0; i < split.length; i++) {
				selectoptionbytext(getDdn_roomtype(), split[i]);
				waitimplicitly();
			}
		} else {
			selectoptionbytext(getDdn_roomtype(), roomType);
			waitimplicitly();
		}

		click(getCal_checkin());
		waitimplicitly();
		sendEnterKey(getCal_checkin());
		waitimplicitly();
		click(getCal_checkout());
		waitimplicitly();
		sendEnterKey(getCal_checkout());
		waitimplicitly();
		selectoptionbytext(getDdn_rooms(), rooms);
		waitimplicitly();
		selectoptionbytext(getDdn_noadults(), adults);
		waitimplicitly();
		sendkeys(getTxtbx_nochilds(), childs);
		switchtoframebyid("hotelsearch_iframe");
		waitimplicitly();
		click(getBtn_searchhotel());

	}

	public void searchHotelWithoutDetails() {
		waitimplicitly();

		switchtoframebyid("hotelsearch_iframe");
		click(getBtn_searchhotel());
	}

	public boolean verifyErrorMessage(String error1, String error2, String error3, String error4, String error5,
			String error6) throws InterruptedException {
		Thread.sleep(1500);
		frameDefaultContent();
		
		boolean errormessageresult = false;
		List<String> errorlist = new ArrayList<>();
		List<String> actualerrorlist = new ArrayList<>();
		actualerrorlist.add(error1);
		actualerrorlist.add(error2);
		actualerrorlist.add(error3);
		actualerrorlist.add(error4);
		actualerrorlist.add(error5);
		actualerrorlist.add(error6);
		errorlist.add(getTxt_errormsgstate().getText());
		errorlist.add(getTxt_errormsgcity().getText());
		errorlist.add(getTxt_errormsgcheckin().getText());
		errorlist.add(getTxt_errormsgcheckout().getText());
		errorlist.add(getTxt_errormsgrooms().getText());
		errorlist.add(getTxt_errormsgadults().getText());
		if (actualerrorlist.equals(errorlist)) {
			errormessageresult = true;

			
		}return errormessageresult;
	}
}