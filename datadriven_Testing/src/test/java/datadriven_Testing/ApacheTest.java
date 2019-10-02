package datadriven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ApacheTest {
	
	WebDriver driver;
	
	@Test
	public void Test() throws IOException{
		
		FileInputStream fis=new FileInputStream("E:\\eclipse program\\datadriven_Testing\\src\\main\\java\\com\\facebook\\qa\\testdata\\facebook2.xlsx");
		XSSFWorkbook wbo=new XSSFWorkbook(fis);
		XSSFSheet wso=wbo.getSheet("sheet1");
		Row r;
		int count =wso.getLastRowNum();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rawal\\Desktop\\chromedriver.exe");
	driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");	
   WebElement month= driver.findElement(By.xpath("//select[@name='birthday_month'][@id='month']"));
    List<WebElement>list=month.findElements(By.tagName("option"));
		
	for(int i=0;i<list.size();i++){
		
		int j=0;
		int k=2;
		int l=i;
		r=wso.getRow(l);
		 String m=list.get(i).getText();
		String y=r.getCell(j).getStringCellValue();
		System.out.println(y);
		 if(m.contains(y)){
			 
			 r.createCell(k).setCellValue("pass");
			 			 
			 
		 }
		 else{
			 
			 r.createCell(k).setCellValue("fail");
			 
		 }
		 
			FileOutputStream fos=new FileOutputStream("E:\\eclipse program\\datadriven_Testing\\src\\main\\java\\com\\facebook\\qa\\testdata\\facebook2.xlsx");
			wbo.write(fos);
	
	
	}
		
	}
	
	
	
	

}
