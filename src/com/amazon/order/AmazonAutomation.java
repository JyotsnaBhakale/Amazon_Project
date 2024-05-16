package com.amazon.order;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.amazon.pages.SignOut;
import com.amazon.pages.SigninPage;
import com.amazon.pages.Welcome;

public class AmazonAutomation {
	 
	public static void main(String[] args) throws IOException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		// Create the object for welcome class and call the methods
		Welcome w = new Welcome(driver);
		w.clickOnSigninButton();
		
		//Establishing the connection from property file to Java file
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\AmazonProject\\src\\com\\amazon\\pages\\amazon.properties");
		
		// Creation of Properties object to load the data
		Properties p = new Properties();
		p.load(fis);
		
		// Fetching the data from a Property File
		String phone_data = p.getProperty("phone_number");
		String password_data = p.getProperty("password");
	
		// SignIn - SigninPage
		SigninPage signin = new SigninPage(driver);
		signin.typePhoneNumber(phone_data);
		signin.clickOnContinue();
		signin.typePassword(password_data);
		signin.clickOnSignin();
		/*
		// Home - search item - SanDisk Cruzer Blade 32GB USB Flash Drive
		Home h = new Home(driver);
		h.searchItem("pendrive");
		h.clickOnSearch();
		h.clickOnPendrive();
		
		// to point driver to second tab
		Set<String>p_c_address = driver.getWindowHandles();	
		ArrayList<String>  a = new ArrayList<String>( p_c_address); 	
		driver.switchTo().window(a.get(1));
		
		// ItemPage - add to cart and checkout
		ItemPage item = new ItemPage(driver);
		item.addToCart();
		item.checkOut();
		
		//PaymentPage
		PaymentPage pp = new PaymentPage(driver);
		pp.address();
		pp.cashOnDelivery();
		pp.paymentMethodClick();
		pp.placeOrderClick();
		
		// refresh the page
		driver.navigate().back();
		driver.navigate().refresh();
		
		// cancel order
		
		CancelOrder co = new CancelOrder(driver);
		co.navBar();
		co.clickOnCancel();
		co.cancelSelectedItem(); 
		co.submitButton();
		*/
		// signout
		SignOut so = new SignOut(driver);
		WebElement signout = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions action = new Actions(driver);
		action.moveToElement(signout).build().perform();
		so.signoutButton();
	}
}
