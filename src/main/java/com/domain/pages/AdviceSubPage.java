package com.domain.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.domain.base.BasePageObject;

public class AdviceSubPage extends BasePageObject<AdviceSubPage> {
	private By advicePageText = By.xpath("//h1[@class='advice-category-title']");

	protected AdviceSubPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void waitForAdvicePageToLoad() {
		System.out.println("Waiting for Advice Page to Load");
		waitForVisibilityOf(advicePageText, 10);

	}

}
