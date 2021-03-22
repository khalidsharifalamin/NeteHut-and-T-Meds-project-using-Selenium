package com.netehut.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPage {
	
	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * Registration page
		 */
		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\alami\\Desktop\\selenium\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://netehat.net/users/registration");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[contains(@name,'name')]")).sendKeys("Al-Amin Khaid");
//		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("alaminkhalid820@gmail.com");
//		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("123456");
//		driver.findElement(By.xpath("//input[contains(@name,'password_confirmation')]")).sendKeys("123456");
//		driver.findElement(By.xpath("//input[contains(@name,'checkbox_example_1')]")).click();
//		driver.findElement(By.xpath("//button[contains(text(),'Create Account')]")).click();
		
		/*
		 * Add Address 
		 */
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\alami\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netehat.net/users/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("alaminkhalid820@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("123456");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'My Panel')]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div/div[1]/div/div/div[3]/ul/li[6]/a")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Your Name')]")).clear();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Your Name')]")).sendKeys("alamin");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Your Phone')]")).sendKeys("+8801719994977");
		WebElement browse = driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div/div[2]/div/form[1]/div[1]/div[2]/div[3]/div[2]/label/strong/i"));
		Thread.sleep(1000);
		browse.sendKeys("C:\\Users\\alami\\Desktop\\learning\\download.jpg");
		//Your Phone
		//		JavascriptExecutor jf = (JavascriptExecutor) driver;		
//		jf.executeScript("window.scrollBy(0,300)");
		
		//driver.findElement(By.xpath("//div[contains(@class,'border p-3 rounded mb-3 c-pointer text-center bg-light')]")).click();
		//driver.findElement(By.name("address")).sendKeys("Mirpur,Dhaka");
		//driver.findElement(By.xpath("//textarea[starts-with(@class ,'form-control textarea-autogrow mb-3')]")).sendKeys("House #11, Road #01, Kallyanpur, Dhaka");
//		driver.findElement(By.xpath("//input[contains(@name,'city')]")).sendKeys("Dhaka");
//		driver.findElement(By.xpath("//input[contains(@name,'postal_code')]")).sendKeys("1202");
//		driver.findElement(By.xpath("//input[contains(@placeholder,'Your phone number')]")).sendKeys("01719994977");
//		
//		
	}

}
