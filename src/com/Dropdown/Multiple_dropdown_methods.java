package com.Dropdown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import selenium.Webelement_method;

public class Multiple_dropdown_methods {
	
public static void main(String[] args)   {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/dropdowns");
		
		WebElement Multiple = driver.findElement(By.xpath("//select[@id='superheros']"));
		Select s=new Select(Multiple);
		
		//-------using for each loop------
		
//	    List<WebElement>options= s.getOptions();
//		
//		for (WebElement M : options) {
//			System.out.println(M.getText());
//			}
			
		
		//-----using Iterator-----------
	
		Iterator<WebElement>iterator= s.getOptions().iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getText());
			
		}
	
		
		 
		
		
		
		
		
		
		
		
}		


}
