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

public class AccountCreation2 {


	
	
	 
		 
		 
	
	
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
	
	@FindBy(id="u_0_9")
	WebElement men;
	
	@FindBy(id="u_0_5")
	WebElement woman;
	
	@FindBy(id="u_0_6")
	WebElement  custom;
	
	@FindBy(xpath="//button[contains(@type,'submit')][contains(@id,'u_0_15')]")
	WebElement signup;
	
	
	public void accountCreation(String name,String lastname,String mobile_email1,String  password,String m_f,String date,String month,String year ) throws IOException{
		
		FileInputStream fis=new FileInputStream("E:\\eclipse program\\datadriven_Testing\\src\\main\\java\\com\\facebook\\qa\\testdata\\facebook.xlsx");
		 XSSFWorkbook wbo=new XSSFWorkbook(fis);
		 XSSFSheet wso=wbo.getSheet("sheet1");
		 Row r;
		int count=wso.getLastRowNum(); 
		for()
		 
		
		
		
		
		FN.sendKeys(name);
		LN.sendKeys(lastname);
		mobile_email.sendKeys(mobile_email1);
		pass.sendKeys(password);
		
		d.sendKeys(date);
		m.sendKeys(month);
		y.sendKeys(year);
		
		if(m_f.equals("male")){
			
			men.click();
			
		             }
		
		if(m_f.equals("female")){
			
			woman.click();
			
		               }
		
		
		signup.click();
		
	}
	

}


}
