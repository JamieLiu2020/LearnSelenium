package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestExcel {
	
	public static void main(String[] args) {
		getRowCount();
	}

	public static void getRowCount() {
		try{
		
		//XSSFWorkbook(projectPath + "\\excel\\data.xlsx");
		String projectPath = System.getProperty("user.dir");
//		InputStream ExcelFileToRead = new FileInputStream(projectPath + "\\excel\\data.xlsx");
		
//        FileInputStream file;
     
//        file = new FileInputStream(new File("D:\\Tools\\JavaProject\\SeleniumFramework\\excel\\data.xlsx"));
//        XSSFWorkbook workbook=new XSSFWorkbook(file);
//		Workbook workbook = new XSSFWorkbook(new FileInputStream("D:\Tools\JavaProject\SeleniumFramework\excel\data.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(projectPath + "\\excel\\data.xlsx");

		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("number "+ rowCount);
		
		} catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}

}
