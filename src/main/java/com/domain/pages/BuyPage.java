package com.domain.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.domain.base.BasePageObject;

public class BuyPage extends BasePageObject<BuyPage> {
	private By buyButtonSelected = By.xpath("//button[@class='search-box-a__search-mode-nav-button is-selected']");

	protected BuyPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void waitForBuyPageToLoad() {
		System.out.println("Waiting for Buy Page to Load");
		waitForVisibilityOf(buyButtonSelected, 10);

	}

}
