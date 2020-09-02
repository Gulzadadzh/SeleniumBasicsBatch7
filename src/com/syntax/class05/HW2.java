package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW2 {
//	Go to ebay.com
//	get all the categories and print them in the console
//	select Computers/Tables & Networking
//	click on search
//	verify the header
	public static String url="http://ebay.com";
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		WebElement categories=driver.findElement(By.xpath("//button[@id='gh-shop-a']"));
		
		Select select = new Select(categories);
		
		List<WebElement> options=select.getOptions();
		int size = options.size();
		System.out.println(size);

		for(int i = 0; i < size; i++) {
			select.selectByIndex(i);
			Thread.sleep(3000);
		}
		 select.selectByVisibleText("Computers, Tablets & Network Hardware");
		 
	}
}
