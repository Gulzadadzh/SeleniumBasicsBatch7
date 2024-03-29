package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceCssAndXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index");
		driver.findElement(By.cssSelector("a#btn_basic_example")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text() = 'Simple Form Demo'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder^= 'Please enter']")).sendKeys("batch 7 rock!!!");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@ class = 'btn btn-default']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input [starts-with(@id,   'sum1')]")).sendKeys("25");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input [starts-with(@id,   'sum2')]")).sendKeys("15");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[onclick = 'return total()']")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
