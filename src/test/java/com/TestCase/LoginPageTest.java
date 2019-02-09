package com.TestCase;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import com.Qa.TestBaseDemo.TestBase;
import com.facebook.pages.LoginPages;

public class LoginPageTest extends TestBase{
	LoginPages oo;
	String title;
	String ExpectedTitle="Facebook";
	public LoginPageTest()
	{
		super();
	}
	@BeforeSuite
	public void SetUp() 
	{
	initialization();
	oo=new LoginPages();
	}
	@Test
	public void CheckTitle()
	{
		title=oo.VerifyTitle();
	}
    @Test
    public void Login()
    {
	oo.verifyLogin();
    }
    @AfterSuite
    public void Close_Browser()
    {
    	driver.close();
    }
    }
