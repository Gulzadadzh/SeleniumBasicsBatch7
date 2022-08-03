package com.syntax.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/gulzadadzhusukeeva/eclipse-workspace/SeleniumBasicsBatch7/drivers/chromedriver");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");
		
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Hello");
		
		Thread.sleep(2000);
		
		
		driver.quit();
		
		
		
		
		
	}

}
