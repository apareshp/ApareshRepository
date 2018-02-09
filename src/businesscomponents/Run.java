package businesscomponents;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import objectRepository.RegistrationObjects;
import reusableLibrary.Browser;

public class Run {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		InputStream input= new FileInputStream("conf.properties");
		prop.load(input);
		String surl=prop.getProperty("Url");
		String sFirstName=prop.getProperty("FirstName");
		Browser obj=new Browser();
		driver=obj.launchBrowser("chrome");
		driver.get(surl);
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		//WebElement wbElement=driver.findElement(By.xpath("//ul[@id='primary-menu']//span[normalize-space(text())='DEMO SITES']"));
		WebElement wbElement=RegistrationObjects.demoSiteLink(driver);
		action.moveToElement(wbElement).build().perform();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//ul[@id='primary-menu']//a//span[normalize-space(text())='Automation Practice Form']")).click();
		RegistrationObjects.automationPracticeFormLink(driver).click();
		
		//Form fillup
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(sFirstName);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Dsouza");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//input[@value='4']")).click();
		
		
		Select select=new Select(driver.findElement(By.xpath("//select[@id='selenium_commands']")));
		//select.selectByVisibleText("Wait Commands");
		select.selectByIndex(1);
		//driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		//driver.close();
	}

}
