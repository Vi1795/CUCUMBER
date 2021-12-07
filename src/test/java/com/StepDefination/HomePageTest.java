package com.StepDefination;

import org.testng.Assert;

import com.BaseLayer.BaseClass;
import com.PageLayer.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageTest extends BaseClass {
	private HomePage homepage;

	@Given("test logo is present or not")
	public void test_logo_is_present_or_not() {
		homepage = new HomePage();
		boolean actualogo = homepage.logo();
		Assert.assertEquals(actualogo, true);
	}

	@Then("click on view My Details")
	public void click_on_view_my_details() {
		homepage.clickOnViewMydetailsLink();
	}
}
