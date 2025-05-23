package com.testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.baseclass.Baseclass;
import com.pages.Homepage;

public class TestHomePage extends Baseclass{

	Homepage hp = null;
	
	
	@BeforeSuite
	public void setup() {
		initialization();
		reportInit();
		hp = new Homepage(driver);
	}
	
	@Test(enabled = false)
	public void checkAddRemoveElement() {
	hp.addRemove();
	}
	
	
	@Test
	public void test03() {
		hp.authentication();
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		
	}
	
}
