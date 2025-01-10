package org.pom;

import org.mvn.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLogin extends BaseClass {
	public FbLogin() {
		PageFactory.initElements(driver,this);
	}

      @FindBy(id="email")
    public  WebElement emailId;

      @FindBy(id="pass")
    public   WebElement passwordFiled;

      @FindBy(name="login")
    public   WebElement loginid;

      
      
       
	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getPasswordFiled() {
		return passwordFiled;
	}

	public WebElement getLoginid() {
		return loginid;
	}









}
