package rawalji;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Acd {

	@Test
	public void open(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rawal\\Desktop\\chromedriver.exe");
		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		*/
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.automationtestinghub.com/selenium-chromedriver/");
		
		
	}
	
	
	
	
	
}
