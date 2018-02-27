package com.domain.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.domain.base.BasePageObject;

public class PlaceAnAdSubPage extends BasePageObject<PlaceAnAdSubPage> {
	private By loginButton = By.xpath("//a[@class='loginTrigger']");

	protected PlaceAnAdSubPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void waitForPlaceAnAdPageToLoad() {
		System.out.println("Waiting for PlaceAnAd Page to Load");
		waitForVisibilityOf(loginButton, 10);

	}
}
