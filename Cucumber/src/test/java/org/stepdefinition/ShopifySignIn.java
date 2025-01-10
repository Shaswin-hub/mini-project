package org.stepdefinition;

import org.mvn.BaseClass;
import org.openqa.selenium.WebElement;
import org.pom.ShopifyLogin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShopifySignIn extends BaseClass{
public static	ShopifyLogin s;
	@Given("launch the edge browser and type the url")
	public void launch_the_edge_browser_and_type_the_url() {
	    browserLaunch();
	    launchUrl("https://www.shopify.com/in/blog/best-ecommerce-sites\r\n");
	    maxWin();
	}

	@When("Click to login button")
	public void click_to_login_button() {
	    s=new ShopifyLogin();
	   WebElement log = s.getLog();
	   buttonClick(log);
	}

	@When("enter email in email field")
	public void enter_email_in_email_field() {
	   WebElement email = s.getEmail();
	   passData(email, "abc@gmail.com");
	}

	@When("click continue button")
	public void click_continue_button() {
	   WebElement cont = s.getCont();
	   buttonClick(cont);
	}

	@When("enter password in password field")
	public void enter_password_in_password_field() {
	   WebElement pass = s.getPass();
	   passData(pass, "123456");
	}

	@When("after click login button")
	public void after_click_login_button() {
	    WebElement logIn = s.getLogIn();
	    buttonClick(logIn);
	}

	@Then("after close the edge browser")
	public void after_close_the_edge_browser() {
	    browserClose();
	}



}
