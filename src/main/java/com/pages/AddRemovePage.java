package com.pages;



	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class AddRemovePage {

		
		@FindBy(xpath="//button[text()='Add Element']")
		WebElement addElement;
		
		
		public AddRemovePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		public void clickAddElement() {
			addElement.click();
		}
	}

