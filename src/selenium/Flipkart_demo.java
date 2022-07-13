package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_demo {
	
public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		
		WebElement login =driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		
		WebElement username= driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		username.sendKeys("jamal@123");
		
		WebElement password= driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		password.sendKeys("123456789");
		
		String text =login.getText();
		System.out.println(text);
		
		String attribute =login.getAttribute("href");
		System.out.println(attribute);
		
		boolean displayed=login.isDisplayed();
		System.out.println(displayed);
		
		boolean enabled=login.isEnabled();
		System.out.println(enabled);
		
		boolean selected=login.isSelected();
		System.out.println(selected);
		
		WebElement Mobiles =driver.findElement(By.xpath("//img[@alt='Mobiles']"));
		System.out.println("true");
		
		WebElement viewall =driver.findElement(By.xpath("//a[@href='https://www.flipkart.com/dotd-store?=Web&wid=3.dealCard.OMU_3&otracker=hp_omu_Deals%2Bof%2Bthe%2BDay_3&otracker1=hp_omu_SECTIONED_manualRanking_neo%2Fmerchandising_Deals%2Bof%2Bthe%2BDay_NA_wc_view-all_3']"));
		System.out.println("true");
		
		WebElement Dealsoftheday =driver.findElement(By.xpath("//h2[@class='_2cAig-'][1]"));
		System.out.println("true"); 
		
		WebElement Flipkart =driver.findElement(By.xpath("//img[contains(@title,'F')]"));
		System.out.println("true"); 
		
		WebElement Fashion =driver.findElement(By.xpath("//div[text()='Fashion']"));
		System.out.println("true"); 
		
		WebElement Travel =driver.findElement(By.xpath("//div[ contains (text(),'Tra')]"));
		System.out.println("true"); 
	  
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File dest =new File("C:\\Users\\Admin\\eclipse-workspace\\selenium\\Screenshots\\Flipkart.png");
		FileUtils.copyFile(source, dest);
		System.out.println("Screenshot is taken");
		driver.quit();
		

		
		
		
		
		
		
		

}


	
}
