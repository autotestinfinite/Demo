package core;
import static utils.ConsoleLogger.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

 	class BrowserFactory {

	private WebDriver driver;

	protected WebDriver getDriver() {
		
		return driver;
	}
	protected void setDriver()	 {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	
	}
	
	
	
}
