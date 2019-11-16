package com.acme.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.acme.seleniumbase.ACMEseleniumBase;

public class DashboardPage extends ACMEseleniumBase{

	public DashboardPage hoverInvoice() {
		WebElement invoices = driver.findElementByXPath("//button[text()=' Invoices']");
		Actions actions = new Actions(driver);
		actions.moveToElement(invoices).perform();
		return this;

	}
	
	public SearchPage clickSearchInvoice() {
		driver.findElementByXPath("//a[text()='Search for Invoice']").click();
		return new SearchPage();
	}
	
}
