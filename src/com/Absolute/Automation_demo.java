package com.Absolute;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automation_demo {
	
public static void main(String[] args) throws InterruptedException, AWTException, IOException   {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
	    driver.get("http://automationpractice.com/index.php");
	    driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
	    driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("jamalvishnu29@gmail.com");
	    driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
	    WebElement radio1 = driver.findElement(By.xpath("//input[@value='1']"));
	    radio1.click();
	    driver.findElement(By.id("customer_firstname")).sendKeys("krish");
	    driver.findElement(By.id("customer_lastname")).sendKeys("syed");
	    driver.findElement(By.id("passwd")).sendKeys("xyzzzz");
	    
	    WebElement days = driver.findElement(By.id("days"));
	    Select s=new Select(days);
	    s.selectByValue("17");
	    
	    WebElement months = driver.findElement(By.id("months"));
	    Select s1=new Select(months);
	    s1.selectByVisibleText("December ");
	    WebElement years = driver.findElement(By.id("years"));
	    Select s2=new Select(years);
	    s2.selectByIndex(4);
	    driver.findElement(By.id("company")).sendKeys("Greens");
	    driver.findElement(By.id("address1")).sendKeys("Greens,xyz street,638001");
	    driver.findElement(By.id("address2")).sendKeys("no:9,yyyy apartment,2nd floor");
	    driver.findElement(By.id("city")).sendKeys("chennai");
	    WebElement state = driver.findElement(By.xpath("//select[@id='id_state']"));
	    Select s3=new Select(state);
	    s3.selectByVisibleText("New York");
	    driver.findElement(By.id("postcode")).sendKeys("00000");
	    WebElement country = driver.findElement(By.xpath("//select[@id='id_country']"));
	    Select s4=new Select(country);
	    s4.selectByVisibleText("United States");
	    driver.findElement(By.id("phone_mobile")).sendKeys("1234567890");
	    driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
	    WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
	    Actions ac=new Actions(driver);
	    ac.moveToElement(women).build().perform();
	    WebElement casualdress = driver.findElement(By.xpath("(//a[text()='Casual Dresses'])[1]"));
	    casualdress.click();
	    WebElement printeddress = driver.findElement(By.xpath("(//a[@title='Printed Dress'])[1]"));
	    JavascriptExecutor js= (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView();",printeddress);
	    ac.moveToElement(printeddress).build().perform();
	    
        WebElement quickview = driver.findElement(By.xpath("(//a[@rel='http://automationpractice.com/index.php?id_product=3&controller=product'])[2]"));
        quickview.click();
        
        WebElement frame = driver.findElement(By.xpath("//iframe[@frameborder='0']"));
		driver.switchTo().frame(frame);
        WebElement quantity = driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
        quantity.click();
        WebElement size = driver.findElement(By.id("group_1"));
	    Select s5=new Select(size);
	    s5.selectByIndex(1);
	    driver.findElement(By.xpath("//button[@name='Submit']")).click();
	    driver.switchTo().defaultContent();
	    TakesScreenshot ts=(TakesScreenshot) driver;
	    File source=ts.getScreenshotAs(OutputType.FILE);
	    File dest=new File("C:\\Users\\Admin\\eclipse-workspace\\selenium\\Screenshots\\Automation1.png");
	    FileUtils.copyFile(source, dest);
	    System.out.println("screenshot captured");
	    driver.findElement(By.xpath(".//a[contains(@title,'Proceed to checkout')]")).click();
        driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
	    driver.findElement(By.xpath("//button[@name='processAddress']")).click();
	    driver.findElement(By.xpath("//input[@value='1']")).click();
	    driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
	    driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();
	    driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();
	    TakesScreenshot ts1=(TakesScreenshot) driver;
	    File source1=ts1.getScreenshotAs(OutputType.FILE);
	    File dest1=new File("C:\\Users\\Admin\\eclipse-workspace\\selenium\\Screenshots\\Automation2.png");
	    FileUtils.copyFile(source1, dest1);
	    System.out.println("screenshot captured");
	    System.out.println("project successfully completed");
	    

}
}