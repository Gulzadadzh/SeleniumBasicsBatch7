package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingAlertsPractice {

	public static String url="http://www.uitestpractice.com/Students/Switchto";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver =new ChromeDriver();
		driver.get(url);
		WebElement simpleAlertbutton=driver.findElement(By.id("alert"));
		simpleAlertbutton.click();
		
		Alert alert=driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		
		WebElement confirmationAlertbutton=driver.findElement(By.id("confirm"));
		confirmationAlertbutton.click();
		Thread.sleep(3000);
		//Alert confirmAlert=driver.switchTo().alert();
		String AlertText=alert.getText();
		System.out.println(AlertText);

		alert.dismiss();
		
		WebElement promptAlertButton=driver.findElement(By.id("prompt"));
		promptAlertButton.click();
		Thread.sleep(3000);

		alert.sendKeys("Syntax");
		Thread.sleep(3000);


		
	}

}
