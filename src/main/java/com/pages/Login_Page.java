package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {
	
	private WebDriver driver;
	
	//1. By Locators
	private By username_ID = By.id("user-name");
	private By password_ID = By.id("password");
	private By login_button_ID = By.id("login-button");
	
	//2. Constructor of the page class
	public Login_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	//3. Page methods (features)
	public String getTitlePage() {
		return driver.getTitle();
	}
	
	public boolean is_username_field_exist() {
		return driver.findElement(username_ID).isDisplayed();
	}
	
	public boolean is_password_field_exist() {
		return driver.findElement(password_ID).isDisplayed();
	}
	
	public void enter_username(String username) {
		driver.findElement(username_ID).sendKeys(username);
	}
	
	public void enter_password(String password) {
		driver.findElement(password_ID).sendKeys(password);
	}
	
	public void click_login_button() {
		driver.findElement(login_button_ID).click();
	}
	
}
