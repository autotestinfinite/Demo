package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageFunctions extends BrowserFactory {
	
	private String value;
	public void inIt()  {
		setDriver();
	}
	public void tearDown() {
		getDriver().quit();
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
		return getDriver().findElement(by);
	}
	
	
	
	public void launch(String str) {
		getDriver().get(str);
	}
	
	public void click(By by) {
		find(by).click();
	}
	
	public void clear(By by) {
		find(by).clear();
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
