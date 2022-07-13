package com.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Keyboard_events {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://automationpractice.com/index.php");
		
		WebElement women= driver.findElement(By.xpath("//a[text()='Women']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(women).build().perform();
		ac.contextClick(women).build().perform();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		System.out.println("New tab opened");
		
		WebElement dresses= driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
		Actions ac1=new Actions(driver);
		ac.moveToElement(dresses).build().perform();
		ac.contextClick(dresses).build().perform();
	
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		System.out.println("New window opened");
		Thread.sleep(2000);
		driver.navigate().to("http://automationpractice.com/index.php?id_category=8&controller=category");
	
		
		WebElement Tshirts= driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
		Actions ac2=new Actions(driver);
		ac.moveToElement(Tshirts).build().perform();
		ac.contextClick(Tshirts).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_UP);
		r.keyPress(KeyEvent.VK_ENTER);
		System.out.println("Inspect is selected");
		
				
		
		
		
	    
		
		
		
		
	
		
		
		
		
	}

}
