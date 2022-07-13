package com.Dropdown;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Get_all_selected_options {
	
	
public static void main(String[] args)   {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/dropdowns");
		
		WebElement Multiple = driver.findElement(By.xpath("//select[@id='superheros']"));
		Select s=new Select(Multiple);
		s.selectByValue("am");
		s.selectByValue("ca");
		s.selectByValue("ff");
		s.selectByValue("gr");
		
		Iterator<WebElement>iterator= s.getAllSelectedOptions().iterator();
		while (iterator.hasNext()) {
			System.out.println( iterator.next().getText());
			
		}
		WebElement firstselected=s.getFirstSelectedOption();
		System.out.println(firstselected.getText());
		

}
}