package utils;

public class ExcelsUtilsDemo {

	public static void main(String[] args) {

		String projectPath = System.getProperty("user.dir");
		ExcelUtils excel = new ExcelUtils(projectPath+"/Excel/data.xlsx", "Tabelle1");
		
		excel.getRowCount();
		excel.getCellDataString(0, 0);
		excel.getCellDataNumber(1, 1);
		
		
	}

}
