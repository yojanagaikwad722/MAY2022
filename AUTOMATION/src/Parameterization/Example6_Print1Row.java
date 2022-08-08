package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example6_Print1Row {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("E:\\Yojana\\new\\May2022\\ExcelSheets\\Excel1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		short cellSize = sh.getRow(0).getLastCellNum();
		
		for(int i=0; i<=cellSize-1; i++) {
			String data = sh.getRow(0).getCell(i).getStringCellValue();
			System.out.println(data);
		}
	}
}
