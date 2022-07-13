package com.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_types {
	
public static void main(String[] args)   {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/alert");
		
		//simple alert
		
		WebElement simple = driver.findElement(By.xpath("//button[@id='accept']"));
		simple.click();
		driver.switchTo().alert().accept();
		
		//confirm alert
		WebElement confirm = driver.findElement(By.xpath("//button[@id='confirm']"));
		confirm.click();
		driver.switchTo().alert().dismiss();
		
		//prompt alert
		WebElement prompt = driver.findElement(By.xpath("//button[@id='prompt']"));
		prompt.click();
		driver.switchTo().alert().sendKeys("jamal");
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
		
		//modern alert
		WebElement modern = driver.findElement(By.xpath("//button[@id='modern']"));
		modern.click();
		WebElement close = driver.findElement(By.xpath("//button[@aria-label='close']"));
		close.click();
		
		
		
		
		
		
		
		
		
		
		
		

}
}