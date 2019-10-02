package com.facebook.qa.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Sleeper;

public class AccountCreation {
	
	
	 
	@FindBy(xpath="//input[@type='text'][@id='u_0_l']")
	WebElement FN;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement LN;
	
	@FindBy(xpath="//input[@id='u_0_q']")
	WebElement mobile_email;
	
	@FindBy(xpath="//input[@id='u_0_x']")
	WebElement pass;
	
	@FindBy(id="day")
	WebElement d;
	
	@FindBy(id="month")
	WebElement m;
	
	@FindBy(id="year")
	WebElement y;
	
	@FindBy(id="u_0_6")
	WebElement men;
	
	@FindBy(id="u_0_5")
	WebElement woman;
	
	@FindBy(id="u_0_6")
	WebElement  custom;
	
	@FindBy(xpath="//button[contains(@type,'submit')][contains(@id,'u_0_15')]")
	WebElement signup;
	
	
	public void accountCreation() throws IOException, InterruptedException{
		
		FileInputStream fis=new FileInputStream("E:\\eclipse program\\datadriven_Testing\\src\\main\\java\\com\\facebook\\qa\\testdata\\facebook.xlsx");
		 XSSFWorkbook wbo=new XSSFWorkbook(fis);
		 XSSFSheet wso=wbo.getSheet("sheet1");
		 Row r;
		int count=wso.getLastRowNum(); 
		for(int i=1;i<count;i++){
						
			r=wso.getRow(i);
			
			
		FN.sendKeys(r.getCell(0).getStringCellValue());
		LN.sendKeys(r.getCell(1).getStringCellValue());
		mobile_email.sendKeys(r.getCell(2).getStringCellValue());
		pass.sendKeys(r.getCell(3).getStringCellValue());
		
		d.sendKeys(r.getCell(4).getStringCellValue());
		m.sendKeys(r.getCell(5).getStringCellValue());
		y.sendKeys(r.getCell(6).getStringCellValue());
		String gender=r.getCell(7).getStringCellValue();
		System.out.println(gender);
	    Thread.sleep(2000);
		if(gender.equals("male")){
			
			men.click();
			
		             }
		
		if(gender.equals("female")){
			
			woman.click();
			
		               }
		
		
		signup.click();
		
	}
	

}
}