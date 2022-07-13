package com.dynamic_xpath;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Meesho_dynamic_xpath {

	public static void main(String[] args) throws AWTException {

		List<Integer> pricelist = new ArrayList<Integer>();

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://meesho.com/smart-watches/pl/0uf28");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		List<WebElement> allprice = driver.findElements(
				By.xpath("//div[@class='sc-dkzDqf ProductList__GridCol-sc-8lnc8o-0 kmfTGq ZnDzz']//descendant::h5"));
		for (WebElement price : allprice) {
			String pricetext = price.getText();
			System.out.println(pricetext);
			int priceInt = Integer.parseInt(pricetext.replace("₹", ""));
			pricelist.add(priceInt);

		}
		Integer minprice = Collections.min(pricelist);
		System.out.println("Minimum price is : " + minprice);
		
		for (WebElement price : allprice) {
			String pricetext = price.getText();
			if(Integer.parseInt(pricetext.replace("₹", ""))==minprice) {
				WebElement brandname = price.findElement(By.xpath("//div[@class='sc-dkzDqf ProductList__GridCol-sc-8lnc8o-0 kmfTGq ZnDzz']//descendant::p"));
				String brandnametext = brandname.getText(); 
				System.out.println(brandnametext);
				brandname.click();
			
			}
				
		driver.findElement(By.xpath("//button[@class='BaseButton-sc-1e0kf5s-0 iHahAA ProductCard__GhostButtonBigStyled-sc-camkhj-2 doWEsQ ProductCard__GhostButtonBigStyled-sc-camkhj-2 doWEsQ']")).click();
		System.out.println("product added to cart");

	}
	}
}