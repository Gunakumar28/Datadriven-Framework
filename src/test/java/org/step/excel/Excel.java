package org.step.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static void main(String[] args) throws IOException {
		File file= new File("D:\\photon eclipse\\String\\workbook\\Book9.xlsx");
		FileInputStream Stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(Stream);
		Sheet createSheet = workbook.createSheet("Sheet1");
		Row createRow = createSheet.createRow(1);
		Cell Cell = createRow.createCell(3);
		int cellType = Cell.getCellType();
		String Value ="";
		if (cellType==1) {
			Value = Cell.getStringCellValue();
			}
		else if (cellType==0) {
			double numericCellValue = Cell.getNumericCellValue();
			long l = (long) numericCellValue;
           Value = String.valueOf(l);
			}
		
		
	}

}
