package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public static String url = "http://syntaxprojects.com/humanresources/symfony/web/index.php/auth/login";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get(url);
		WebElement userNameTextBox = driver.findElement(By.id("txtUsername"));
		userNameTextBox.sendKeys("Admin");
		WebElement passwordTextBox = driver.findElement(By.id("txtPassword"));
		passwordTextBox.sendKeys("Hum@nhrm123");
		Thread.sleep(3000);
		WebElement LoginButton = driver.findElement(By.className("button"));
		LoginButton.click();

		boolean isDisplayed = LoginButton.isDisplayed();
		System.out.println(isDisplayed);

	}

}
