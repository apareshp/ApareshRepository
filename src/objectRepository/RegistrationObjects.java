package objectRepository;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationObjects {

	public static WebElement element=null;
	
	
	public static WebElement demoSiteLink(WebDriver driver) {
		element=driver.findElement(By.xpath("//ul[@id='primary-menu']//span[normalize-space(text())='DEMO SITES']"));
		return element;
	}
	public static WebElement automationPracticeFormLink(WebDriver driver) {
		element=driver.findElement(By.xpath("//ul[@id='primary-menu']//a//span[normalize-space(text())='Automation Practice Form']"));
		return element;
	}

}
