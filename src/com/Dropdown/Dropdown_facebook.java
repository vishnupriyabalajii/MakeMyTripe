package com.Dropdown;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_facebook {

public static void main(String[] args) throws IOException, InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		username.sendKeys("jamal@123");
		
		WebElement password = driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
		password.sendKeys("123456789");
		
		WebElement createnewaccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		createnewaccount.click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File dest =new File("C:\\Users\\Admin\\eclipse-workspace\\selenium\\Screenshots\\facebook.png");
		FileUtils.copyFile(source, dest);
		System.out.println("Screenshot is taken");
		
		driver.navigate().to("https://www.facebook.com/r.php");
		
		WebElement Firstname = driver.findElement(By.name("firstname"));
		Firstname.sendKeys("Jamal");
		
		WebElement surname = driver.findElement(By.name("lastname"));
		surname.sendKeys("syed");
		
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("syed@123");
		
		WebElement newpassword = driver.findElement(By.name("reg_passwd__"));
		newpassword.sendKeys("syed@123");
		
		WebElement birthday = driver.findElement(By.name("birthday_day"));
		Select s= new Select(birthday);
		s.selectByValue("22");
		
		
        WebElement birthmonth = driver.findElement(By.name("birthday_month"));
		Select s1= new Select(birthmonth);
		s1.selectByIndex(1);
		
		
        WebElement birthyear = driver.findElement(By.name("birthday_year"));
		Select s2= new Select(birthyear);
		s2.selectByValue("2002");
		
		
		WebElement female = driver.findElement(By.xpath("//label[text()='Female']"));
		female.click();
		

		TakesScreenshot ts1=(TakesScreenshot)driver;
		File source1=ts.getScreenshotAs(OutputType.FILE);
		File dest1 =new File("C:\\Users\\Admin\\eclipse-workspace\\selenium\\Screenshots\\facebook1.png");
		FileUtils.copyFile(source1, dest1);
		System.out.println("Screenshot is taken");
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
	
}
}
