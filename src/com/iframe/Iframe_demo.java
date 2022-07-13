package com.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_demo {
	
public static void main(String[] args)   {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		 WebElement singleframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		 driver.switchTo().frame(singleframe);
		 
		 WebElement element = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		 element.sendKeys("hai babiee");
		 
		 driver.switchTo().defaultContent();
		 
		 WebElement multipleframe = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
		 multipleframe.click();
		 
		 WebElement pframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		 driver.switchTo().frame(pframe);
		 
		 WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		 driver.switchTo().frame(frame1);
		 
		 WebElement element2 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		 element2.sendKeys("hello good morning");

		 driver.switchTo().parentFrame();
		 System.out.println("frame handled successfully");
		 
		 
		 
		 
		 
		 
		 
		 

}
}