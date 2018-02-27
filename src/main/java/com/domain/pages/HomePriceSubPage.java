package com.domain.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.domain.base.BasePageObject;

public class HomePriceSubPage extends BasePageObject<HomePriceSubPage> {
	private By HomePricePageText = By.xpath("//h1[@class='blockd']");

	protected HomePriceSubPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void waitForHomePricePageToLoad() {
		System.out.println("Waiting for HomePrice Page to Load");
		waitForVisibilityOf(HomePricePageText, 10);

	}
}
