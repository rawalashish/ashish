package datadriven_Testing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Utils extends TestBase {
	
	public static void screenshot(String destination) throws IOException{
		
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile,new File("C:\\Users\\Rawal\\Desktop\\Screen shot"+destination+".png"));
						
	                                 }
		
	

}
