package com.tmeds.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MedicinePurchase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\alami\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://t-meds.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),' User Login')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'mobile')]")).sendKeys("01719994977");
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("123456");
		driver.findElement(By.xpath("//input[contains(@name,'submit')]")).click();
		driver.findElement(By.linkText("Medicine")).click();
//		JavascriptExecutor jf = (JavascriptExecutor) driver;
//		jf.executeScript("window.scrollBy(0,500)");
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("/html/body/main/div/div/div[3]/div[2]/div/div[2]/div/div/div/div[6]/a/picture/img"))).build().perform();
//		driver.findElement(By.xpath("/html/body/main/div/div/div[3]/div[2]/div/div[2]/div/div/div/div[6]/div/div[1]/div/button[1]/span[1]")).click();
//		
//		JavascriptExecutor jf1 = (JavascriptExecutor) driver;
//		jf1.executeScript("window.scrollBy(0,-500)");
		driver.findElement(By.id("topcartlink")).click();
		driver.findElement(By.xpath("/html/body/aside[3]/div/div[2]/div/div/div[2]/div[2]/input")).click();
		
	
        driver.findElement(By.id("Cash")).click();
		driver.findElement(By.xpath("/html/body/main/div/div/div/div/form/div[4]/div/div[2]/div[3]/label/span[3]")).click();

	}
	

}
