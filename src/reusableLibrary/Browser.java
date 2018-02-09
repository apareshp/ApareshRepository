package reusableLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	public WebDriver launchBrowser(String browserName) {
		WebDriver driver = null;
		switch(browserName) {
		case "firefox":
			driver=new FirefoxDriver();
			break;
		case "chrome":
			String sRootPath=System.getProperty("user.dir");
			System.out.println("Root Path is: "+ sRootPath);
			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/BrowserDriversEXE/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver",sRootPath+ "/BrowserDriversEXE/chromedriver.exe");
			driver = new ChromeDriver(); 
			break;
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
		
		
	}

}
