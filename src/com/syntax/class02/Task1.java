package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		Thread.sleep(2000);
		
		String actualTitle=driver.getTitle();
		String expectedTitle1="Web Orders";
		
		if(actualTitle.equals(expectedTitle1)) {
			System.out.println("Title is correct");
		}else {
			System.out.println("Error");
		}
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();
		
		
		
	}	
}
