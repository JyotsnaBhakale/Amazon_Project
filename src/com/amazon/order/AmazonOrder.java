package com.amazon.order;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonOrder {
	public static void main(String[] args) throws InterruptedException
	{
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
		
		// to search an item	//input[@id='twotabsearchtextbox']
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("pendrive");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		//span[text()='SanDisk Cruzer Blade 32GB USB Flash Drive']
		driver.findElement(By.xpath("//span[text()='SanDisk Cruzer Blade 32GB USB Flash Drive']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Set<String>p_c_address = driver.getWindowHandles();	
		ArrayList<String>  a = new ArrayList<String>( p_c_address); 	
		driver.switchTo().window(a.get(1));

		//input[@id='add-to-cart-button']
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-checkout-button-announce']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// use this address
		driver.findElement(By.xpath("//span[@id='shipToThisAddressButton']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//cash on delivery  (//span[@class='a-color-base a-text-bold'])[2]
		driver.findElement(By.xpath("(//span[@class='a-color-base a-text-bold'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// click on use this method
		driver.findElement(By.xpath("(//input[@name='ppw-widgetEvent:SetPaymentPlanSelectContinueEvent'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//input[@aria-labelledby='bottomSubmitOrderButtonId-announce']  -- place your order
		driver.findElement(By.xpath("//input[@aria-labelledby='bottomSubmitOrderButtonId-announce']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.navigate().back();
		driver.navigate().refresh();
		
		//a[@id='nav-orders']
		driver.findElement(By.xpath("//a[@id='nav-orders']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//a[@id='a-autoid-3-announce']
		try {
		driver.findElement(By.xpath("(//a[@class ='a-link-normal yohtmlc-order-details-link'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			
		}
		//a[@id='Cancel-items_1']
		
		driver.findElement(By.xpath("//a[@id='Cancel-items_1']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@name='cq.submit']")).click();
		
		WebElement signout_button = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		//a[@id='nav-link-accountList']
		Actions action = new Actions(driver);
		action.moveToElement(signout_button).build().perform();
		driver.findElement(By.xpath("//span[text()='Sign Out']")).click();
		
		
	}
}
