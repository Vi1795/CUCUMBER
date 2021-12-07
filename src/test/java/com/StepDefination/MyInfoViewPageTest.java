package com.StepDefination;

import org.testng.Assert;

import com.BaseLayer.BaseClass;
import com.PageLayer.MyInfoViewPage;
import com.UtilsLayer.ExcelReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyInfoViewPageTest extends BaseClass {
	private MyInfoViewPage myinfoviewpage;

	@When("user click on edit button")
	public void user_click_on_edit_button() {
		myinfoviewpage = new MyInfoViewPage();
		myinfoviewpage.clickOnEditButton();
	}

	@Then("user enter first name middle name and last name")
	public void user_enter_first_name_middle_name_and_last_name() {
		
		ExcelReader obj = new ExcelReader(
				"C:\\Users\\l470\\eclipse-workspace\\New folder\\BDDFrameworkUsingPOM\\src\\main\\java\\com\\TestData\\TestData.xlsx");

		String firstname = obj.getData(0, 1, 0);

		myinfoviewpage.typeFirstName(firstname);
		String middlename = obj.getData(0, 1, 1);

		myinfoviewpage.typeMiddleName(middlename);
		String lastName = obj.getData(0, 1, 2);
		myinfoviewpage.typeLastName(lastName);
	}

	@Then("user enter employee id")
	public void user_enter_employee_id() {
		myinfoviewpage.typeEmpid("1234454241");
	}

	@Then("user select female radio button")
	public void user_select_female_radio_button() {
		myinfoviewpage.radioButon();
	}

	@Then("user select nationality")
	public void user_select_nationality() {
		myinfoviewpage.selectDropDownValue("Indian");

		String actualValueIsSelected = myinfoviewpage.checkSelectedValueIndropDown();
		Assert.assertEquals(actualValueIsSelected, "Indian");
	}

	@Then("user click on save button")
	public void user_click_on_save_button() {
		myinfoviewpage.clickOnEditButton();

	}

}
