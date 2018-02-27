package com.domain.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.domain.base.BasePageObject;

public class MoneyMarketsSubPage extends BasePageObject<MoneyMarketsSubPage> {
	private By MoneyMarketsPageText = By.xpath("//h1[@class='index-hero-title']");

	protected MoneyMarketsSubPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void waitForMoneyMarketsPageToLoad() {
		System.out.println("Waiting for MoneyMarkets Page to Load");
		waitForVisibilityOf(MoneyMarketsPageText, 10);

	}

}
