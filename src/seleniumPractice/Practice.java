package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/BrowserDriversEXE/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		WebElement wbElement=driver.findElement(By.xpath("//ul[@id='primary-menu']//span[normalize-space(text())='DEMO SITES']"));
		action.moveToElement(wbElement).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//ul[@id='primary-menu']//span[text()='Automation Practice Form']")).click();
		Thread.sleep(5000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if (url.equals("http://toolsqa.com/automation-practice-form/")){
			System.out.println("Successfully entered the Form site");	
		}
		else {
			System.out.println("Wrong URL");
		}


	}

}
