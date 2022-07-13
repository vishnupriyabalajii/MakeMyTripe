package com.window_alert;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checking_window_alert {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.axisbank.com/");

		try {driver.switchTo().alert();
		System.out.println("alert is present");

		} catch (NoAlertPresentException e) {
			System.out.println("window is present");
			
		}

	}

}
