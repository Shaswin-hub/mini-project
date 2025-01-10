package org.pom;

import org.mvn.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelLogin extends BaseClass{

	public HotelLogin() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	WebElement emailId;
	
	@FindBy(id="password")
	WebElement passwordField;
	
	@FindBy(id="login")
	WebElement log;
	
	@FindBy(id="location")
	WebElement loc;
	
	@FindBy(id="hotels")
	WebElement hot;
	
	@FindBy(id="room_type")
	WebElement rom;
	
	@FindBy(id="Submit")
	WebElement sub;
	
	
	
	@FindBy(id="continue")
	WebElement con;

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getLog() {
		return log;
	}

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getHot() {
		return hot;
	}

	public WebElement getRom() {
		return rom;
	}

	public WebElement getSub() {
		return sub;
	}

	

	public WebElement getCon() {
		return con;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
