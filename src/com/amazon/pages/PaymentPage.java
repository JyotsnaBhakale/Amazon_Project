package com.amazon.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {
	
	WebDriver driver;
	By address = By.xpath("//span[@id='shipToThisAddressButton']");
	By cashondelivery = By.xpath("(//span[@class='a-color-base a-text-bold'])[2]");
	By payment_click = By.xpath("(//input[@name='ppw-widgetEvent:SetPaymentPlanSelectContinueEvent'])[1]");
	By place_order = By.xpath("//input[@aria-labelledby='bottomSubmitOrderButtonId-announce']");
	
	public PaymentPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	// address
	public void address()
	{
		driver.findElement(address).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	// cash on delivery
	public void cashOnDelivery()
	{
		driver.findElement(cashondelivery).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void paymentMethodClick()
	{
		driver.findElement(payment_click).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	// place order button
	public void placeOrderClick()
	{
		driver.findElement(place_order).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
