package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_methods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\selenium\\chrome\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		
		
	}

}
