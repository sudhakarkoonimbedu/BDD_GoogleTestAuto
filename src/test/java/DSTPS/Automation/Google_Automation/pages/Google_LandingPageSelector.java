package DSTPS.Automation.Google_Automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DSTPS.Automation.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.Apps.common.RxNova_Utlilty;


public class Google_LandingPageSelector {

	private By SEARCH_SEARCHFIELD,SEARCH_LOGO,SEARCH_BUTTON,SEARCH_RESULTS;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public Google_LandingPageSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		Drug_LandingPage_Objects();
	}
	
	private void Drug_LandingPage_Objects() {
		
		SEARCH_SEARCHFIELD = By.name("q");
		//SEARCH_LOGO = By.id("hplogo");
		SEARCH_BUTTON = By.xpath("(//*[@name='btnK'])[1]");
		SEARCH_RESULTS = By.xpath("//*[@id='resultStats']");
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public String googlePage() throws Throwable {
		
       return driver.getTitle();
	}
	
	public void enterSearchValue(String strSearchValue) throws Throwable {
		
		utils.SetTextOnEdit(SEARCH_SEARCHFIELD, strSearchValue);
		//utils.GetBusyStatus();
		Thread.sleep(2000);
		//utils.ClickOnImage(SEARCH_LOGO);
	}
	
	public void clickOnSearchButton() throws Throwable {
		
		utils.ClickOnButton(SEARCH_BUTTON);
	}
	
	public void waitUntilSearchResults() throws Throwable {
		
		utils.CheckElementPresenceByLocator(SEARCH_RESULTS);
		Thread.sleep(2000);
	}
	
	public void verifySearchResults() throws Throwable {
		
		utils.VerifyObjectIsDisplayed(SEARCH_RESULTS);
	}
	
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
}