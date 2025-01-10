package org.pom;

import org.mvn.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopifyLogin extends BaseClass {
public ShopifyLogin() {
	PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath="(//a[contains(text(),'Log in')])[1]")
public	WebElement log;
	
	@FindBy(id="account_email")
public	WebElement email;
	
	@FindBy(xpath="(//span[@class='content'])[1] ")
public	WebElement cont;
	
	@FindBy(id="account_password")
	public	WebElement pass;
	
	@FindBy(xpath="//span[@class='ui-button__text'] ")
	public	WebElement logIn;

	public WebElement getLog() {
		return log;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCont() {
		return cont;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogIn() {
		return logIn;
	}
}
