package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
		driver.findElement(By.id("customer.firstName")).sendKeys("Gulzada");
		driver.findElement(By.id("customer.lastName")).sendKeys("Dzhusukeeva");
		driver.findElement(By.id("customer.address.street")).sendKeys("000 East street");
		driver.findElement(By.id("customer.address.city")).sendKeys("Pittsburgh");
		driver.findElement(By.id("customer.address.state")).sendKeys("PA");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("15220");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("(412)706-1111");
		driver.findElement(By.id("customer.ssn")).sendKeys("111-11-1111");
		driver.findElement(By.id("customer.username")).sendKeys("gulzada11");
		driver.findElement(By.id("customer.password")).sendKeys("1111");
		driver.findElement(By.id("repeatedPassword")).sendKeys("1111");
		Thread.sleep(3000);
		driver.findElement(By.className("button")).click();
		Thread.sleep(3000);
		//driver.close();
		
		
		
		
	}

}
