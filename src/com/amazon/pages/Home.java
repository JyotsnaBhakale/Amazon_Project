package com.amazon.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
	
	WebDriver driver;
	By search_item = By.xpath("//input[@id='twotabsearchtextbox']");
	By search_button = By.xpath("//input[@id='nav-search-submit-button']");
	By pendrive = By.xpath("//span[text()='SanDisk Cruzer Blade 32GB USB Flash Drive']");
	
	public Home(WebDriver driver)
	{
		this.driver = driver;
	}
	
	// to search an item	//input[@id='twotabsearchtextbox']			
	public void searchItem(String product)
	{
		driver.findElement(search_item).sendKeys(product);
	}
	public void clickOnSearch()
	{
		driver.findElement(search_button).click();
	}
	// select an suggested item for pendrive - SanDisk Cruzer Blade 32GB USB Flash Drive
	public void clickOnPendrive()
	{
		driver.findElement(pendrive).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
