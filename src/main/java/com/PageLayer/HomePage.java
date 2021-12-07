package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath="//img[@alt='OrangeHRM']")
	WebElement logo;
	
	@FindBy(id="menu_pim_viewMyDetails")
	WebElement viewMyDetails;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean logo() {
		return logo.isDisplayed();
	}
	
	
	public void clickOnViewMydetailsLink() {
		viewMyDetails.click();
	}
	
	
	
	
	
	
	
}
