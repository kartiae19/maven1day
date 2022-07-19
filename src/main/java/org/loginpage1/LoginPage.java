package org.loginpage1;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement login;

	public WebElement getUsername() {
		return username;
	}
	

	public WebElement getPassword() {
		return password;
	}


	public WebElement getLogin() {
		return login;
	}
	
	@FindBy(id="location")
	private WebElement location;
	
	public WebElement getLocation() {
		return location;
	}
	
	@FindBy(xpath="//option[@value='London']")
	private WebElement London;

	public WebElement getLondon() {
		return London;
	}
	
	@FindBy(id="hotels")
    private WebElement hotel;

	public WebElement getHotel() {
		return hotel;
	}
	
	@FindBy(xpath="//option[@value='Hotel Creek']")
	private WebElement HotelCreek;

	public WebElement getHotelCreek() {
		return HotelCreek;
	}
	
	@FindBy(id="room_type")
	private WebElement roomtype;

	public WebElement getRoomtype() {
		return roomtype;
	}
	
	@FindBy(xpath="//option[@value='Double']")
	private WebElement Double;

	public WebElement getDouble() {
		return Double;
	}
	
	@FindBy(id="room_nos")
	private WebElement roomnos;

	public WebElement getRoomnos() {
		return roomnos;
	}
	
	@FindBy(xpath="//option[@value='5']")
	private WebElement Five;

	public WebElement getFive() {
		return Five;
	}
	
	@FindBy(id="datepick_in")
	private WebElement datepickin;

	public WebElement getDatepickin() {
		return datepickin;
	}
	
	@FindBy(id="datepick_out")
	private WebElement datepickout;

	public WebElement getDatepickout() {
		return datepickout;
	}
	
	@FindBy(id="adult_room")
	private WebElement adultroom;

	public WebElement getAdultroom() {
		return adultroom;
	}
	
	@FindBy(xpath="(//option[@value='1'])[2]")
	private WebElement one;

	public WebElement getOne() {
		return one;
	}
	
	@FindBy(id="child_room")
	private WebElement childroom;

	public WebElement getChildroom() {
		return childroom;
	}
	
	@FindBy(xpath="(//option[@value='1'])[3]")
	private WebElement getchildone;

	public WebElement getGetchildone() {
		return getchildone;
	}
	
	@FindBy(id="Submit")
	private WebElement Submit;

	public WebElement getSubmit() {
		return Submit;
	}
	
	
	@FindBy(id="radiobutton_0")
	private WebElement radio;

	public WebElement getRadio() {
		return radio;
	}
	
	@FindBy(id="continue")
	private WebElement continu;

	public WebElement getContinu() {
		return continu;
	}
	
	@FindBy(id="first_name")
    private WebElement firstname;

	public WebElement getFirstname() {
		return firstname;
	}
	
	@FindBy(id="last_name")
	private WebElement lastname;

	public WebElement getLastname() {
		return lastname;
	}
	
	@FindBy(id="address")
	private WebElement address;

	public WebElement getAddress() {
		return address;
	}
	
	@FindBy(id="cc_num")
	private WebElement cc;

	public WebElement getCc() {
		return cc;
	}
	
	@FindBy(id="cc_type")
	private WebElement cctype;

	public WebElement getCctype() {
		return cctype;
	}
	
	@FindBy(xpath="//option[@value='VISA']")
	private WebElement visa;

	public WebElement getVisa() {
		return visa;
	}
	
	@FindBy(id="cc_exp_month")
	private WebElement expmonth;

	public WebElement getExpmonth() {
		return expmonth;
	}
	
	@FindBy(xpath="//option[@value='12']")
	private WebElement dec;

	public WebElement getDec() {
		return dec;
	}
	
	@FindBy(id="cc_exp_year")
	private WebElement expyear;

	public WebElement getExpyear() {
		return expyear;
	}
	
	@FindBy(xpath="//option[@value='2022']")
	private WebElement twentytwo;

	public WebElement getTwentytwo() {
		return twentytwo;
	}
	
	@FindBy(id="cc_cvv")
	private WebElement cvvno;

	public WebElement getCvvno() {
		return cvvno;
	}
	
	@FindBy(id="book_now")
	private WebElement booknow;

	public WebElement getBooknow() {
		return booknow;
	}
	@FindBy(id="order_no")
	private WebElement orderno;

	public WebElement getOrderno() {
		return orderno;
	}

public void id() {
String attribute = getAttribute(orderno);
System.out.println(attribute);
}
	
	}
	
	
	
	
	

	
	
	
	
	
	


	
	




