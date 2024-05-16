package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignOut {
	
	WebDriver driver;
	By signout_button = By.xpath("//span[text()='Sign Out']");
	
	public SignOut(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void signoutButton()
	{
		driver.findElement(signout_button).click();
	}
	
}
