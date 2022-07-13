
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_element {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement username= driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		username.sendKeys("jamal@123");
		
		WebElement password= driver.findElement(By.name("pass"));
		password.sendKeys("123456789");
		
		WebElement login= driver.findElement(By.name("login"));
		login.click();
		
		System.out.println("login is done");
		
		
		
}
}

