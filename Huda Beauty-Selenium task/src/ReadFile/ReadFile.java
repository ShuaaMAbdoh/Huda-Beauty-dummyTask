package ReadFile;

import java.io.File;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import ReadFile.readExcel;
public class ReadFile {
    
    public void readExcelSheet() {
  	  readExcel readObj = new readExcel();
  	  String filePath = "C:\\Users\\ShuaaAbdoh\\Desktop";
  	 
  	  try {
  		String data = readObj.readExcel(filePath,"testfile.xlsx","sheet1");
  		String []dataArray = data.split("\n");
  		for(int i=0;i<dataArray.length;i++) {
  			String []userinfo = dataArray[i].split(",");
  			System.out.println("length:"+userinfo.length);
  			System.out.println("email:"+userinfo[0]+"password:"+userinfo[1]);
  			System.out.println("test:hvgjhv"+userinfo[i]);
  			
  		}
  	} 
  	  catch (IOException e) {
  		// TODO Auto-generated catch block
  		System.out.println("test:");
  		e.printStackTrace();
  	}
    }
    public static void main(String[] args) {
    	System.out.println("test:");
		ReadFile readExcelSheet = new ReadFile();
		readExcelSheet.readExcelSheet();
    }
}
