package com.domain.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.domain.base.BasePageObject;

public class AuctionResultsSubPage extends BasePageObject<AuctionResultsSubPage> {
	private By AuctionResultsPageText = By.xpath("//h1[@class='sales-results-landing-header__heading']");

	protected AuctionResultsSubPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void waitForAuctionResultsPageToLoad() {
		System.out.println("Waiting for AuctionResults Page to Load");
		waitForVisibilityOf(AuctionResultsPageText, 10);

	}
}
