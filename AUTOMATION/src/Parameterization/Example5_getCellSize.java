package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example5_getCellSize {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("E:\\Yojana\\new\\May2022\\ExcelSheets\\Excel1.xlsx");
		short cellSize = WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getLastCellNum();
		System.out.println(cellSize);//2
		
		//getLastCellNum() - it returns number of elements/values present in row
	}
}
