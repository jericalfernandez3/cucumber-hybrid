package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Product_Page {
	
	public WebDriver driver;
	
	//1. By Locators
	private By inventory_container_ID = By.id("inventory_container");
		
	//2. Constructor of the page class
	public Product_Page(WebDriver driver) {
		this.driver = driver;
	}
		
	//3. Page methods (features)
	public boolean is_inventory_container_exist() throws InterruptedException {
		Thread.sleep(1000);
		return driver.findElement(inventory_container_ID).isDisplayed();
	}

}
