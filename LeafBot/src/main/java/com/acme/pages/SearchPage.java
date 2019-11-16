package com.acme.pages;

import com.acme.seleniumbase.ACMEseleniumBase;

public class SearchPage extends ACMEseleniumBase {
	
	public SearchPage enterVendorTxID(String vendorID) {
		driver.findElementById("vendorTaxID").sendKeys(vendorID);
		return this;
	}
	
	public ResultPage clickSearch() {
		driver.findElementById("buttonSearch").click();
		return new ResultPage();
	}
	
}
