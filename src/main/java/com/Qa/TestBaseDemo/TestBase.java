package com.Qa.TestBaseDemo;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
public static WebDriver driver;
public static Properties prop;
public TestBase() 
{
try {
	FileInputStream fis=new FileInputStream("G:\\Richa_Selenium\\com.asd\\src\\main\\java\\com\\facebook\\configration\\config.properties");
    prop = new Properties();
    prop.load(fis);
}
catch(Exception e) {
	System.out.println(e.getMessage());
}
}
public static void initialization()
{
	String browserName = prop.getProperty("browser");
	if(browserName.equalsIgnoreCase("chrome"));
	{
		System.setProperty(prop.getProperty("systemproperties_1"), prop.getProperty ("systemproperties_2"));
	driver= new ChromeDriver();
		}
driver.get(prop.getProperty("url"));
}
}

