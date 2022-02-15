package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static utils.ConsoleLogger.*;
public class PageFunctions extends BrowserFactory {
	
	private String value;
	public void inIt()  {
		setDriver();
		log("Launched","Chrome Browser!!!!");
	}
	public void tearDown() {
		getDriver().quit();
		log("Closed","Chrome Browser!!!!");
	}
	
	private void sleep() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	private WebElement find(By by) {
		sleep();
		log("finding",by);
		return getDriver().findElement(by);
	}
	
	
	
	public void launch(String str) {
		getDriver().get(str);
		log("launched",str);
	}
	
	public void click(By by) {
		find(by).click();
		log("clicked",by);
	}
	
	public void clear(By by) {
		find(by).clear();
		log("cleared",by);
	}
	
	
	public void typeInField(String val,By by) {
		clear(by);
		click(by);
		find(by).sendKeys(val);
	}
	public String elementText(By by) {
		return find(by).getText();
	}
	public boolean isVisible(By by) {
		return find(by).isDisplayed();
	}
	
}
