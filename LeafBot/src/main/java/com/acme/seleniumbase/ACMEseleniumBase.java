package com.acme.seleniumbase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.acme.utilities.ReadExcel;

public class ACMEseleniumBase {

	public static ChromeDriver driver; 
	
	
	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://acme-test.uipath.com/account/login");
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
	@DataProvider(name="fetchdata")
	public Object[][] inputExcel() throws IOException {
		ReadExcel readData = new ReadExcel();
		Object[][] allData = readData.readExcelData1();
		return allData;
	}	
}
