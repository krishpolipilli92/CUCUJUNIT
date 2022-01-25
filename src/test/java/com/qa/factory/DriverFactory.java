package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
public WebDriver driver;
public static ThreadLocal<WebDriver> tldriver=new ThreadLocal<>();

public WebDriver init_driver(String browser) {
	System.out.println("browser value is :"+browser);
	if(browser.equals("chrome")) {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\git\\Guru99Project1_TestNG\\Drivers\\chromedriver.exe");
		tldriver.set(new ChromeDriver());
	}
	getDriver().manage().deleteAllCookies();
	getDriver().manage().window().maximize();
	return getDriver();
}

public static synchronized WebDriver getDriver() {
	return tldriver.get();
	
}


}
