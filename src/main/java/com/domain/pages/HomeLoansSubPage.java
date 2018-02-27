package com.domain.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.domain.base.BasePageObject;

public class HomeLoansSubPage extends BasePageObject<HomeLoansSubPage> {
	private By buyButton = By.xpath("//button[@class='btn btn-primary wIHIv47WCGSeJTv6nD9iw']");

	protected HomeLoansSubPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void waitForHomeLoansPageToLoad() {
		System.out.println("Waiting for HomeLoans Page to Load");
		waitForVisibilityOf(buyButton, 10);

	}
}
