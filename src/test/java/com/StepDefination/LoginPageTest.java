package com.StepDefination;

import com.BaseLayer.BaseClass;
import com.PageLayer.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginPageTest extends BaseClass {
	private LoginPage loginpage;

	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		BaseClass.intilization();
	}

	@When("User enter valid credentials")
	public void user_enter_valid_credentials() {
		loginpage = new LoginPage();
		loginpage.loginFunctionality(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("User is on Home Page")
	public void user_is_on_home_page() {
		String actualTitle=loginpage.captureTitlOfHomePage();
		Assert.assertEquals(actualTitle, "OrangeHRM");
	}
}
