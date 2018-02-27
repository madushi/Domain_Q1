package com.domain.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.domain.base.BasePageObject;

public class NewsSubPage extends BasePageObject<NewsSubPage> {
	private By newsSubTitle = By.xpath("//h2[@class='tile-domain-news__subtitle']");

	protected NewsSubPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void waitForNewsPageToLoad() {
		System.out.println("Waiting for News Page to Load");
		waitForVisibilityOf(newsSubTitle, 10);

	}

}
