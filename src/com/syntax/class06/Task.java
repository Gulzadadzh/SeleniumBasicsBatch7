package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static String url = "https://www.syntaxprojects.com/bootstrap-iframe.php";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.switchTo().frame("FrameOne");
		WebElement logo = driver.findElement(By.name("makaha-ButtonElement--XMO5BoJfiAVGcnXXwIIj"));
		boolean isEnabled = logo.isEnabled();
		System.out.println("Is logo enabled? " + isEnabled);

		driver.switchTo().defaultContent();

		Thread.sleep(2000);
		driver.quit();
	}
}