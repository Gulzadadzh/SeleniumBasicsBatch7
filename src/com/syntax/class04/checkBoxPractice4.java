package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxPractice4 {
	public static String url = "http://syntaxprojects.com/basic-checkbox-demo.php";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		WebElement checkBox=driver.findElement(By.id("isAgeSelected"));
		checkBox.click();
		String text=checkBox.getText();
		System.out.println(text);
		
		
		
		
		
		
	}
}
