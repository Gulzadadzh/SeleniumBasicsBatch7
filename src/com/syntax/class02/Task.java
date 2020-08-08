package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
		driver.findElement(By.className("button")).click();
		Thread.sleep(3000);
		
		String actualTitle=driver.getTitle();
		String expectedTitle1="Web Orders";
		
		if(actualTitle.equalsIgnoreCase(expectedTitle1)) {
			System.out.println("This is the right title");
		}else {
			System.out.println("This is WRONG title");
		}
		
		
		
		
	}

}
