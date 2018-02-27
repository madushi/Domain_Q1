package com.domain.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.domain.base.BasePageObject;

public class VideoSubPage extends BasePageObject<VideoSubPage> {
	private By searchButton = By.xpath("//input[@value='Search']");

	protected VideoSubPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void waitForVideoPageToLoad() {
		System.out.println("Waiting for Video Page to Load");
		waitForVisibilityOf(searchButton, 10);

	}
}
