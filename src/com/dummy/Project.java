package com.dummy;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Project {

   public static void main(String[] args)  throws InterruptedException, AWTException, IOException {
			
	   System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("http://automationpractice.com/index.php");
			
			WebElement signin = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
			signin.click();
			
			WebElement email = driver.findElement(By.id("email_create"));
			email.sendKeys("Royals@gmail.com");
			
			WebElement create_account = driver.findElement(By.id("SubmitCreate"));
			create_account.click();
			
	
			WebElement Gender = driver.findElement(By.id("uniform-id_gender1"));
			Gender.click();
			
			WebElement F_name= driver.findElement(By.id("customer_firstname"));
			F_name.sendKeys("Virat");
			
			WebElement L_name = driver.findElement(By.id("customer_lastname"));
			L_name.sendKeys("kohli");
			
			WebElement password = driver.findElement(By.id("passwd"));
			password.sendKeys("abc@123");
			
			WebElement Day = driver.findElement(By.id("days"));
			Select d = new Select(Day);
			d.selectByValue("5");
			
			WebElement month = driver.findElement(By.id("months"));
			Select m = new Select(month);
			m.selectByIndex(11);
			
			WebElement year = driver.findElement(By.id("years"));
			Select y = new Select(year);
			y.selectByValue("1988");
			
			WebElement C_B1 = driver.findElement(By.name("newsletter"));
			C_B1.click();
			
			driver.findElement(By.name("optin")).click();
			
			WebElement F_name1 = driver.findElement(By.id("firstname"));
			F_name1.sendKeys("virat");
			
			WebElement L_name1 = driver.findElement(By.id("lastname"));
			L_name1.sendKeys("kohli");
		
			driver.findElement(By.name("company")).sendKeys("Greens");			
			driver.findElement(By.name("address1")).sendKeys("Chennai");			
			driver.findElement(By.name("city")).sendKeys("Chennai");
			
			WebElement State = driver.findElement(By.name("id_state"));
			Select s = new Select(State);
			s.selectByVisibleText("Washington");
			
			driver.findElement(By.name("other")).sendKeys("abc");
			driver.findElement(By.id("postcode")).sendKeys("63657");			
			driver.findElement(By.name("phone")).sendKeys("1234567");			
			driver.findElement(By.name("phone_mobile")).sendKeys("89399 15577");			
			driver.findElement(By.name("submitAccount")).click();		
			
			WebElement Women = driver.findElement(By.xpath("//a[@title='Women']"));
			
			Actions a = new Actions(driver);
			a.moveToElement(Women).build().perform();
			
			WebElement Dress = driver.findElement(By.xpath("//a[@title='Evening Dresses']"));
			Dress.click();
		
            Thread.sleep(5000);
			
			WebElement quick_view = driver.findElement(By.xpath("//a[@class='quick-view-mobile']"));
	        quick_view.click(); 
	        
			WebElement product = driver.findElement(By.xpath("//iframe[@frameborder='0']"));   
			driver.switchTo().frame(product);
			
			Thread.sleep(5000);
			
			WebElement add = driver.findElement(By.xpath("(//a[@data-field-qty='qty'])[2]"));
			add.click();
			
			WebElement size = driver.findElement(By.id("group_1"));			
			Select s1 = new Select(size);			
			s1.selectByVisibleText("L");
			
			WebElement card = driver.findElement(By.name("Submit"));
			card.click();
			
			driver.switchTo().defaultContent();
			
			TakesScreenshot ts =(TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
            File dest = new File("C:\\Users\\Admin\\eclipse-workspace\\selenium\\Screenshots\\Checkout.png");
			FileUtils.copyFile(source, dest);
			
		 WebElement proc = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));			
	       proc.click(); 
	  
	     WebElement procd = driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
	       procd.click();
	       
	     WebElement findElement = driver.findElement(By.name("processAddress"));
	       findElement.click();
	       
	     driver.findElement(By.xpath("//input[@type='checkbox']")).click(); 	       
	     driver.findElement(By.name("processCarrier")).click(); 	       
	     driver.findElement(By.xpath("//a[@class='bankwire']")).click();
	     driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	       
	     TakesScreenshot ts1 =(TakesScreenshot) driver;
		 File source1 = ts1.getScreenshotAs(OutputType.FILE);
         File dest1 = new File("C:\\Users\\Admin\\eclipse-workspace\\selenium\\Screenshots\\completed.png");
		 FileUtils.copyFile(source1, dest1);
	     System.out.println("Project Is Done");
   } 
			
}		







