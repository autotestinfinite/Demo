package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import core.Driver;

public class HTTPTutorialPageTests extends Driver{

	@Test
	public void verifyPageCanBeAccessedTest() {
		home.launchApp();
		home.navigateToHttpTutorialPage();
		assertEquals(httpPage.displayedTopic(),httpPage.expectedTopic);
	}
	
	@Test
	public void checkOverViewSectionTest() {
		home.launchApp();
		home.navigateToHttpTutorialPage();
		assertTrue(httpPage.overViewDisplayed());
	}
	
}
