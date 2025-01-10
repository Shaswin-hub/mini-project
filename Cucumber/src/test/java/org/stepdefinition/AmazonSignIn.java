package org.stepdefinition;

import org.mvn.BaseClass;
import org.openqa.selenium.WebElement;
import org.pom.AmazonLogin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonSignIn extends BaseClass {
	
	public static AmazonLogin a;
	
	@Given("Launch edge browser and hit the amazon url")
	public void launch_edge_browser_and_hit_the_amazon_url() {
	    browserLaunch();
	    launchUrl("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	    maxWin();
	}

	@When("To send the username or mobile number in email field")
	public void to_send_the_username_or_mobile_number_in_email_field() {
	     a=new AmazonLogin();
	    WebElement e = a.getEmailId();
	    passData(e, "9123582010");
	}

	@When("To click continue button")
	public void to_click_continue_button() {
	   WebElement con = a.getCon();
	   buttonClick(con);
	}

	@When("To send password in password field")
	public void to_send_password_in_password_field() {
	   WebElement pass = a.getPass();
	   passData(pass, "123456");
	}

	@When("To click the signin button")
	public void to_click_the_signin_button() {
	    WebElement sign = a.getSign();
	    buttonClick(sign);
	}

	@Then("To close the amazon page browser")
	public void to_close_the_amazon_page_browser() {
	   browserClose();
	}



}
