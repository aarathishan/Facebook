package org.facebook.resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonactions {
	
	public static WebDriver driver;
	
public void launch()
	{
		WebDriverManager.chromedriver().setup();
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("start-maximized");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void insertKeys(WebElement ele,String value)
	{
		ele.sendKeys(value);
	}

	public void clickElement(WebElement el)
	{
		el.click();
		
	}
}
