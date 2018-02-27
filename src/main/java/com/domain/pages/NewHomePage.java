package com.domain.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.domain.base.BasePageObject;

public class NewHomePage extends BasePageObject<NewHomePage> {
	private By landMenu = By.xpath("//h4[@id='menu-new-land']");

	protected NewHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void waitForNewHomePageToLoad() {
		System.out.println("Waiting for New Home Page to Load");
		waitForVisibilityOf(landMenu, 10);

	}

}