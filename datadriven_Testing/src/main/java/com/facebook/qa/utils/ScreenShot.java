package com.facebook.qa.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.facebook.qa.base.TestBase;

public class ScreenShot extends TestBase {
	
	public static void screenshot(String filename) throws IOException {
		
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(srcfile, new File("C:\\Users\\Rawal\\Desktop\\Screenshot"+filename+".png"));
		
	}
	

}
