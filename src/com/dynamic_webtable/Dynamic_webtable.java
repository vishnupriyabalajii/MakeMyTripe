package com.dynamic_webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_webtable {

	static int indexofTotalCases;
	static int indexofActiveCases;
	static int indexofTotalRecovered;
	static int indexofCountry;
	static int indexofPopulation;
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		List<WebElement> allheader = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));
		for (int i = 0; i < allheader.size(); i++) {
			String titleofallheader = allheader.get(i).getText().replace("\n", "");
			System.out.println(titleofallheader);

			if (titleofallheader.equalsIgnoreCase("TotalCases")) {
				indexofTotalCases = i;

			} else if (titleofallheader.equalsIgnoreCase("ActiveCases")) {
				indexofActiveCases = i;
			} else if (titleofallheader.equalsIgnoreCase("TotalRecovered")) {
				indexofTotalRecovered = i;

			} else if (titleofallheader.contains("Country")) {
				indexofCountry = i;

			} else if (titleofallheader.equalsIgnoreCase("Population")) {
				indexofPopulation = i;

			}
		}

		System.out.println("Index of TotalCases :" + indexofTotalCases);
		System.out.println("Index of ActiveCases :" + indexofActiveCases);
		System.out.println("Index of TotalRecovered :" + indexofTotalRecovered);
		System.out.println("Index of Country :" + indexofCountry);
		System.out.println("Index of Population :" + indexofPopulation);
		System.out.println("------------------------");

		List<WebElement> allrow = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody/tr"));
		for (int i = 0; i < allrow.size(); i++) {
			List<WebElement> allrowdata = allrow.get(i).findElements(By.xpath("td"));
			for (int j = 0; j < allrowdata.size(); j++) {
				if (j == indexofCountry) {
					if (allrowdata.get(j).getText().equalsIgnoreCase("India")) {
						System.out.println(
								"value of TotalCases in India :" + allrowdata.get(indexofTotalCases).getText());
						System.out.println(
								"value of ActiveCases in India :" + allrowdata.get(indexofActiveCases).getText());
						System.out.println(
								"value of TotalRecovered in India :" + allrowdata.get(indexofTotalRecovered).getText());
						System.out.println("value of Country in India :" + allrowdata.get(indexofCountry).getText());
						System.out.println(
								"value of Population in India :" + allrowdata.get(indexofPopulation).getText());
						System.out.println("--------------------------------------");
					}

				}
			}

		}
		WebElement allindiarow = driver
				.findElement(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr[7]"));
		List<WebElement> allindiadata = allindiarow.findElements(By.xpath("td"));
		for (WebElement rowdata : allindiadata) {
			System.out.println(rowdata.getText());

		}
		System.out.println("--------------------");

		List<WebElement> countrylist = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr/td[2]"));
		for (int i = 0; i < countrylist.size(); i++) {
			String country = countrylist.get(i).getText();
			System.out.println(country);

		}
		System.out.println("------------------------");
		List<WebElement> alltabledata = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody/tr/td"));
		for (int i = 0; i < alltabledata.size(); i++) {
			String alltabledatatext = alltabledata.get(i).getText();
			System.out.println(alltabledatatext);

		}
	}
}
