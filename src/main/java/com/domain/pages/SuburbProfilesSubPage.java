package com.domain.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.domain.base.BasePageObject;

public class SuburbProfilesSubPage extends BasePageObject<SuburbProfilesSubPage> {
	private By SuburbProfilesPageText = By.xpath("//h1[@class='hoods-suburb-search-title']");

	protected SuburbProfilesSubPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void waitForSuburbProfilesPageToLoad() {
		System.out.println("Waiting for SuburbProfiles Page to Load");
		waitForVisibilityOf(SuburbProfilesPageText, 10);

	}
}
