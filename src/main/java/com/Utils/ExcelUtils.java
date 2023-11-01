package com.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import com.base.Testbase;

public class ExcelUtils extends Testbase{

		public ExcelUtils() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}

		public ExcelUtils(WebDriver driver) throws Throwable {
			super();
			// TODO Auto-generated constructor stub
		}

	public  static  Object[][]   getdatafromexcel(String sheetname) throws IOException
	{
		File file=new File("./src/main/java/com/base/Book_testng-task-1.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sheet=book.getSheet(sheetname);
		int rownum=sheet.getPhysicalNumberOfRows();
		int cellnum=sheet.getRow(1).getLastCellNum();
		Object[][] data =new Object[rownum-1][cellnum];
		for(int i=0;i<rownum-1;i++)
		{ 
			for(int j=0;j<cellnum;j++)
			{
				DataFormatter format=new DataFormatter();
				data[i][j]=format.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
			
		}
		return data; 
	}

}
