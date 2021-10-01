package com.syntax.class12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/gulzadadzhusukeeva/eclipse-workspace/SeleniumBasicsBatch7/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		
		
	}

}
