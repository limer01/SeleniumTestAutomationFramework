package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static String projectPath = System.getProperty("user.dir");
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelPath, String sheetName) {
		
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		getRowCount();
		getCellDataString(0, 0);
		getCellDataNumber(1, 1);

	}
	
	public static int getRowCount() {
		int rowCount = 0;
		try {
			
			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows " + rowCount);
			
		} catch (Exception exp) {
			
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
			
		}
		return rowCount;
	}
	public static int getColCount() {
		int colCount = 0;
		try {
			
			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No of cols " + colCount);
			
		} catch (Exception exp) {
			
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
			
		}
		return colCount;
	}
	
	public static String getCellDataString(int rowNumber, int colNumber) {
		String cellData = null;
		try {
			cellData = sheet.getRow(rowNumber).getCell(colNumber).getStringCellValue();
			//System.out.println("This is the Cell Data: " + cellData);
			
		} catch (Exception exp) {
			
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return cellData;
	}
	
	public static double getCellDataNumber(int rowNumber, int colNumber) {
		double cellData = 0;
		try {
			cellData = sheet.getRow(rowNumber).getCell(colNumber).getNumericCellValue();
			System.out.println("This is the Cell Data: " + cellData);
			
		} catch (Exception exp) {
			
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return cellData;
	}

}
