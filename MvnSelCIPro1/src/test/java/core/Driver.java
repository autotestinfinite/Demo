package core;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pages.MozHTTPTutorialPage;
import pages.MozilaHTTPHome;
import static utils.ConsoleLogger.*;
public class Driver {
	private PageFunctions page;
	protected MozilaHTTPHome home;
	protected MozHTTPTutorialPage httpPage;
	
	@BeforeClass
	protected void inItPageFunctions() {
		page=new PageFunctions();
		home =new MozilaHTTPHome(page);
		httpPage=new MozHTTPTutorialPage(page);
	}
	@BeforeMethod
	protected void inItBrowser() {
		page.inIt();
	}
	@AfterMethod
	protected void tearDownBrowser(ITestResult result) {
		page.tearDown();
		log(result.getName(),result.getStatus());
	}
}
