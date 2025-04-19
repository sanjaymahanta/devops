package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Homepage {

	
	@FindBy(xpath="//a[text()='Add/Remove Elements']")
	WebElement addRmove;
	
	@FindBy(xpath ="//a[text()='Basic Auth']")
	WebElement basicAuth ;
	
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void addRemove() {
		addRmove.click();
		
	}
	
	@Test
	public void authentication() {
		basicAuth.click();
		
	}
	
	
}
