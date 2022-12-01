/**
 * 
 */
package Seleniumtask;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ReadFile.readExcel;
/**
 * @author ShuaaAbdoh
 *
 */
public class SimpleTask {

	public static void main(String[] args) {
  	  readExcel readObj = new readExcel();
  	  String filePath = "C:\\Users\\ShuaaAbdoh\\eclipse-workspace\\Huda Beauty-Selenium task\\src";
  	  
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.maannews.net/");
		String dataFromSite= driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div[1]/div/div[1]/div")).getText().toString();
		//System.out.println("data in site: "+dataFromSite);
		
  	  try {
  		String data = readObj.readExcel(filePath,"testArabic.xlsx","sheet1");
  		String []dataArray = data.split("\n");
  		for(int i=0;i<dataArray.length;i++) {
  			String []dataSheet = dataArray[i].split(",");
  			//System.out.println("length:"+dataSheet.length);
  			//System.out.println("data in sheet: "+dataSheet[0]);
  			
  			System.out.println(dataFromSite.equals(dataSheet[0]));
  			System.out.println(dataFromSite.equals(dataSheet[1]));
  			System.out.println(dataFromSite.equals(dataSheet[2]));
  			System.out.println(dataFromSite.equals(dataSheet[3]));
  			
  		}
  	} 
  	  catch (IOException e) {
  		// TODO Auto-generated catch block
  		e.printStackTrace();
  	}
  	
	}
}
