package com.amazon.order;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DummyCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		// sign in button -- //a[@id='nav-link-accountList']
		driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		// delay to load all the web elements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// phone number - //input[@name="email"]
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("8792591419");
		// continue - //input[@id='continue']
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//password	//input[@id='ap_password']
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Judson@14@");
		// click on sign in button -- //input[@id='signInSubmit']
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement signout_button = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		//a[@id='nav-link-accountList']
		Actions a = new Actions(driver);
		a.moveToElement(signout_button).build().perform();
		driver.findElement(By.xpath("//span[text()='Sign Out']")).click();
		//span[text()='Sign Out']
		
		driver.findElement(By.xpath("//a[@id='nav-orders']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//a[@id="a-autoid-3-announce"]
		driver.findElement(By.xpath("//a[@id=\"a-autoid-3-announce\"]")).click();
		
	}

}
