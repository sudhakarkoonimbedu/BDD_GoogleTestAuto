package DSTPS.Automation.Google_Automation.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(CucumberRunner.class)
@CucumberOptions(
		features = {"classpath:features/Google/Google2.feature" }, 
			tags = {"@SmokeTest"}, 
			glue= {"classpath:DSTPS.Automation.Google_Automation.stepDefinitions",
					"classpath:DSTPS.Automation.Apps.common",
					"classpath:DSTPS.Automation.Google_Automation.pages",
					"classpath:DSTPS.Automation.Google_Automation.runners",
					"classpath:DSTPS.Automation.Google_Automation.steps"},
			plugin =  {"pretty","html:target/html", "json:google2.json", "rerun:src/test/resources/rerun.txt"},
			strict=true
)

public class GoogleFeature_TestRunner2 extends AbstractTestNGCucumberTests {
	
}