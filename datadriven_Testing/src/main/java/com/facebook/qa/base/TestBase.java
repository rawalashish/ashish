package com.facebook.qa.base;



	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

	public class TestBase {
		
		public static WebDriver driver;
		public static Properties pr;
		public TestBase(){
			
			
			try{
				FileInputStream fis=new FileInputStream("E:\\eclipse program\\datadriven_Testing\\src\\main\\java\\com\\facebook\\qa\\config\\config.properties");
				pr=new Properties();			
				pr.load(fis);
				
			   }
			catch(FileNotFoundException e){
				                               e.printStackTrace();
			                              }
			catch ( IOException e)         
			                               {
				                               e.printStackTrace();
			                               }
			
			}
		           
		
		
		public static void initializaion(String browser){
			
					
			if(browser.equals("chrome"))
			{
				
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Rawal\\Desktop\\chromedriver.exe");
				driver=new ChromeDriver(); 
				
				                		
			}
			/*elseif(browser.equals("firefox"));
			{
				
				driver=new FirefoxDriver();
			}
			
				*/
				
			
			     
			
			
			driver.manage().window().maximize();
			driver.get(pr.getProperty("url"));
			
			driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}



		private static void elseif(boolean equals) {
			// TODO Auto-generated method stub
			
		}
				
	}

	
	
	
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	