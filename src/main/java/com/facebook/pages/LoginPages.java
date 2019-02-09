package com.facebook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Qa.TestBaseDemo.TestBase;

public class LoginPages extends TestBase{
@FindBy(id="email")
WebElement useremail;

@FindBy(id="pass")
WebElement userpass;

@FindBy(id="loginbutton")
WebElement loginbutton;

public LoginPages()
{
PageFactory.initElements(driver,this);
}
public String VerifyTitle() 
{
	return driver.getTitle();
}
public void verifyLogin()
{
	useremail.sendKeys(prop.getProperty("username"));
	userpass.sendKeys(prop.getProperty("password"));
	loginbutton.click();
}
}
