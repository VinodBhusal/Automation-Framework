package com.supermarket.Utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.supermarket.Context.Constants;

public class ExcelReader {
	
	public static String getCellvalue(int rownumber, int cellNumber) throws IOException {
		FileInputStream fis = new FileInputStream(Constants.EXCELSHEET);
		XSSFWorkbook xs = new XSSFWorkbook(fis);
		Sheet sh = xs.getSheet("sheet1");
		Row row =sh.getRow(rownumber);
		
		Cell cell = row.getCell(cellNumber);
		System.out.println(cell);
		return cell.toString();
	
	}

}
