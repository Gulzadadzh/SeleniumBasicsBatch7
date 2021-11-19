package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
		driver.findElement(By.cssSelector("a#btn_basic_example")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a [text() = 'Proceed Next'][1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a [text() ='Input Form with Validations']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("Gulzada");
		driver.findElement(By.cssSelector("input[name*='last_name']")).sendKeys("Dzhusukeeva");
		driver.findElement(By.cssSelector("input[name^='email']")).sendKeys("123@gmail.com");
		driver.findElement(By.cssSelector("input[name$='phone']")).sendKeys("1234567890");
		driver.findElement(By.cssSelector("input[name*='address']")).sendKeys("123East str");
		driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Pittsburgh");
		driver.findElement(By.xpath("//input[@ name='zip']")).sendKeys("15220");
		driver.findElement(By.xpath("//input[contains(@ name, 'website')]")).sendKeys("www.amazon.com");
		driver.findElement(By.cssSelector("textarea[class = 'form-control']")).sendKeys("Home Work!");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick = 'resetForm();']")).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
