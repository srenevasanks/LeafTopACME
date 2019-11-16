package com.acme.pages;

import org.openqa.selenium.Keys;

import com.acme.seleniumbase.ACMEseleniumBase;

public class LoginPage extends ACMEseleniumBase {

	public LoginPage enterUnamePword(String uName, String password) {
		driver.findElementById("email").sendKeys(uName, Keys.TAB, password);
		return this;
	}
	
	public DashboardPage clickLogin() {
		driver.findElementById("buttonLogin").click();
		return new DashboardPage();
	}
	
}
