package com.syntax.class09;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPaginations{

	    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

	    public static void main(String[] args) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
	        WebDriver driver = new ChromeDriver();
	        driver.get(url);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	        // login actions
	        WebElement username = driver.findElement(By.id("txtUsername"));
	        username.sendKeys("Admin");
	        WebElement password = driver.findElement(By.id("txtPassword"));
	        password.sendKeys("Hum@nhrm123");
	        WebElement loginButton = driver.findElement(By.id("btnLogin"));
	        loginButton.click();

	        // navigating to add employee page
	        WebElement pim = driver.findElement(By.linkText("PIM"));
	        pim.click();

	        WebElement addEmployeeButton = driver.findElement(By.id("menu_pim_addEmployee"));
	        addEmployeeButton.click();

	        // adding an employee and saving
	        WebElement firstName = driver.findElement(By.id("firstName"));
	        firstName.sendKeys("Diego");
	        WebElement lastName = driver.findElement(By.id("lastName"));
	        lastName.sendKeys("Asghar");

	        WebElement empIdElement = driver.findElement(By.id("employeeId"));
	        String empId = empIdElement.getAttribute("value");

	        WebElement saveButton = driver.findElement(By.id("btnSave"));
	        saveButton.click();

	        WebElement employeeList = driver.findElement(By.linkText("Employee List"));
	        employeeList.click();
	        WebElement sortByName= driver.findElement(By.xpath("//a[contains(text(), 'First ')] "));

	        boolean flag = true;

	        while(flag) {
	            List<WebElement> rows = driver.findElements(By.xpath("//table[@id = 'resultTable']/tbody/tr")); // reinitialize all the element because the page gets refreshed
	            for(int i = 0; i < rows.size(); i++) {
	                String rowText = rows.get(i).getText();
	                if(rowText.contains(empId)) { // compare the empId
	                    flag = false; // set the boolean as false
	                    WebElement checkBox = driver.findElement(By.xpath("//table[@id = 'resultTable']/tbody/tr["+i+"]/td[1]")); // identify the checkbox
	                    checkBox.click();
	                    // delete person we just added
	                    WebElement deleteButton = driver.findElement(By.id("btnDelete"));
	                    deleteButton.click();
	                    WebElement confirmDelete = driver.findElement(By.id("dialogDeleteBtn"));
	                    confirmDelete.click();
	                    break;
	                }
	            }
	            if(flag) {
	                WebElement nextButton = driver.findElement(By.linkText("Next"));
	                nextButton.click();
	            }
	        }
	    }
}
