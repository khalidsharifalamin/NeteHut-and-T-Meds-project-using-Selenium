package com.tmeds.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductPurchase {
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
		driver.findElement(By.id("topcartlink")).click();
		driver.findElement(By.xpath("/html/body/aside[3]/div/div[2]/div/div/div[2]/div[2]/input")).click();
		
		
}}
