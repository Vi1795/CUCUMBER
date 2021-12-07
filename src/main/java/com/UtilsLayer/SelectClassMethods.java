package com.UtilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseLayer.BaseClass;

public class SelectClassMethods extends BaseClass {
	public static Select sel;

	public static void selectDropDownvalue(WebElement wb, String value) {
		sel = new Select(wb);
		sel.selectByVisibleText(value);
	}

	public static String checkSelectedValue(WebElement wb) {
		sel = new Select(wb);
		WebElement selectedvalue = sel.getFirstSelectedOption();

		return selectedvalue.getText();
	}

}
