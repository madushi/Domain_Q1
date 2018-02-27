package com.domain.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.domain.base.BasePageObject;

public class LivingSubPage extends BasePageObject<LivingSubPage> {
	private By livingPageText = By.xpath("//h1[@class='advice-category-title']");

	protected LivingSubPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void waitForLivingPageToLoad() {
		System.out.println("Waiting for Living Page to Load");
		waitForVisibilityOf(livingPageText, 10);

	}

}
