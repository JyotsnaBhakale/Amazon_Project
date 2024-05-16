package com.amazon.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninPage {
	WebDriver driver;
	By phone_number = By.xpath("//input[@name=\"email\"]");
	By continue_button = By.xpath("//input[@id='continue']");
	By password = By.xpath("//input[@id='ap_password']");
	By signin_button = By.xpath("//input[@id='signInSubmit']");
	
	public SigninPage(WebDriver driver)
	{
		this.driver = driver;
	}	
	
	// phone number
	public void typePhoneNumber(String ph)
	{
		driver.findElement(phone_number).sendKeys(ph);
	}
	// continue
	public void clickOnContinue()
	{
		driver.findElement(continue_button).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	// password
	public void typePassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickOnSignin()
	{
		driver.findElement(signin_button).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
