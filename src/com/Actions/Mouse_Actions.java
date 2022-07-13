package com.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {
	
public static void main(String[] args) {
		
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
		
		WebElement close= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		
		WebElement Fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(Fashion).build().perform();//a[text()='All']
		
		WebElement bottomwear = driver.findElement(By.xpath("(//a[@class='_6WOcW9 _2-k99T'])[1]"));
		bottomwear.click();
		driver.navigate().to("https://www.flipkart.com/clothing-and-accessories/bottomwear/pr?sid=clo,vua&p[]=facets.ideal_for%255B%255D%3DMen&p[]=facets.ideal_for%255B%255D%3Dmen&otracker=categorytree");
        System.out.println("Bottom wear selected");
        
        driver.navigate().to("https://www.flipkart.com/");
        WebElement Fashion1 = driver.findElement(By.xpath("//div[text()='Fashion']"));
		Actions ac1=new Actions(driver);
		ac.moveToElement(Fashion1).build().perform();

		WebElement womenethnic = driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		womenethnic.click();
        driver.navigate().to("https://www.flipkart.com/clothing-and-accessories/~cs-aerg0b0afc/pr?sid=clo&collection-tab-name=KK%2CSets%2CDM%2CSarees&fm=neo%2Fmerchandising&iid=M_98e09767-dfbf-4906-a550-8588fe9c1f93_1_372UD5BXDFYS_MC.HQXTE43PO8HC&otracker=hp_rich_navigation_3_1.navigationCard.RICH_NAVIGATION_Fashion~Women%2BEthnic_HQXTE43PO8HC&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_3_L1_view-all&cid=HQXTE43PO8HC");
        System.out.println("Women ethnic selected");
        
        driver.navigate().to("https://www.flipkart.com/");
        WebElement Fashion2 = driver.findElement(By.xpath("//div[text()='Fashion']"));
		Actions ac2=new Actions(driver);
		ac.moveToElement(Fashion2).build().perform();

		WebElement kids = driver.findElement(By.xpath("//a[text()='Kids']"));
		kids.click(); 
		driver.navigate().to("https://www.flipkart.com/clothing-and-accessories/pr?sid=clo&otracker=categorytree&p%5B%5D=facets.ideal_for%255B%255D%3DGirls&p%5B%5D=facets.ideal_for%255B%255D%3DBoys");
		System.out.println("kids selected");
		
		driver.navigate().to("https://www.flipkart.com/");
	    WebElement Fashion3 = driver.findElement(By.xpath("//div[text()='Fashion']"));
		Actions ac3=new Actions(driver);
		ac.moveToElement(Fashion3).build().perform();

		WebElement all = driver.findElement(By.xpath("//a[text()='All']"));
		all.click(); 
		driver.navigate().to("https://www.flipkart.com/clothing-and-accessories/topwear/pr?sid=clo,ash&p[]=facets.ideal_for%255B%255D%3DMen&p[]=facets.ideal_for%255B%255D%3Dmen&otracker=categorytree");
		System.out.println("All selected");
		
		driver.navigate().to("https://www.flipkart.com/");
        WebElement Fashion4 = driver.findElement(By.xpath("//div[text()='Fashion']"));
		Actions ac4=new Actions(driver);
		ac.moveToElement(Fashion4).build().perform();
		
		WebElement menTshirts = driver.findElement(By.xpath("(//a[@class='_6WOcW9 _3YpNQe'])[2]"));
		menTshirts.click();
		driver.navigate().to("https://www.flipkart.com/mens-tshirts/pr?sid=clo,ash,ank,edy&fm=neo%2Fmerchandising&iid=M_f7bdc68b-ad2a-47d7-b714-00b6f5c47875_1_372UD5BXDFYS_MC.IF56C41VGEYS&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Fashion~Men%2527s%2BTop%2BWear~Men%2527s%2BT-Shirts_IF56C41VGEYS&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L2_view-all&cid=IF56C41VGEYS");
		System.out.println("menTshirts selected");
		


}
}