package com.OmrBranchManager;

import com.OmrBranch.Pages.BookHotelPage;
import com.OmrBranch.Pages.CancelBookingpage;
import com.OmrBranch.Pages.ChangeBookingPage;
import com.OmrBranch.Pages.ExploreHotelPage;

import com.OmrBranch.Pages.LoginPage;
import com.OmrBranch.Pages.SelectHotelPage;

public class PageObjectManager {
	private LoginPage loginpage;
	private ExploreHotelPage explorehotelpage;
	     private SelectHotelPage selecthotelpage;
	     private BookHotelPage bookhotelpage;
	     private ChangeBookingPage changebookingpage;
	     private CancelBookingpage cancelbookingpage;
	public LoginPage getLoginPage() {

	return (loginpage==null)?loginpage=new LoginPage():loginpage;
	}
	public ExploreHotelPage getExplorehitelpage() {
	return (explorehotelpage==null)?explorehotelpage=new ExploreHotelPage():explorehotelpage;
	}
	public SelectHotelPage getSelecthotelpage() {
	return (selecthotelpage==null)?selecthotelpage=new SelectHotelPage():selecthotelpage;
	}
	public BookHotelPage getBookhotelpage() {
	return (bookhotelpage==null)?bookhotelpage=new BookHotelPage():bookhotelpage;
	}
	public ChangeBookingPage getChangebookingpage() {
	return (changebookingpage==null)?changebookingpage=new ChangeBookingPage():changebookingpage;
	}
	public CancelBookingpage getCancelbookingpage() {
	return (cancelbookingpage==null)?cancelbookingpage=new CancelBookingpage():cancelbookingpage;
	}
	

}
