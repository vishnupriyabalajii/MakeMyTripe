package com.svg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium.Webdriver_methods;

public class Svg_xpath {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.numbeo.com/cost-of-living/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement Svg = driver.findElement(By.xpath("//*[local-name()='svg' and @aria-label=\"A chart.\"]"));
		System.out.println("done");
		
		
		
	}

}
