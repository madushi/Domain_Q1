package com.domain.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.domain.base.BasePageObject;

public class CommercialPage extends BasePageObject<CommercialPage> {
	private By logInTab = By.xpath("//a[@id='login']");

	protected CommercialPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void waitForCommercialPageToLoad() {
		System.out.println("Waiting for Commercial Page to Load");
		waitForVisibilityOf(logInTab, 10);

	}

}
