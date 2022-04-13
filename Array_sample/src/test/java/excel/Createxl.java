package excel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Createxl {

	public static void main(String[] args) throws IOException {
		
		
		Workbook wb = new XSSFWorkbook();
		Sheet sheet1 =wb.createSheet("Array");
		//Sheet sheet2 = wb.createSheet("String");
		Row row = sheet1.createRow(1);
		Cell cell = row.createCell(1);
		cell.setCellValue("i create a excel sheet");
		OutputStream file = new FileOutputStream("D:\\excel-practices\\new.xlsx");
		wb.write(file);
		wb.close();
		
	}

}
