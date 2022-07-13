package com.dynamic_webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Corana_dynamic {

	static int indexofTotalCases;
	static int indexofActiveCases;
	static int indexofNewCases;
	static int indexofTotalDeaths;
	static int indexofNewDeaths;
	static int indexofNewRecovered;
	static int indexofSeriousCritical;
	static int indexofCountry;
	static int indexofTotalRecovered;
	static int indexofTot;
	static int indexofDeaths1M;
	static int indexofTotalTests;
	static int indexofTests1M;
	static int indexofPopulation;
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.worldometers.info/coronavirus/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		List<WebElement> alldatas = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));
		for (int i = 0; i < alldatas.size(); i++) {
			String TitleOfalldatas = alldatas.get(i).getText().replace("\n", "");

			System.out.println(TitleOfalldatas);

			if (TitleOfalldatas.equals("TotalCases")) {
				indexofTotalCases = i;

			} else if (TitleOfalldatas.equals("NewCases")) {
				indexofNewCases = i;
			} else if (TitleOfalldatas.equals("TotalDeaths")) {
				indexofTotalDeaths = i;
			}

			else if (TitleOfalldatas.equals("NewDeaths")) {
				indexofNewDeaths = i;
			} else if (TitleOfalldatas.equals("TotalRecovered")) {
				indexofTotalRecovered = i;
			} else if (TitleOfalldatas.equals("NewRecovered")) {
				indexofNewRecovered = i;
			} else if (TitleOfalldatas.equals("ActiveCases")) {
				indexofActiveCases = i;
			} else if (TitleOfalldatas.equals("Serious,Critical")) {
				indexofSeriousCritical = i;
			} else if (TitleOfalldatas.equals("Country,Other")) {
				indexofCountry = i;
			}

			else if (TitleOfalldatas.equals("Tot Cases/1M pop")) {
				indexofTot = i;
			} else if (TitleOfalldatas.equals("Deaths/1M pop")) {
				indexofDeaths1M = i;
			} else if (TitleOfalldatas.equals("TotalTests")) {
				indexofTotalTests = i;
			} else if (TitleOfalldatas.equals("Tests/1M pop")) {
				indexofTests1M = i;
			}

			else if (TitleOfalldatas.equals("Population")) {
				indexofPopulation = i;
			}

			System.out.println("Index of TotalCases is:" + indexofTotalCases);
			System.out.println("Index of NewCases is:" + indexofNewCases);
			System.out.println("Index of TotalRecovered is:" + indexofTotalRecovered);
			System.out.println("Index of NewRecovered is:" + indexofNewRecovered);
			System.out.println("Index of ActiveCases is:" + indexofActiveCases);
			System.out.println("Index of TotalDeaths is:" + indexofTotalDeaths);
			System.out.println("Index of NewDeaths is:" + indexofNewDeaths);
			System.out.println("Index of SeriousCritical is:" + indexofSeriousCritical);
			System.out.println("Index of Country is:" + indexofCountry);
			System.out.println("Index of indexofTot is:" + indexofTot);
			System.out.println("Index of TotalTests is:" + indexofTotalTests);
			System.out.println("Index of Population is:" + indexofPopulation);
		}
	}

	public static void getrequireddata(String country) {

		List<WebElement> allrows = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr"));
		for (int i = 0; i < allrows.size(); i++) {

			List<WebElement> allcountrydata = driver.findElements(By.xpath("td[" + indexofCountry + ""));
			for (int j = 0; j < allcountrydata.size(); j++) {

				if (j == indexofCountry) {
					if (allcountrydata.get(j).getText().equalsIgnoreCase(country)) {
						System.out.println("value of TotalCases is:" + allcountrydata.get(indexofTotalCases).getText());
						System.out.println("value of NewCases is:" + allcountrydata.get(indexofNewCases).getText());
						System.out.println(
								"value of TotalRecovered is:" + allcountrydata.get(indexofTotalRecovered).getText());
						System.out.println(
								"value of NewRecovered is:" + allcountrydata.get(indexofNewRecovered).getText());
						System.out
								.println("value of ActiveCases is:" + allcountrydata.get(indexofActiveCases).getText());
						System.out
								.println("value of TotalDeaths is:" + allcountrydata.get(indexofTotalDeaths).getText());
						System.out.println("value of NewDeaths is:" + allcountrydata.get(indexofNewDeaths).getText());
						System.out.println(
								"value of SeriousCritical is:" + allcountrydata.get(indexofSeriousCritical).getText());
						System.out.println("value of Country is:" + allcountrydata.get(indexofCountry).getText());
						System.out.println("value of indexofTot is:" + allcountrydata.get(indexofTot).getText());
						System.out.println("value of TotalTests is:" + allcountrydata.get(indexofTotalTests).getText());
						System.out.println("value of Population is:" + allcountrydata.get(indexofPopulation).getText());

					}

				}

			}

		}

	}

}
