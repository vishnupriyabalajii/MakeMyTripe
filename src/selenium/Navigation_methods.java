package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_methods {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		System.out.println("title");
		
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		driver.navigate().to("https://www.instagram.com/?hl=en");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
	    driver.navigate().refresh();
	    
	  
		
		
	}

}
