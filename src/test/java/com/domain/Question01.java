package com.domain;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.domain.base.BaseTest;
import com.domain.pages.AdviceSubPage;
import com.domain.pages.AgentsPage;
import com.domain.pages.AuctionResultsSubPage;
import com.domain.pages.BuyPage;
import com.domain.pages.CommercialPage;
import com.domain.pages.HomeLoansSubPage;
import com.domain.pages.HomePage;
import com.domain.pages.HomePriceSubPage;
import com.domain.pages.InsuranceSubPage;
import com.domain.pages.LivingSubPage;
import com.domain.pages.MoneyMarketsSubPage;
import com.domain.pages.NewHomePage;
import com.domain.pages.NewsSubPage;
import com.domain.pages.PlaceAnAdSubPage;
import com.domain.pages.RentPage;
import com.domain.pages.SellPage;
import com.domain.pages.ShareSubPage;
import com.domain.pages.SoldPage;
import com.domain.pages.SuburbProfilesSubPage;
import com.domain.pages.VideoSubPage;

public class Question01 extends BaseTest {

	@Test
	public void question01() {
		HomePage homePage = new HomePage(driver);

		String expectedBuyPageTitle = "Real Estate | Properties for Sale, Rent and Share | Domain";
		String expectedRentPageTitle = "Rent Houses, Apartments, Units, Flats and New Developments | Real Estate | Domain";
		String expectedNewHomePageTitle = "New Homes | Home & Land Packages | Off the Plan Apartments";
		String expectedSoldPageTitle = "Sold Houses, Apartments, Units, Flats and New Developments | Real Estate | Domain";
		String expectedCommercialPageTitle = "Commercial Real Estate and Property For Sale and Lease in Australia | CommercialRealEstate.com.au";
		String expectedSellPageTitle = "Sell | Property profiles, Price Estimates, Nearby Activity, Agent comparisons and Fee Quotes | Real Estate | Domain";
		String expectedNewsPageTitle = "Real Estate and Property Market News";
		String expectedAdvicePageTitle = "Buying & Selling Property: Real Estate Tips, Guides & Advice";
		String expectedLivingPageTitle = "Domain Living: Home Trends & Inspiration";
		String expectedMoneyMarketsPageTitle = "Business and Finance News and Analysis";
		String expectedVideoPageTitle = "Terminus Hotel is back from beyond the grave";
		String expectedAgentsPageTitle = "Search for real estate agents to sell your property in Australia";
		String expectedSharePageTitle = "Share Houses, Apartments, Units, Flats and New Developments | Real Estate | Domain";
		String expectedHomePricePageTitle = "Get a free property report with price estimate and history";
		String expectedAuctionResultsPageTitle = "Real Estate Auction Results for Saturday 24th February 2018";
		String expectedSuburbProfilesPageTitle = "Real Estate Suburb Profiles & Demographics";
		String expectedHomeLoansPageTitle = "Domain Loan Finder";
		String expectedInsurancePageTitle = "Domain Insure";
		String expectedPlaceAnAdPageTitle = "Place an Ad - Advertise with Domain - Home";

		// open Domain Home Page
		homePage.openHomePage();

		// open Domain Rent Page
		// Click on Buy button and wait for page to load
		BuyPage buyPage = homePage.clickonBuyTab();
		buyPage.waitForBuyPageToLoad();

		// verifications -verify the Title of the buy page
		System.out.println("Verifications");
		String actualBuyPageTitle = buyPage.getTitle();
		Assert.assertTrue(expectedBuyPageTitle.equals(actualBuyPageTitle),
				"Page Title is not expected.\nExpected:" + expectedBuyPageTitle + "\nActual:" + actualBuyPageTitle);
		driver.navigate().back();

		// Open Domain Rent Page
		// click on Rent button and wait for page to load
		RentPage rentPage = homePage.clickonRentTab();
		rentPage.waitForRentPageToLoad();

		// verifications -verify the Title of the rent page
		System.out.println("Verifications");
		String actualRentPageTitle = rentPage.getTitle();
		Assert.assertTrue(expectedRentPageTitle.equals(actualRentPageTitle),
				"Page Title is not expected.\nExpected:" + expectedRentPageTitle + "\nActual:" + actualRentPageTitle);
		driver.navigate().back();

		// Open Domain New Home Page
		// click on New Home button and wait for page to load
		NewHomePage newHomePage = homePage.clickonNewHomeTab();
		newHomePage.waitForNewHomePageToLoad();

		// verifications -verify the Title of the new home page
		System.out.println("Verifications");
		String actualNewHomePageTitle = newHomePage.getTitle();
		Assert.assertTrue(expectedNewHomePageTitle.equals(actualNewHomePageTitle),
				"Page Title is not expected.\nExpected:" + expectedNewHomePageTitle + "\nActual:"
						+ actualNewHomePageTitle);
		driver.navigate().back();

		// Open Domain Sold Page
		// click on Sold button and wait for page to load
		SoldPage soldPage = homePage.clickonSoldTab();
		soldPage.waitForSoldPageToLoad();

		// verifications -verify the Title of the sold page
		System.out.println("Verifications");
		String actualSoldPageTitle = soldPage.getTitle();
		Assert.assertTrue(expectedSoldPageTitle.equals(actualSoldPageTitle),
				"Page Title is not expected.\nExpected:" + expectedSoldPageTitle + "\nActual:" + actualSoldPageTitle);
		driver.navigate().back();

		// Open Commercial Page
		// click on Commercial button and wait for page to load

		CommercialPage commercialPage = homePage.clickonCommercialTab();
		commercialPage.waitForCommercialPageToLoad();

		// verifications -verify the Title of the commercial page
		System.out.println("Verifications");
		String actualCommercialPageTitle = commercialPage.getTitle();
		Assert.assertTrue(expectedCommercialPageTitle.equals(actualCommercialPageTitle),
				"Page Title is not expected.\nExpected:" + expectedCommercialPageTitle + "\nActual:"
						+ actualCommercialPageTitle);
		driver.navigate().back();

		// Open Sell Page
		// click on Sell button and wait for page to load
		SellPage sellPage = homePage.clickonSellTab();
		sellPage.waitForSellPageToLoad();

		// verifications -verify the Title of the sell page
		System.out.println("Verifications");
		String actualSellPageTitle = sellPage.getTitle();
		Assert.assertTrue(expectedSellPageTitle.equals(actualSellPageTitle),
				"Page Title is not expected.\nExpected:" + expectedSellPageTitle + "\nActual:" + actualSellPageTitle);
		driver.navigate().back();

		// Open News Page
		// click on News button and wait for page to load
		NewsSubPage newsPage = homePage.clickonNewsTab();
		newsPage.waitForNewsPageToLoad();

		// verifications -verify the Title of the news page
		System.out.println("Verifications");
		String actualNewsPageTitle = newsPage.getTitle();
		Assert.assertTrue(expectedNewsPageTitle.equals(actualNewsPageTitle),
				"Page Title is not expected.\nExpected:" + expectedNewsPageTitle + "\nActual:" + actualNewsPageTitle);
		driver.navigate().back();

		// Open Advice Page
		// click on Advice button and wait for page to load
		AdviceSubPage advicePage = homePage.clickonAdviceTab();
		advicePage.waitForAdvicePageToLoad();

		// verifications -verify the Title of the advice page
		System.out.println("Verifications");
		String actualAdvicePageTitle = advicePage.getTitle();
		Assert.assertTrue(expectedAdvicePageTitle.equals(actualAdvicePageTitle),
				"Page Title is not expected.\nExpected:" + expectedAdvicePageTitle + "\nActual:"
						+ actualAdvicePageTitle);
		driver.navigate().back();

		// Open Living Page
		// click on Living button and wait for page to load
		LivingSubPage livingPage = homePage.clickonLivingTab();
		livingPage.waitForLivingPageToLoad();

		// verifications -verify the Title of the living page
		System.out.println("Verifications");
		String actualLivingPageTitle = livingPage.getTitle();
		Assert.assertTrue(expectedLivingPageTitle.equals(actualLivingPageTitle),
				"Page Title is not expected.\nExpected:" + expectedLivingPageTitle + "\nActual:"
						+ actualLivingPageTitle);
		driver.navigate().back();

		// Open MoneyMarkets Page
		// click on MoneyMarkets button and wait for page to load
		MoneyMarketsSubPage moneyMarketsPage = homePage.clickonMoneyMarketsTab();
		moneyMarketsPage.waitForMoneyMarketsPageToLoad();

		// verifications -verify the Title of the moneymarkets page
		System.out.println("Verifications");
		String actualMoneyMarketsPageTitle = moneyMarketsPage.getTitle();
		Assert.assertTrue(expectedMoneyMarketsPageTitle.equals(actualMoneyMarketsPageTitle),
				"Page Title is not expected.\nExpected:" + expectedMoneyMarketsPageTitle + "\nActual:"
						+ actualMoneyMarketsPageTitle);
		driver.navigate().back();

		// Open Video Page
		// click on Video button and wait for page to load
		VideoSubPage videoPage = homePage.clickonVideoTab();
		videoPage.waitForVideoPageToLoad();

		// verifications -verify the Title of the video page
		System.out.println("Verifications");
		String actualVideoPageTitle = videoPage.getTitle();
		Assert.assertTrue(expectedVideoPageTitle.equals(actualVideoPageTitle),
				"Page Title is not expected.\nExpected:" + expectedVideoPageTitle + "\nActual:" + actualVideoPageTitle);
		driver.navigate().back();

		// Open Agents Page
		// click on Agents button and wait for page to load
		AgentsPage agentsPage = homePage.clickonAgentsTab();
		agentsPage.waitForAgentsPageToLoad();

		// verifications -verify the Title of the agents page
		System.out.println("Verifications");
		String actualAgentsPageTitle = agentsPage.getTitle();
		Assert.assertTrue(expectedAgentsPageTitle.equals(actualAgentsPageTitle),
				"Page Title is not expected.\nExpected:" + expectedAgentsPageTitle + "\nActual:"
						+ actualAgentsPageTitle);
		driver.navigate().back();

		// Open Share Page
		// click on Share button and wait for page to load
		ShareSubPage sharePage = homePage.clickonShareTab();
		sharePage.waitForSharePageToLoad();

		// verifications -verify the Title of the share page
		System.out.println("Verifications");
		String actualSharePageTitle = sharePage.getTitle();
		Assert.assertTrue(expectedSharePageTitle.equals(actualSharePageTitle),
				"Page Title is not expected.\nExpected:" + expectedSharePageTitle + "\nActual:" + actualSharePageTitle);
		driver.navigate().back();

		// Open Home Price Guide Page
		// click on Home Price Guide button and wait for page to load
		HomePriceSubPage homePricePage = homePage.clickonHomePriceTab();
		homePricePage.waitForHomePricePageToLoad();

		// verifications -verify the Title of the home price page
		System.out.println("Verifications");
		String actualHomePricePageTitle = homePricePage.getTitle();
		Assert.assertTrue(expectedHomePricePageTitle.equals(actualHomePricePageTitle),
				"Page Title is not expected.\nExpected:" + expectedHomePricePageTitle + "\nActual:"
						+ actualHomePricePageTitle);
		driver.navigate().back();

		// Open Auction Results Page
		// click on Auction Results button and wait for page to load
		AuctionResultsSubPage auctionResultsPage = homePage.clickonAuctionResultsTab();
		auctionResultsPage.waitForAuctionResultsPageToLoad();

		// verifications -verify the Title of the auctions page
		System.out.println("Verifications");
		String actualAuctionResultsPageTitle = auctionResultsPage.getTitle();
		Assert.assertTrue(expectedAuctionResultsPageTitle.equals(actualAuctionResultsPageTitle),
				"Page Title is not expected.\nExpected:" + expectedAuctionResultsPageTitle + "\nActual:"
						+ actualAuctionResultsPageTitle);
		driver.navigate().back();

		// Open Suburb Profiles Page
		// click on Suburb Profiles button and wait for page to load
		SuburbProfilesSubPage suburbProfilesPage = homePage.clickonSuburbProfilesTab();
		suburbProfilesPage.waitForSuburbProfilesPageToLoad();

		// verifications -verify the Title of the suburb profile page
		System.out.println("Verifications");
		String actualSuburbProfilesPageTitle = suburbProfilesPage.getTitle();
		Assert.assertTrue(expectedSuburbProfilesPageTitle.equals(actualSuburbProfilesPageTitle),
				"Page Title is not expected.\nExpected:" + expectedSuburbProfilesPageTitle + "\nActual:"
						+ actualSuburbProfilesPageTitle);
		driver.navigate().back();

		// Open Home Loans Page
		// click on Home Loans button and wait for page to load
		HomeLoansSubPage homeLoansPage = homePage.clickonHomeLoansTab();
		homeLoansPage.waitForHomeLoansPageToLoad();

		// verifications -verify the Title of the home loans page
		System.out.println("Verifications");
		String actualHomeLoansPageTitle = homeLoansPage.getTitle();
		Assert.assertTrue(expectedHomeLoansPageTitle.equals(actualHomeLoansPageTitle),
				"Page Title is not expected.\nExpected:" + expectedHomeLoansPageTitle + "\nActual:"
						+ actualHomeLoansPageTitle);
		driver.navigate().back();

		// Open Insurance Page
		// click on Insurance button and wait for page to load
		InsuranceSubPage insurancePage = homePage.clickonInsuranceTab();
		insurancePage.waitForInsurancePageToLoad();

		// verifications -verify the Title of the home loans page
		System.out.println("Verifications");
		String actualInsurancePageTitle = insurancePage.getTitle();
		Assert.assertTrue(expectedInsurancePageTitle.equals(actualInsurancePageTitle),
				"Page Title is not expected.\nExpected:" + expectedInsurancePageTitle + "\nActual:"
						+ actualInsurancePageTitle);
		driver.navigate().back();

		// Open Place An Ad Page
		// click on Place an Ad button and wait for page to load
		PlaceAnAdSubPage placeAnAdPage = homePage.clickonPlaceAnAdTab();
		placeAnAdPage.waitForPlaceAnAdPageToLoad();

		// verifications -verify the Title of the home loans page
		System.out.println("Verifications");
		String actualPlaceAnAdPageTitle = placeAnAdPage.getTitle();
		Assert.assertTrue(expectedPlaceAnAdPageTitle.equals(actualPlaceAnAdPageTitle),
				"Page Title is not expected.\nExpected:" + expectedPlaceAnAdPageTitle + "\nActual:"
						+ actualPlaceAnAdPageTitle);
		driver.navigate().back();

	}
}
