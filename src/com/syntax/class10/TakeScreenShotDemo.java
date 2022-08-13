package com.syntax.class10;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotDemo {
	public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("Hum@nhrm123");
		WebElement LoginButton = driver.findElement(By.className("button"));
		LoginButton.click();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File sourceFile=ts.getScreenshotAs(OutputType.FILE); // the screenshot is taken
		
		try {
			FileUtils.copyFile(sourceFile, new File("screenshots/HRMS/adminLogin.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
