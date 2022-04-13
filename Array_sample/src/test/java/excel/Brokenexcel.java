package Array.Arraycommand;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Brokenexcel {
	public static void main(String[] args) throws IOException {

		XSSFWorkbook workbook1 = new XSSFWorkbook();
		XSSFSheet sheet1 = workbook1.createSheet();
		sheet1.createRow(0);
		sheet1.getRow(0).createCell(0).setCellValue("Hello");
		sheet1.getRow(0).createCell(1).setCellValue("Java World");
		sheet1.getRow(0).createCell(2).setCellValue("new World");
		
		sheet1.createRow(1);
		sheet1.getRow(1).createCell(0).setCellValue("trs");
		sheet1.getRow(1).createCell(1).setCellValue("Training");

		File f1 = new File("D:\\excel-practices\\ezhil.xlsx");
		FileOutputStream fos1 = new FileOutputStream(f1);
		workbook1.write(fos1);
		workbook1.close();

		System.out.println("excel file created");

		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet();
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Hello");
		sheet.getRow(0).createCell(1).setCellValue("World");

		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("trs");
		sheet.getRow(1).createCell(1).setCellValue("Traing");

		File file = new File("D:\\excel-practices\\ezhil1.xls");

		//By Using FileOutPutStreem
		FileOutputStream fos = new FileOutputStream(file);
		workbook.write(fos);
		workbook.write(file);
		workbook.close();
	}

}
