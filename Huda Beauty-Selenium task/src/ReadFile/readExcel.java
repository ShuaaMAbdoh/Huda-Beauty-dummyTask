package ReadFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcel {

	 public String readExcel(String filePath,String fileName,String sheetName) throws IOException{
		    File file =    new File(filePath+"\\"+fileName);

		    FileInputStream inputStream = new FileInputStream(file);

		    Workbook guru99Workbook = null;

		    String fileExtensionName = fileName.substring(fileName.indexOf("."));
		    if(fileExtensionName.equals(".xlsx")){
		    guru99Workbook = new XSSFWorkbook(inputStream);

		    }

		    else if(fileExtensionName.equals(".xls")){
		        guru99Workbook = (Workbook) new HSSFWorkbook(inputStream);
		    }
		    
		    Sheet guru99Sheet = guru99Workbook.getSheet(sheetName);
		    int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum(); 
		    String output = "";
		    
		    for (int i = 0; i < rowCount+1; i++) {

		        Row row = guru99Sheet.getRow(i);

		        for (int j = 0; j < row.getLastCellNum(); j++) {
		            output = output +row.getCell(j)+",";
		        }

		        output = output+ "\n";
		    } 
		    return output;
		    }  
}
