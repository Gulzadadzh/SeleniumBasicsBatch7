package com.syntax.class07;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static String url = "https://demoqa.com/browser-windows";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String mainPageHandle = driver.getWindowHandle();
		System.out.println(mainPageHandle);

		WebElement b = driver.findElement(By.xpath("//button[@id='windowButton']"));
		b.click();

		Set<String> allWindow = driver.getWindowHandles();
		System.out.println(allWindow.size());

		Iterator<String> it = allWindow.iterator();
		mainPageHandle=it.next();
		String child=it.next();
		System.out.println(child);
		
		System.out.println(b.getText());
		

		
		
	}

}
