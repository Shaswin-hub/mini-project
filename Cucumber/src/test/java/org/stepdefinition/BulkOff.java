package org.stepdefinition;

import org.mvn.BaseClass;
import org.openqa.selenium.WebElement;
import org.pom.FbLogin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BulkOff extends BaseClass {
	public static FbLogin f;
	@Given("launch the edge browser and hit the url")
	public void launch_the_edge_browser_and_hit_the_url() {
		 browserLaunch();
		    launchUrl("https://www.facebook.com/");
		    maxWin();
	}

	@When("enter the invalid username {string} in email field")
	public void enter_the_invalid_username_in_email_field(String email) {
	     f=new FbLogin();
	   WebElement emailId = f.getEmailId(); 
	   passData(emailId, email);
	}

	@When("enter invalid password {string} in password field")
	public void enter_invalid_password_in_password_field(String pass) {
	   WebElement passwordFiled = f.getPasswordFiled();
	   passData(passwordFiled, pass);
	}

	@When("click login button")
	public void click_login_button() {
	    WebElement loginid = f.getLoginid();
	    buttonClick(loginid);
	}

	@Then("close the edge browser")
	public void close_the_edge_browser() {
	    browserClose();
	}



}
