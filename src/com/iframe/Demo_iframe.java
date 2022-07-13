package com.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_iframe {
	
public static void main(String[] args)   {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/frame");
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='frameUI']"));
		driver.switchTo().frame(frame1);
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='fname']"));
		firstname.sendKeys("krish");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lname']"));
		lastname.sendKeys("Jamal");
		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(frame2);
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("krish@123");
		
		System.out.println("iframe handled successfully");
		
		
		
		
		
		
		
		

}
}