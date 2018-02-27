package com.domain.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.domain.base.BasePageObject;

public class ShareSubPage extends BasePageObject<ShareSubPage> {
	private By SharePageText = By.xpath("//h1[@class='domain-home__headline-versionA']");

	protected ShareSubPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void waitForSharePageToLoad() {
		System.out.println("Waiting for Share Page to Load");
		waitForVisibilityOf(SharePageText, 10);

	}
}