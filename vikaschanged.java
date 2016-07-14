package com.ne.PractiseFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseForReusability implements UrlInterface {
	
	public WebDriver driver ;
	
	public WebDriver initialization (String sBrowser)
	{
		if(sBrowser.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}else if(sBrowser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:/softwares/Browsers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		return driver;		
	}
	public void launchBrowser()
	{
		driver.get(URL);
		System.out.println("hdjhf");
	}

}
