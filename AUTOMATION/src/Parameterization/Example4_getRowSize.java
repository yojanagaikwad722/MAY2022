package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example4_getRowSize {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("E:\\Yojana\\new\\May2022\\ExcelSheets\\Excel1.xlsx");
		int rowSize = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		System.out.println(rowSize);//3
		System.out.println(rowSize+1);//4 - actual row size
		
		//getLastRowNum() - returns no. of rows from 0th index
	}
}
