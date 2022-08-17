package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
								//Tool						//where to find it
		System.setProperty("webdriver.chrome.driver", "/Users/gulzadadzhusukeeva/eclipse-workspace/SeleniumBasicsBatch7/drivers/chromedriver");
			//Interface				//Class																							//drivers/chromedriver.exe   windows users
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		
		String url =driver.getCurrentUrl();
		System.out.println(url);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		System.out.println("-------");
		driver.get("http://amazon.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}
}


