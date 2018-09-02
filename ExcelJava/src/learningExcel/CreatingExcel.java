package learningExcel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreatingExcel {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet ws = wb.createSheet("TestData");
		
		Row row1 = ws.createRow(0);
		Cell cell_1A = row1.createCell(0);
		Cell cell_1B = row1.createCell(1);
		Row row2 = ws.createRow(1);
		Cell cell_2A = row2.createCell(0);
		Cell cell_2B = row2.createCell(1);
		
		cell_1A.setCellValue("URL");
		cell_1B.setCellValue("www.google.com");

		cell_2A.setCellValue("USERNAME");
		cell_2B.setCellValue("john");
		
		File f = new File(".\\AP\\data.xlsx");
		FileOutputStream fo = new FileOutputStream(f);
		wb.write(fo);
		wb.close();

	}

}
