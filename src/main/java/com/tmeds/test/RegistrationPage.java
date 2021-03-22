package com.tmeds.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\alami\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://t-meds.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(@title,'Registration')]")).click();
		Select list = new Select(driver.findElement(By.id("DISTRICT_NO")));
		list.selectByValue("59");
		
//		Select list1 = new Select(driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[2]/select")));
//		list1.selectByIndex(1);
		driver.findElement(By.id("ADDRESS")).sendKeys("Medical Chottor, Rangpur");
		driver.findElement(By.id("CUSTOMER_NAME")).sendKeys("Al-Amin Khalid");
		driver.findElement(By.id("CUSTOMER_EMAIL")).sendKeys("alaminkhalid820@gmail.com");
		driver.findElement(By.id("CUSTOMER_MOBILE")).sendKeys("01719994977");
		driver.findElement(By.id("CUSTOMER_PASSWORD")).sendKeys("123456");
		driver.findElement(By.id("register")).click();
	    
	    
	}}
