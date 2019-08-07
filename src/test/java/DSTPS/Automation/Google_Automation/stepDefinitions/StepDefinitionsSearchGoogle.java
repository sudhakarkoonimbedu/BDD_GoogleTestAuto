package DSTPS.Automation.Google_Automation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;

import DSTPS.Automation.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.Apps.common.LandingPage_Steps;
import DSTPS.Automation.Apps.common.LaunchPage_Steps;
import DSTPS.Automation.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.Google_Automation.steps.Google_LandingPage_Steps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionsSearchGoogle {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public LaunchPage_Steps launchPage_Steps;
	public LandingPage_Steps landingPage_Steps;
	public Google_LandingPage_Steps google_LandingPage_Steps;
	
	public StepDefinitionsSearchGoogle(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable {
		
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable {
		
		// Initialize the step classes here
		google_LandingPage_Steps = new Google_LandingPage_Steps(SharedResource,utils);		
	}	
	
	
	@Given("^User navigate to the Google application$")
	public void user_Access_Google_Application() throws Throwable {
		
		google_LandingPage_Steps.verifyGooglePage();
	}
	
	@When("^perform search$")
	public void user_Search_For_Existing_Content(Map<String,String> searchDetails) throws Throwable {
		
		google_LandingPage_Steps.performSearch(searchDetails);
	}
	
	@Then("^Search results should be displayed$")
	public void Google_Search_Results_Table() throws Throwable {
		
		google_LandingPage_Steps.verifySearchResults();
	}
}