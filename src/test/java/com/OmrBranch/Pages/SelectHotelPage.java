package com.OmrBranch.Pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OmrBranchbaseclass.Baseclass;

public class SelectHotelPage extends Baseclass {

	public static String hotelname;
	public static String hotelprice;
	static int hotelcount;
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[@class='font35 font-weight-bold mb-4']")
	private static WebElement text_hotelmessage;

	@FindBy(xpath = "//strong[@class='total-prize']")
	private static List<WebElement> list_allprice;
	@FindBy(xpath = "//label[@for='value_nasc']")
	private static WebElement rad_ascname;
	@FindBy(xpath = "//label[@for='Standard']")
	private static WebElement chk_standard;
	@FindBy(xpath = "//label[@for='Deluxe']")
	private static WebElement chk_deluxe;
	@FindBy(xpath = "//label[@for='Suite']")
	private static WebElement chk_suite;
	@FindBy(xpath = "//label[@for='Luxury']")
	private static WebElement chk_luxury;
	@FindBy(xpath = "//label[@for='Studio']")
	private static WebElement chk_studio;
	@FindBy(xpath = "(//a[text()='Continue'])[1]")
	private static WebElement btn_continue;
	@FindBy(xpath = "//div[@class='col-md-5 hotel-suites']//h5")
	private static List<WebElement> text_hotelname;
	@FindBy(xpath = "//div[@class='prize']//strong")
	private static List<WebElement> text_hotelprice;
	@FindBy(xpath = "//div[@class='category-breadcrumb']")
	private static WebElement text_headerroomtype;
	@FindBy(xpath = "(//div[@class='col-md-5 hotel-suites']//h5)[1]")
	private static WebElement text_firsthotelname;
	@FindBy(xpath = "(//div[@class='prize']//strong)[1]")
	private static WebElement text_firsthotelprice;
	

//	===========================================
	
	
	public static WebElement getText_headerroomtype() {
		return text_headerroomtype;
	}

	public static WebElement getText_hotelmessage() {
		return text_hotelmessage;
	}

	public static List<WebElement> getList_allprice() {
		return list_allprice;
	}

	public static WebElement getRad_ascname() {
		return rad_ascname;
	}

	public static WebElement getChk_standard() {
		return chk_standard;
	}

	public static WebElement getChk_deluxe() {
		return chk_deluxe;
	}

	public static WebElement getText_firsthotelname() {
		return text_firsthotelname;
	}

	public static WebElement getText_firsthotelprice() {
		return text_firsthotelprice;
	}

	public static WebElement getChk_suite() {
		return chk_suite;
	}

	public static WebElement getChk_luxury() {
		return chk_luxury;
	}

	public static WebElement getChk_studio() {
		return chk_studio;
	}

	public static WebElement getBtn_continue() {
		return btn_continue;
	}

	public static List<WebElement> getText_hotelname() {
		return text_hotelname;
	}

	public static List<WebElement> getText_hotelprice() {
		return text_hotelprice;
	}

//=========================================	
	
	
	public void selectFirstHotel() {
		
		hotelname = gettextfrompage(getText_firsthotelname());
		hotelprice = gettextfrompage(getText_firsthotelprice());
		click(getBtn_continue());
	}

	public String successMessageSearchHotel() {
		String selecthotelmessage = gettextfrompage(getText_hotelmessage());
		return selecthotelmessage;
	}

	public String roomTypeInHeader() {
		String roomtypeInHeader = gettextfrompage(getText_headerroomtype());
		return roomtypeInHeader;
	}

	public boolean hotelnameEndsWithRoomType(String roomtype) {
		List<Boolean> listverify = new ArrayList<>();
		hotelcount = listverify.size();
		Boolean result = false;
		for (WebElement hotelname : getText_hotelname()) {
			boolean endsWith = hotelname.getText().endsWith(roomtype);
			listverify.add(endsWith);
		}
		if (listverify.contains(true)) {
			result = true;
		}
		return result;
	}

	public void acceptTheAlert() {
		waitimplicitly();
		okAlert();
	}

	public void dismissTheAlert() {
		cancelalert();
	}

	public void sortByNameAscending() {
		click(getRad_ascname());
	}

	public  boolean verifySortByNameAscending() {
		List<String> hotelnamebeforesort = new ArrayList<>();
		for (WebElement hotelname : getText_hotelname()) {
			hotelnamebeforesort.add(gettextfrompage(hotelname));
		}
		
		List<String> hotelnameaftersort = new ArrayList<>();
		Boolean verificationresult = false;
		Collections.sort(hotelnameaftersort);
		for (WebElement hotelname : getText_hotelname()) {
			hotelnameaftersort.add(gettextfrompage(hotelname));
		}
		if (hotelnamebeforesort.equals(hotelnameaftersort)) {
			verificationresult=true;
		}return verificationresult;
	}
	
	public void unselectTheRoomTypes(String roomtype) {
		
		switch (roomtype) {
		case "Standard":
			click(getChk_standard());
			break;
		case "Suite":
			click(getChk_suite());
			break;
		case "Luxury":
			click(getChk_luxury());
			break;
		case "Studio":
			click(getChk_studio());
			break;
		case "Deluxe":
			click(getChk_deluxe());
			break;

		default:
			break;
		}
		
	}
	
	public boolean verifyListOfHotelAfterUnselect() {
		int size = getList_allprice().size();
		boolean verifylist=true;
		if(size!=hotelcount) {
			verifylist=false;
		}
		return verifylist;
	}
}