package com.amazon.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CancelOrder {
	
	WebDriver driver;
	By navbar = By.xpath("//a[@id='nav-orders']");
	By cancel_item = By.xpath("(//a[@class ='a-link-normal yohtmlc-order-details-link'])[1]");
	By cancel_selected_item = By.xpath("//a[@id='Cancel-items_1']");
	By submit = By.xpath("//input[@name='cq.submit']");
	
	public CancelOrder(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void navBar()
	{
		driver.findElement(navbar).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void clickOnCancel()
	{
		try {
			driver.findElement(cancel_item).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			}
			catch(Exception e)
			{
				
			}
			finally
			{
				
			}
	}
	// cancel the selected item
	public void cancelSelectedItem()
	{
		driver.findElement(cancel_selected_item).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	// submit button
	
	public void  submitButton()
	{
		driver.findElement(submit).click();
	}
}
