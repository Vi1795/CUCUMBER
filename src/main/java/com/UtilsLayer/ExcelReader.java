package com.UtilsLayer;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public static XSSFWorkbook workbook;

	public ExcelReader(String filepath) {
		File f =new File(filepath);
		try {
			FileInputStream fis =new FileInputStream(f);
			workbook=new XSSFWorkbook(fis);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public String getData(int sheetIndex, int rows,int col) {
		XSSFSheet sheets =workbook.getSheetAt(sheetIndex);
		String data = sheets.getRow(rows).getCell(col).getStringCellValue();
		return data;
	}
	
	
	
	
	
	
	
}
