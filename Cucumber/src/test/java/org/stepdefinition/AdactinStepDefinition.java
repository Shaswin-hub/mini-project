package org.stepdefinition;

import org.mvn.BaseClass;
import org.openqa.selenium.WebElement;
import org.pom.HotelLogin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdactinStepDefinition extends BaseClass {
	public static HotelLogin h;
	@Given("Launch the edge browser and hit the url")
	public void launch_the_edge_browser_and_hit_the_url() {
	    browserLaunch();
	    launchUrl("https://adactinhotelapp.com/");
	    maxWin();
	}

	@When("Enter valid username in username field")
	public void enter_valid_username_in_username_field() {
		h=new HotelLogin();
		passData(h.getEmailId(),"Aswin123456" );
	}

	@When("Enter valid password in password field")
	public void enter_valid_password_in_password_field() {
	    WebElement pom = h.getPasswordField();
	    passData(pom, "FE5JPD");
	}

	@When("Click login button")
	public void click_login_button() {
	    buttonClick(h.getLog());
	}

	@When("Select the location in location field")
	public void select_the_location_in_location_field() {
	   WebElement hot = h.getLoc();
	   select(hot, "Sydney");
	}

	@When("Select hotel in hotel field")
	public void select_hotel_in_hotel_field() {
	   WebElement hot = h.getHot();
	   select(hot, "Hotel Creek");
	}
	@When("Select room in room field")
	public void select_room_in_room_field() {
	   WebElement rom = h.getRom();
	   select(rom, "Standard");
	}

	@When("Click submit button")
	public void click_submit_button() {
	  buttonClick(h.getSub());
	}

	

	@When("Click continew button")
	public void click_continew_button() {
	   WebElement con = h.getCon();
	   buttonClick(con);
	}

	@Then("Close the edge browser")
	public void close_the_edge_browser() {
	  browserClose(); 
	}



}
