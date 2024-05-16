// Make all the locators as instance variables
// Create a method for each action

package com.amazon.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Welcome {
	
	WebDriver driver;
	By signin_button = By.xpath("//a[@id='nav-link-accountList']");
	
	public Welcome(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void clickOnSigninButton()
	{
		driver.findElement(signin_button).click();
		// delay to load all the web elements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
