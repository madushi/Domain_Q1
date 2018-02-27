package com.domain.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.domain.base.BasePageObject;

public class SoldPage extends BasePageObject<SoldPage> {
	private By soldButtonSelected = By.xpath("//button[@class='search-box-a__search-mode-nav-button is-selected']");

	protected SoldPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void waitForSoldPageToLoad() {
		System.out.println("Waiting for Sold Page to Load");
		waitForVisibilityOf(soldButtonSelected, 10);

	}

}
