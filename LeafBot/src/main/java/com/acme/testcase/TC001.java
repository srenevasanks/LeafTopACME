package com.acme.testcase;

import org.testng.annotations.Test;

import com.acme.pages.LoginPage;
import com.acme.seleniumbase.ACMEseleniumBase;

public class TC001 extends ACMEseleniumBase{

	@Test(dataProvider = "fetchdata")
	public void runTC001(String uName, String password, String vendorID, String invoiceItem){
		
		new LoginPage()
		.enterUnamePword(uName, password)
		.clickLogin()
		.hoverInvoice()
		.clickSearchInvoice()
		.enterVendorTxID(vendorID)
		.clickSearch()
		.getInvoiceNumbers(invoiceItem)
		.clickLogOut();
		
	}
	
}
