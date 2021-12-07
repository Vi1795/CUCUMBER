package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;
import com.UtilsLayer.SelectClassMethods;

public class MyInfoViewPage  extends BaseClass{

	@FindBy(id="btnSave")
	WebElement EditOrSaveButton;
	
	@FindBy(id="personal_txtEmpFirstName")
	WebElement firstName;
	
	@FindBy(id="personal_txtEmpMiddleName")
	WebElement middleName;
	
	@FindBy(id="personal_txtEmpLastName")
	WebElement lastName;
	
	@FindBy(id="personal_txtEmployeeId")
	WebElement empId;
	
	@FindBy(id="personal_optGender_2")
	WebElement femaleRadioButton;
	
	@FindBy(id="personal_cmbNation")
	WebElement nationality;
	
	public MyInfoViewPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnEditButton() {
		EditOrSaveButton.click();
	}
	
	public void typeFirstName(String firstname) {
		firstName.clear();
		firstName.sendKeys(firstname);
	}
	
	public void typeMiddleName(String middlename) {
		middleName.clear();
		middleName.sendKeys(middlename);
	}
	
	public void typeLastName(String lastname) {
		lastName.clear();
		lastName.sendKeys(lastname);
	}
	
	public void typeEmpid(String empid ) {
		empId.clear();
		empId.sendKeys(empid);
	}
	
	public void radioButon() {
		femaleRadioButton.click();
	}
	
	public void selectDropDownValue(String value) {
		SelectClassMethods.selectDropDownvalue(nationality, value);
	}
	
	public String checkSelectedValueIndropDown() {
		
		return SelectClassMethods.checkSelectedValue(nationality);
	}
	

}
