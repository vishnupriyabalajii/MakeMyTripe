package com.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_dropdown {
	
public static void main(String[] args)   {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/dropdowns");
		
		WebElement Multiple = driver.findElement(By.xpath("//select[@id='superheros']"));
		Select s=new Select(Multiple);
		boolean multiple=s.isMultiple();
		System.out.println(multiple);
		
		if (s.isMultiple()==true) {
			s.selectByValue("ca");
			System.out.println("selected");
			
			
		
			
		}

}
}