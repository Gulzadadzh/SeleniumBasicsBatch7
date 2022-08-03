package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/gulzadadzhusukeeva/eclipse-workspace/SeleniumBasicsBatch7/drivers/chromedriver 10.46.21 AM");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		
		String url =driver.getCurrentUrl();
		System.out.println(url);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		
		
	}
}


