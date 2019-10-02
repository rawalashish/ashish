package datadriven_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class Test {

	WebDriver driver;
	@org.testng.annotations.Test
	public void open() throws FindFailed, InterruptedException{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Rawal\\Desktop\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/");
		driver.findElement(By.linkText("Download")).click();
		driver.findElement(By.linkText("3.141.59")).click();
		Thread.sleep(5000);
		Screen sc=new Screen();
		Pattern pt= new Pattern("C:\\Users\\Rawal\\Desktop\\Screenshot - 7_17_2019 , 8_51_48 PM.png");
		sc.click(pt);
	}	
	
}
