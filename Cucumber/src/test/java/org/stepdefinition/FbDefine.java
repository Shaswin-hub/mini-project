package org.stepdefinition;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.mvn.BaseClass;
import org.openqa.selenium.WebElement;
import org.pom.FbLogin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class FbDefine extends BaseClass {
	
public static	FbLogin f;
	
	
	@Given("To launch the edge browser and hit the url")
	public void to_launch_the_edge_browser_and_hit_the_url() {
	    browserLaunch();
	    launchUrl("https://www.facebook.com/");
	    maxWin();
	}

	@When("To enter the invalid username in email field")
	public void to_enter_the_invalid_username_in_email_field() {
	     f=new FbLogin();
	    passData(f.getEmailId(), "abc@gmail.com");
	      
	    }

	@When("To enter invalid password in password field")
	public void to_enter_invalid_password_in_password_field() {
	    WebElement p = f.getPasswordFiled();
	    passData(p, "123");
	}

	@When("To click login button")
	public void to_click_login_button() {
	    buttonClick(f.getLoginid());
	}

	@Then("To close the edge browser")
	public void to_close_the_edge_browser() {
	  browserClose();
	}



}
