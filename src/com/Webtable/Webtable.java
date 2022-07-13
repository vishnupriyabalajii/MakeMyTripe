package com.Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	
public static void main(String[] args)   {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		List<WebElement> table = driver.findElements(By.xpath("//table[1]"));
		for (WebElement web : table) {
			System.out.println(web.getText());
		}
}

}
