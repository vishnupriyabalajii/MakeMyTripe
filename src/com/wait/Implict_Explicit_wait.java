package com.wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implict_Explicit_wait {
	
public static void main(String[] args)   {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/signin");
		//-------implicit wait---------------------------------------------------
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		driver.findElement(By.xpath("(//input[@placeholder='Enter registered email'])[1]")).sendKeys("krish@123");
		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		WebElement toast = driver.findElement(By.xpath("//div[@id='toast-container']"));
		//------------Explicit wait----------------------------------------------
		wait.until(ExpectedConditions.visibilityOf(toast));
		System.out.println(toast.getText());
		wait.until(ExpectedConditions.invisibilityOf(toast));
		
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		System.out.println("done");
}
}
