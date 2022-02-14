package pages;

import core.PageFunctions;
import objectRepo.MozObs;

public class MozHTTPTutorialPage {

	private PageFunctions page;
	
	public String expectedTopic="HTTP";

	public MozHTTPTutorialPage(PageFunctions func) {
			page=func;
	}
	
	public String displayedTopic() {
		return page.elementText(MozObs.pageTitleHeading);
	}
	
	public boolean overViewDisplayed() {
			return page.isVisible(MozObs.overview);
	}
}
