package com.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Executor {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		String title= js.executeScript("return document.title;").toString();
		System.out.println(title);
		
		String URL =  js.executeScript("return document.URL;").toString();
		System.out.println(URL);
		
		//String website_text = js.executeScript("return document.documentElement.innerText;").toString();
		//System.out.println(website_text);
		
			
		js.executeScript("window.scrollBy(0,4000);", "");
		js.executeScript("window.scrollBy(0,-2000);", "");
		System.out.println("scrolled");
		
        WebElement Twitter = driver.findElement(By.xpath("//a[text()='Twitter']"));
        
		js.executeScript("arguments[0].scrollIntoView();", Twitter);
		String webelement_text = js.executeScript("return arguments[0].innerHTML",Twitter).toString();
		System.out.println(webelement_text);
		js.executeScript("window.location='https://www.instagram.com/'");
		
		Thread.sleep(5000);
		
		 WebElement username = driver.findElement(By.name("username"));
		
		 js.executeScript("arguments[0].value='krish';",username);
	     System.out.println("username entered");
	     
	     WebElement password = driver.findElement(By.name("password"));
			
		 js.executeScript("arguments[0].value='12345';",password);
		 System.out.println("password entered");
		   
		 WebElement signup = driver.findElement(By.xpath("//span[text()='Sign up']")); 
		 js.executeScript("arguments[0].click();",signup);
		 
		 Thread.sleep(5000);
	     
		 WebElement email = driver.findElement(By.name("emailOrPhone"));
	     js.executeScript("arguments[0].value='9042162336';",email);
	     System.out.println("done 1");
	     
	     WebElement fullName = driver.findElement(By.name("fullName"));
	     js.executeScript("arguments[0].value='syedjamal';",fullName);
	     System.out.println("done 2");
	     
	     WebElement username1 = driver.findElement(By.name("username"));
	     js.executeScript("arguments[0].value='syedjamal810';",username1);
		 System.out.println("done 3");
		 
		 Thread.sleep(2000);
		 WebElement password1 = driver.findElement(By.name("password"));
		 js.executeScript("arguments[0].value='29122201';",password1);
		 System.out.println("done 4");
		 
		 WebElement signup1 = driver.findElement(By.xpath("//button[text()='Sign up']"));
		 js.executeScript("arguments[0].click();",signup1);	
		 System.out.println("done 5");  
	     
		 
	     
	     
	     
	     
		
		
	}

}
