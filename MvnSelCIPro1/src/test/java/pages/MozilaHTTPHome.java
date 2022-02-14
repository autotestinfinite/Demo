package pages;

import core.PageFunctions;
import objectRepo.MozObs;


public class MozilaHTTPHome {
	private PageFunctions page;
	private String pageUrl="https://developer.mozilla.org/en-US/docs/Web/HTTP#tutorials";
	public MozilaHTTPHome(PageFunctions _page) {
		page=_page;
	}
	
	public void launchApp() {
		page.launch(pageUrl);
	}
	
	public void navigateToHttpTutorialPage() {
		page.click(MozObs.httpTutorialPage);
	}
	
}
