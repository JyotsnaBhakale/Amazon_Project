package com.amazon.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemPage {
	
	WebDriver driver;
	By add_to_cart = By.xpath("//input[@id='add-to-cart-button']");
	By checkout = By.xpath("//input[@aria-labelledby='attach-sidesheet-checkout-button-announce']");
	public ItemPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	// To add to cart
	public void addToCart()
	{
		driver.findElement(add_to_cart).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void checkOut()
	{
		driver.findElement(checkout).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
}
