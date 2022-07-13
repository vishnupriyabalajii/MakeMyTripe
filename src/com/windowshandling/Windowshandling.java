package com.windowshandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowshandling {
	
public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions ac=new Actions(driver);
		Robot r=new Robot();
		
		WebElement women = driver.findElement(By.cssSelector("a[title='Women']"));
		ac.moveToElement(women).build().perform();
		
		
		ac.contextClick(women).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		WebElement dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		ac.moveToElement(dresses).build().perform();
		ac.contextClick(dresses).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		WebElement tshirts = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		ac.moveToElement(tshirts).build().perform();
		ac.contextClick(tshirts).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		System.out.println("done");
		String windowhandle=driver.getWindowHandle();
		String title = driver.getTitle();
		System.out.println(title);
		
		Set<String> windowHandles = driver.getWindowHandles();
//		for (String id : windowHandles) {
//			String title2 = driver.switchTo().window(id).getTitle();
//			System.out.println(title2);
//			
//			
//		}
		
		
		String dress1="Dresses - My Store";
		for (String id2 : windowHandles) {
			
			if(driver.switchTo().window(id2).getTitle().equals(dress1)) {
		  	break;
		}
		
		
		
		
		}

}
}
