package com.domain.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.domain.base.BasePageObject;

public class AgentsPage extends BasePageObject<AgentsPage> {
	private By agentsPageText = By.xpath("//h2[@class='find-an-agent__content-subtitle']");

	protected AgentsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void waitForAgentsPageToLoad() {
		System.out.println("Waiting for Agents Page to Load");
		waitForVisibilityOf(agentsPageText, 10);

	}

}