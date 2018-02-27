package com.domain.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.domain.base.BasePageObject;

public class InsuranceSubPage extends BasePageObject<InsuranceSubPage> {
	private By getQuoteLink = By.xpath("//a[@href='https://quote.domaininsure.com.au/home']");

	protected InsuranceSubPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void waitForInsurancePageToLoad() {
		System.out.println("Waiting for Insurance Page to Load");
		waitForVisibilityOf(getQuoteLink, 10);

	}
}
