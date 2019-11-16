package com.acme.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.acme.seleniumbase.ACMEseleniumBase;

public class ResultPage extends ACMEseleniumBase {

	public ResultPage getInvoiceNumbers(String invoiceItem) {
		List<WebElement> invoiceNums = driver.findElementsByXPath("(//td[text()='"+invoiceItem+"']/preceding-sibling::td[2])");
		ArrayList<String> ITinvoice = new ArrayList<String>();
		for (WebElement a : invoiceNums) {
			String b = a.getText();
			ITinvoice.add(b);
		}
		System.out.println("Invoice numbers for IT support: "+ITinvoice);
		return this;
	}
	
	public LoginPage clickLogOut() {
		driver.findElementByXPath("//a[text()='Log Out']").click();
		System.out.println(driver.getTitle());
		return new LoginPage();
	}
	
}
