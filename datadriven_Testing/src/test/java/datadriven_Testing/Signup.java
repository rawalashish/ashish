package datadriven_Testing;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.facebook.qa.base.TestBase;
import com.facebook.qa.pages.AccountCreation;
import com.facebook.qa.utils.ScreenShot;

public class Signup extends TestBase {

	@Test
	public void signup() throws IOException, InterruptedException{
	
	TestBase.initializaion("chrome");
		
	AccountCreation s=PageFactory.initElements(driver, AccountCreation.class);	
        
		s.accountCreation();
        ScreenShot.screenshot("facebook");	
	
}
}