package com.facebook.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(xpath="//input[contains(@type,'email')][contains(@id,'email')]")
	WebElement emailphone;
	
	@FindBy(xpath="//input[contains(@type,'password')][contains(@id,'pass')]")
	WebElement password;
	
	@FindBy(xpath="//input[contains(@value,'Log In')]")
	WebElement loginbtn;
	
	
	public  void login(String email_phone,String pass){
		
		emailphone.sendKeys(email_phone);
		password.sendKeys(pass);
		loginbtn.click();
		
		
		
	}
	
	
}
