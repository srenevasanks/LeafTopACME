package com.acme.utilities;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.acme.seleniumbase.ACMEseleniumBase;

public class ReadExcel extends ACMEseleniumBase{

	public static Object[][] readExcelData1() throws IOException {
		XSSFWorkbook book = new XSSFWorkbook("./data/acme.xlsx");
		XSSFSheet sheet = book.getSheetAt(0);
		int countRow = sheet.getLastRowNum();
		XSSFRow firstRow = sheet.getRow(0);
		int countCol = firstRow.getLastCellNum();
		Object[][] data = new Object[countRow][countCol];
		for (int i = 1; i <=countRow; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < countCol; j++) {
				XSSFCell cell = row.getCell(j);
				String val= cell.getStringCellValue();
				data[i-1][j] = val;
				System.out.println(data);
			}
		}
		book.close();
		return data;
	}
	
}
