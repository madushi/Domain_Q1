package com.domain.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.domain.base.BasePageObject;

public class SellPage extends BasePageObject<SellPage> {
	private By backgroundImage = By.xpath("//div[@class='sc-ifAKCX bQdwvf']");

	protected SellPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void waitForSellPageToLoad() {
		System.out.println("Waiting for Sell Page to Load");
		waitForVisibilityOf(backgroundImage, 10);

	}

}
