package org.pom;

import org.mvn.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLogin extends BaseClass {
	public AmazonLogin() {
		PageFactory.initElements(driver, this);
	}

@FindBy(name="email")
public WebElement emailId;

@FindBy(id="continue")
public WebElement con;

@FindBy(name="password")
public WebElement pass;



public WebElement getEmailId() {
	return emailId;
}

public WebElement getCon() {
	return con;
}

public WebElement getPass() {
	return pass;
}

public WebElement getSign() {
	return sign;
}

@FindBy(id="signInSubmit")
public WebElement sign;



}
