package com.Main_Project;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_project {
	
public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("krishaslaan");
		driver.findElement(By.id("password")).sendKeys("krish@17");
		driver.findElement(By.id("login")).click();
		System.out.println("login successfully");
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		Select s=new Select(location);
		s.selectByValue("Paris");
		WebElement hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select s1=new Select(hotel);
		s1.selectByIndex(2);
		WebElement roomtype = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select s2=new Select(roomtype);
		s2.selectByVisibleText("Super Deluxe");
		WebElement no_of_rooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select s3=new Select(no_of_rooms);
		s3.selectByVisibleText("2 - Two");
	    WebElement chk_in = driver.findElement(By.xpath("//input[@id='datepick_in']"));
	    chk_in.clear();
	    chk_in.sendKeys("17/12/2022");
	    WebElement chk_out = driver.findElement(By.xpath("//input[@id='datepick_out']"));
	    chk_out.clear();
	    chk_out.sendKeys("18/12/2022");
	    WebElement no_of_adults = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select s4=new Select(no_of_adults);
		s4.selectByValue("2");
		WebElement no_of_child = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select s5=new Select(no_of_child);
		s5.selectByValue("2");
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
		System.out.println("Hotel searched");
		
		driver.findElement(By.xpath("//input[@value='0']")).click();
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		System.out.println("Hotel selected");
		
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("krish");
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Syed");
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("no:7,xyz street,chennai");
		driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys("1234567891234567");
		WebElement card_no=driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select s6=new Select(card_no);
		s6.selectByIndex(2);
		WebElement month=driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select s7=new Select(month);
		s7.selectByVisibleText("December");
		WebElement year=driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select s8=new Select(year);
		s8.selectByVisibleText("2022");
		driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("389");
		driver.findElement(By.xpath("//input[@id='book_now']")).click();
		System.out.println("Hotel Booked");
		driver.findElement(By.xpath("//input[@id='my_itinerary']")).click();
		driver.findElement(By.xpath("//input[@value='632540']")).click();
		driver.findElement(By.xpath("//input[@id='logout']")).click();
	    System.out.println("logged out successfully");
		
		
		
		
		
		
		
		

}
}