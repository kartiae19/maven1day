import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static void main(String[] args) throws IOException {
		File f1=new File("/Users/karthika/eclipse-workspace/Maven1day/src/test/resources/Book2.xlsx");
		
		//input stream
		FileInputStream fi=new FileInputStream(f1);
		
		//workbook
		Workbook w=new XSSFWorkbook(fi);
		
		//sheet
		Sheet s = w.getSheet("sheet1");
		
		//row
		Row r = s.getRow(1);
		
		//cell
		Cell c = r.getCell(1);
		System.out.println(c);
	}

}
