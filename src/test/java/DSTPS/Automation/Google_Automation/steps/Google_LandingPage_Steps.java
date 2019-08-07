package DSTPS.Automation.Google_Automation.steps;

import java.util.Map;
import org.openqa.selenium.WebDriver;

import DSTPS.Automation.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.Apps.common.RxNova_Steps;
import DSTPS.Automation.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.Google_Automation.pages.Google_LandingPageSelector;
import junit.framework.Assert;

public class Google_LandingPage_Steps {

	
	RxNova_Steps rxnova_Steps;
	Google_LandingPageSelector google_LandingPageSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public Google_LandingPage_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable {
		
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		rxnova_Steps = new RxNova_Steps(SharedResource,utils);
		google_LandingPageSelector = new Google_LandingPageSelector(SharedResource,utils);
	}
	
	public void verifyGooglePage()throws Throwable {		
		Assert.assertEquals(google_LandingPageSelector.googlePage(),"Google");
	}
	
	public void performSearch(Map<String,String> searchDetails)throws Throwable {
		
		String strSearchValue = searchDetails.get("search_value");
		
		google_LandingPageSelector.enterSearchValue(strSearchValue);
		google_LandingPageSelector.clickOnSearchButton();
	}
	
	public void verifySearchResults() throws Throwable {
		
		google_LandingPageSelector.verifySearchResults();
	}
}