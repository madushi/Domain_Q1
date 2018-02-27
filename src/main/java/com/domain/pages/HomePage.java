package com.domain.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.domain.base.BasePageObject;

public class HomePage extends BasePageObject<HomePage> {
	private static final String url = "https://www.domain.com.au";

	private By tabBuy = By.xpath("//a[@href = 'https://www.domain.com.au/']");
	private By tabRent = By.xpath("//a[@href = 'https://www.domain.com.au/?mode=rent']");
	private By tabNewHome = By.xpath("//a[@href = 'https://www.domain.com.au/new-homes']");
	private By tabSold = By.xpath("//a[@href = 'https://www.domain.com.au/?mode=sold']");
	private By tabCommercial = By.xpath("//a[@href = 'https://www.commercialrealestate.com.au/']");
	private By tabSell = By.xpath("//a[@href = 'https://sell.domain.com.au/?hp=1']");
	private By tabNews = By.xpath("//a[contains(text(), 'News')]");
	private By subTabNews = By.xpath("//a[@href = 'https://www.domain.com.au/news/']");
	private By subTabAdvice = By.xpath("//a[@href = 'https://www.domain.com.au/advice/']");
	private By subTabLiving = By.xpath("//a[@href = 'https://www.domain.com.au/living/']");
	private By subTabMoneyMarkets = By.xpath("//a[@href = 'https://www.domain.com.au/money-markets/']");
	private By subTabVideo = By.xpath("//a[@href = 'http://media.domain.com.au/property/domain']");
	private By tabAgents = By.xpath("//a[@href = 'https://www.domain.com.au/real-estate-agents/']");
	private By tabMore = By.xpath("//a[contains(text(), 'More')]");
	private By subTabShare = By.xpath("//a[@href = 'https://www.domain.com.au/home?mode=share']");
	private By subTabHomePrice = By.xpath("//a[@href = 'https://www.domain.com.au/property-profile']");
	private By subTabAuctionResults = By.xpath("//a[@href = 'https://www.domain.com.au/auction-results/']");
	private By subTabSuburbProfiles = By.xpath("//a[@href = 'https://www.domain.com.au/suburb-profile/']");
	private By subTabHomeLoans = By.xpath("//a[@href = 'https://www.domain.com.au/loanfinder']");
	private By subTabInsurance = By.xpath("//a[@href = 'https://www.domaininsure.com.au']");
	private By subTabPlaceAnAd = By.xpath("//a[@href = 'https://advertisers.com.au/domain']");

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void openHomePage() {
		getPage(url);
	}

	public BuyPage clickonBuyTab() {
		System.out.println("Clicking on Buy Link");
		click(tabBuy);
		return new BuyPage(driver);
	}

	public RentPage clickonRentTab() {
		System.out.println("Clicking on Rent Link");
		click(tabRent);
		return new RentPage(driver);
	}

	public NewHomePage clickonNewHomeTab() {
		System.out.println("Clicking on New Home Link");
		click(tabNewHome);
		return new NewHomePage(driver);
	}

	public SoldPage clickonSoldTab() {
		System.out.println("Clicking on Sold Link");
		click(tabSold);
		return new SoldPage(driver);
	}

	public CommercialPage clickonCommercialTab() {
		System.out.println("Clicking on Commercial Link");
		click(tabCommercial);
		return new CommercialPage(driver);
	}

	public SellPage clickonSellTab() {
		System.out.println("Clicking on Sell Link");
		click(tabSell);
		return new SellPage(driver);
	}

	public NewsSubPage clickonNewsTab() {
		System.out.println("Clicking on News Link");
		click(tabNews);
		click(subTabNews);
		return new NewsSubPage(driver);
	}

	public AdviceSubPage clickonAdviceTab() {
		System.out.println("Clicking on Advice Link");
		click(tabNews);
		click(subTabAdvice);
		return new AdviceSubPage(driver);
	}

	public LivingSubPage clickonLivingTab() {
		System.out.println("Clicking on Living Link");
		click(tabNews);
		click(subTabLiving);
		return new LivingSubPage(driver);
	}

	public MoneyMarketsSubPage clickonMoneyMarketsTab() {
		System.out.println("Clicking on MoneyMarkets Link");
		click(tabNews);
		click(subTabMoneyMarkets);
		return new MoneyMarketsSubPage(driver);
	}

	public VideoSubPage clickonVideoTab() {
		System.out.println("Clicking on Video Link");
		click(tabNews);
		click(subTabVideo);
		return new VideoSubPage(driver);
	}

	public AgentsPage clickonAgentsTab() {
		System.out.println("Clicking on Agents Link");
		click(tabAgents);
		return new AgentsPage(driver);
	}

	public ShareSubPage clickonShareTab() {
		System.out.println("Clicking on Share Link");
		click(tabMore);
		click(subTabShare);
		return new ShareSubPage(driver);
	}

	public HomePriceSubPage clickonHomePriceTab() {
		System.out.println("Clicking on Home Price Link");
		click(tabMore);
		click(subTabHomePrice);
		return new HomePriceSubPage(driver);
	}

	public AuctionResultsSubPage clickonAuctionResultsTab() {
		System.out.println("Clicking on Auction Results Link");
		click(tabMore);
		click(subTabAuctionResults);
		return new AuctionResultsSubPage(driver);

	}

	public SuburbProfilesSubPage clickonSuburbProfilesTab() {
		System.out.println("Clicking on Suburb Profiles Link");
		click(tabMore);
		click(subTabSuburbProfiles);
		return new SuburbProfilesSubPage(driver);

	}

	public HomeLoansSubPage clickonHomeLoansTab() {
		System.out.println("Clicking on Home Loans Link");
		click(tabMore);
		click(subTabHomeLoans);
		return new HomeLoansSubPage(driver);

	}

	public InsuranceSubPage clickonInsuranceTab() {
		System.out.println("Clicking on Insurance Link");
		click(tabMore);
		click(subTabInsurance);
		return new InsuranceSubPage(driver);

	}

	public PlaceAnAdSubPage clickonPlaceAnAdTab() {
		System.out.println("Clicking on Place An Ad Link");
		click(tabMore);
		click(subTabPlaceAnAd);
		return new PlaceAnAdSubPage(driver);

	}
}