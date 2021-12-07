package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class LoginPage extends BaseClass{

	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement loginButton;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	

	public void loginFunctionality(String uname, String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginButton.click();
	}
	
	public String captureTitlOfHomePage() {
		return driver.getTitle();
	}
	
	
	
	
	
	
	
	
	

}
