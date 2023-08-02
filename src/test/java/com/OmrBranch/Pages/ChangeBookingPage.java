package com.OmrBranch.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OmrBranchbaseclass.Baseclass;

public class ChangeBookingPage extends Baseclass {
	static String generatedorderId;

	public ChangeBookingPage() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//a[@data-testid='username']")
	private static WebElement ddn_userdropdown;
	@FindBy(xpath = "//a[text()='My Account']")
	private static WebElement opt_myaccount;
	@FindBy(xpath = "//h4")
	private static WebElement text_bookingsmessage;
	@FindBy(xpath = "//input[@name='search']")
	private static WebElement txtbx_searchbooking;
	@CacheLookup
	@FindBy(xpath = "//button[@class='edit btn filter_btn']")
	private static WebElement btn_firsteditbutton;

	@FindBy(xpath = "//div[@class='room-code']//span")
	private static WebElement text_orderid;
	@FindBy(xpath = "(//h5)[1]")
	private static WebElement text_hotelname;
	@FindBy(xpath = "//div[@class='my-booking  prize']//strong")
	private static WebElement text_hotelprice;
	@FindBy(xpath = "//input[@name='check_in']")
	private static WebElement cal_checkin;
	@FindBy(xpath = "//button[text()='Confirm']")
	private static WebElement btn_confirmediting;
	@FindBy(xpath = "//li[@class='alertMsg']")
	private static WebElement text_bookingupdatemessage;
	
	@FindBy(xpath="//button[@class='edit btn filter_btn']")
	private static List<WebElement> list_editbuttonvalidate;

	public static String getGeneratedorderId() {
		return generatedorderId;
	}

	public static List<WebElement> getList_editbuttonvalidate() {
		return list_editbuttonvalidate;
	}

	public static WebElement getDdn_userdropdown() {
		return ddn_userdropdown;
	}

	public static WebElement getOpt_myaccount() {
		return opt_myaccount;
	}

	public static WebElement getText_bookingsmessage() {
		return text_bookingsmessage;
	}

	public static WebElement getTxtbx_searchbooking() {
		return txtbx_searchbooking;
	}

	public static WebElement getBtn_firsteditbutton() {
		return btn_firsteditbutton;
	}

	public static WebElement getText_orderid() {
		return text_orderid;
	}

	public static WebElement getText_hotelname() {
		return text_hotelname;
	}

	public static WebElement getText_hotelprice() {
		return text_hotelprice;
	}

	public static WebElement getCal_checkin() {
		return cal_checkin;
	}

	public static WebElement getBtn_confirmediting() {
		return btn_confirmediting;
	}

	public static WebElement getText_bookingupdatemessage() {
		return text_bookingupdatemessage;
	}
	


	public  void navigateToMyBooking() {
		click(getDdn_userdropdown());
		click(getOpt_myaccount());
	}

	public  String verifyMybookingmessage() {
		String mybookingmessage = gettextfrompage(getText_bookingsmessage());
		return mybookingmessage;
	}

	public  void searchTheOrder() {
		generatedorderId = BookHotelPage.orderId;
		String substring = generatedorderId.substring(1);
		sendkeys(getTxtbx_searchbooking(), substring);
		
	}

	public  boolean verifyOrderId() {
		boolean orderidresult = false;
		String searchedorderid = gettextfrompage(getText_orderid());
		if (generatedorderId.equalsIgnoreCase(searchedorderid)) {
			orderidresult = true;
		}
		return orderidresult;
	}

	public  boolean verifyHotelname() {
		boolean hotelnameresult = false;
		String hotelname = SelectHotelPage.hotelname;
		String searchedhotelname = gettextfrompage(getText_hotelname());
		if (hotelname.equalsIgnoreCase(searchedhotelname)) {
			hotelnameresult = true;
		}
		return hotelnameresult;
	}

	public  boolean verifyHotelprice() {
		boolean hotelpriceresult = false;
		String hotelprice = SelectHotelPage.hotelprice;
		String[] splitdollar = hotelprice.split(" ");
		int parseIntgenerated = Integer.parseInt(splitdollar[1].replaceAll(",", ""));
		String searchedhotelprice = gettextfrompage(getText_hotelprice());
		String[] splitRs = searchedhotelprice.split(" ");
		int parseIntsearched = Integer.parseInt(splitRs[1].replaceAll(",", ""));
		
		if (parseIntsearched==(parseIntgenerated)) {
			hotelpriceresult = true;
		}
		return hotelpriceresult;
	}

	public  void clickEditButton() {
		click(getBtn_firsteditbutton());
	}

	public  void modifyTheCheckInDate(String newCheckIn) {
		if (getList_editbuttonvalidate().size()!=0) {
			clickEditButton();
		}
		cleartext(getCal_checkin());
		sendkeys(getCal_checkin(), newCheckIn);
		sendEnterKey(getCal_checkin());
		click(getBtn_confirmediting());
	}

	public  boolean verifyUpdatedmessage(String updatedmessage) {
		boolean updateresult = false;
		String message = gettextfrompage(getText_bookingupdatemessage());
		if (message.equalsIgnoreCase(updatedmessage)) {
			updateresult = true;
		}
		return updateresult;
	}
	public void anyOrderSelect(String orderid) {
		sendkeys(getTxtbx_searchbooking(), orderid);
	}
	public void firstOrder() {
		String gettext = gettextfrompage(getText_orderid());
		String substring = gettext.substring(1);
		sendkeys(getTxtbx_searchbooking(), substring);
	}

}