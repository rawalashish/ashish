package first_maven.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Loginn {
	
	public static void main(String[] args)
	{
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\ashish\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
			
		
		System.out.println("ashish");
		
	}

}
