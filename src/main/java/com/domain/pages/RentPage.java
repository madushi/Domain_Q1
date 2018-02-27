package com.domain.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.domain.base.BasePageObject;

public class RentPage extends BasePageObject<RentPage> {
	private By rentButtonSelected = By.xpath("//button[@class='search-box-a__search-mode-nav-button is-selected']");

	protected RentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void waitForRentPageToLoad() {
		System.out.println("Waiting for Rent Page to Load");
		waitForVisibilityOf(rentButtonSelected, 10);

	}

}
