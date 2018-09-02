package learningExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		File f = new File(".\\AP\\data.xlsx");
		FileInputStream fi = new FileInputStream(f);
		
		Workbook wb = WorkbookFactory.create(fi);
		Sheet ws = wb.getSheetAt(0);
		Row row1 =ws.getRow(0);
		Cell cell_1A = row1.getCell(0);
		Cell cell_1B = row1.getCell(1);
		
		System.out.println(cell_1A + " " + cell_1B);
		
		wb.close();
		fi.close();

	}

}
