package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_method {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement username= driver.findElement(By.id("email"));
		username.sendKeys("jamal@123");
		
		WebElement password= driver.findElement(By.name("pass"));
		password.sendKeys("123456789");
		
		//--------------------------------------------------------
		
		WebElement login= driver.findElement(By.name("login"));
		
		String text =login.getText();
		System.out.println(text);
		
		String attribute =login.getAttribute("data-testid");
		System.out.println(attribute);
		
		boolean displayed=login.isDisplayed();
		System.out.println(displayed);
		
		boolean enabled=login.isEnabled();
		System.out.println(enabled);
		
		boolean selected=login.isSelected();
		System.out.println(selected);
		
		login.click();
		System.out.println("login is done");
		
		
}	
		
		
}		
		


