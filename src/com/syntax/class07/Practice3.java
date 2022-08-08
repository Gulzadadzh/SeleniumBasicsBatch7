package com.syntax.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {
	public static String url = "https://demoqa.com/browser-windows";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get(url);
		String mainPage = driver.getWindowHandle();
		System.out.println("MainPage    "+mainPage);

		WebElement newWindowMess = driver.findElement(By.xpath("//button[@id='messageWindowButton']"));
		newWindowMess.click();

		Set<String> allWindowHandle = driver.getWindowHandles();
		int size = allWindowHandle.size();
		System.out.println(size);

		
		Iterator<String> it=allWindowHandle.iterator();
		while(it.hasNext()) {
			String child=it.next();
			if(!child.equals(mainPage)) {
				driver.switchTo().window(child);
				//System.out.println(newWindowMess.getText());
			}
		}
		System.out.println(newWindowMess.getText());
		
		
		
	}
}
