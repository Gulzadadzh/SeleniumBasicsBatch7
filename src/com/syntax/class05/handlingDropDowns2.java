package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlingDropDowns2 {
	public static String url = "http://syntaxprojects.com/jquery-dropdown-search-demo.php";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		WebElement country=driver.findElement(By.id("country"));
		Select select=new Select(country);
		select.selectByIndex(2);
		Thread.sleep(3000);
		select.selectByVisibleText("India");
		Thread.sleep(3000);
		select.selectByValue("Japan");
		Thread.sleep(3000);
		
		List<WebElement>options=select.getOptions();
		int size=options.size();
		System.out.println(size);
		
		for (int i = 0; i <size; i++) {
			select.selectByIndex(i);
			Thread.sleep(3000);
		}
		
		
		driver.quit();
		
		
		
		
		
		
		
}
}
