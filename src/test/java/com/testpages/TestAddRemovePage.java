package com.testpages;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.baseclass.Baseclass;
import com.pages.AddRemovePage;
import com.pages.Homepage;

public class TestAddRemovePage extends Baseclass{

	Homepage hp = null;
	AddRemovePage arp = null;
	
	
	@BeforeMethod
	public void setUp() {
		
		initialization();
		reportInit();
		hp = new Homepage(driver);
		arp = new AddRemovePage(driver);
	}
	
	
	@Test
	public void addingElement() {
		hp.addRemove();
		arp.clickAddElement();
	}
	
}
