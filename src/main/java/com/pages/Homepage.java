package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	
	@FindBy(xpath="//a[text()='Add/Remove Elements']")
	WebElement addRmove;
	
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void addRemove() {
		addRmove.click();
		
	}
	
}
