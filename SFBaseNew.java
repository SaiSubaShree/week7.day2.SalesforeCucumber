package steps_sales;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SFBaseNew  extends AbstractTestNGCucumberTests {
public  static ChromeDriver driver;
@BeforeMethod
public  void base() throws InterruptedException {
	// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("disable-notifications");
	driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
	//Launch ServiceNow application
	driver.get("https://login.salesforce.com/?locale=in");
	Thread.sleep(3000);
	
	//Login with valid credentials username as admin and password as Sairam13$
	driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
	driver.findElement(By.id("password")).sendKeys("Password#123");
	driver.findElement(By.xpath("//input[@name='Login']")).click();
	Thread.sleep(8000);

	// click on the toggle button
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	Thread.sleep(4000);

}
		
	}



