package com.syntax.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitWaitDemoPractice {

	public static String url="https://www.syntaxprojects.com/index.php";
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get(url);		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement homeButton=driver.findElement(By.xpath("//a[text() = 'Home']"));
		homeButton.click();
		

		
		
		
		
		
	}

}
