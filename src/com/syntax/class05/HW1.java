package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW1 {
	
	public static String url="https://www.facebook.com/r.php";
	
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

			WebDriver driver = new ChromeDriver();
			driver.get(url);
			driver.findElement(By.xpath("//input[@ id='u_0_n']")).sendKeys("Gulzada");
			driver.findElement(By.xpath("//input[@ id='u_0_p']")).sendKeys("Dzh");
			driver.findElement(By.xpath("//input[@ id='u_0_s']")).sendKeys("412999999");
			driver.findElement(By.cssSelector("input[id^= 'password_step_input']")).sendKeys("BB");
			Thread.sleep(1000);
			
			WebElement month = driver.findElement(By.id("month"));
			Select select = new Select(month);
			select.selectByIndex(5);
			
			WebElement day = driver.findElement(By.id("day"));
			Select select1 = new Select(day);
			select1.selectByIndex(27);
			
			WebElement year=driver.findElement(By.id("year"));
			Select select2 = new Select(year);
			select2.selectByValue("1994");
			
			WebElement gender=driver.findElement(By.className("_58mt"));
			gender.click();
			driver.findElement(By.cssSelector("button[id*= 'u_0_14']")).click();
			Thread.sleep(3000);
			driver.quit();
			
			
}
}
