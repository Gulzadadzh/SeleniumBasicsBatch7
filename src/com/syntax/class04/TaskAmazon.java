package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskAmazon {
	public static String url = "http://www.amazon.com";

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		List<WebElement> tNames = driver.findElements(By.tagName("a"));

		for (WebElement element : tNames) {
			String elements=element.getText();
			String links=element.getAttribute("href");
			//if(!elements.isEmpty()) {
			//	System.out.println(elements + "      " + links);

			//}
			System.out.println(elements);
		}
		driver.quit();
	}

}
