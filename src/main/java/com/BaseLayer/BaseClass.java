package com.BaseLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;
	
	public BaseClass() {

		prop = new Properties();

		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\l470\\eclipse-workspace\\New folder\\BDDFrameworkUsingPOM\\src\\main\\java\\com\\ConfigLayer\\config.properties");
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void intilization() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\l470\\Desktop\\24OctAutomation Batch\\Selenium setup\\chromedriver_win32 (5)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

}
