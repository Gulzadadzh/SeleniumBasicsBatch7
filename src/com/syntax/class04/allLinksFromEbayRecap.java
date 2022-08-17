package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class allLinksFromEbayRecap {
	
	public static String url = "http://ebay.com";

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		List<WebElement>allLinks=driver.findElements(By.tagName("link"));
		System.out.println(allLinks.size());
		for (WebElement links : allLinks) {
			String link=links.getText();
			String attr=links.getAttribute("href");
			if(!link.isEmpty()) {
				System.out.println(link+" "+attr);
			}
		}
		
		
		
		

	}

}
