package steps_sales;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SFMain extends SFBaseNew {

// dash board
	@Given("Click View All and click Dashboards from App Launcher")
	public void dashboardCL() throws InterruptedException {

		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(6000);
		WebElement Dash = driver.findElement(By.xpath("//p[text()='Dashboards']"));
		driver.executeScript("arguments[0].click()", Dash);
		Thread.sleep(4000);

	}

	@When("Click on the New Dashboard option")
	public void newDashboard() throws InterruptedException {
		WebElement NDash = driver.findElement(By.xpath("//div[@title='New Dashboard']"));
		driver.executeScript("arguments[0].click()", NDash);
		Thread.sleep(7000);
	}

	@And("Enter Name as {string} and Click on Create.")
	public void salesForceAuto(String salesforceAutomation) throws InterruptedException {
		WebElement frame = driver.findElement(By.xpath("//div[@class='dashboardContainer']/iframe"));
		driver.switchTo().frame(frame);
		WebElement name = driver.findElement(By.xpath("//div[@class='slds-form-element__control']/input"));
		Thread.sleep(2000);
		name.sendKeys(salesforceAutomation);
		Thread.sleep(4000);
	}

	@And("Click on Save and Verify Dashboard name.")
	public void saveDashboard() {
		WebElement save = driver.findElement(By.xpath("//button[text()='Create']"));
		driver.executeScript("arguments[0].click()", save);
		driver.switchTo().defaultContent();
	}

				// Create new account
	
	@When("Click view All and click Sales from App Launcher for createAccount")
	public void  View() throws InterruptedException
	{
		WebElement view = driver.findElement(By.xpath("//button[text()='View All']"));
		driver.executeScript("arguments[0].click()", view);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(8000);
		
	}
	@And("Click on Accounts tab")
	public void Accountstab() throws InterruptedException
	{
		WebElement acc = driver.findElement(By.xpath("//span[text()='Accounts']"));
		driver.executeScript("arguments[0].click()", acc);
		Thread.sleep(3000);
		
	}
	@And ("Click on New button for accountcreation")
	public void accountCreNew() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[text()='New']")).click();
		Thread.sleep(3000);
		
	}
	@And ("Enter {string} as account name")
	public void AccName(String name) throws InterruptedException
	{
		WebElement namev = driver.findElement(By.xpath("//label[text()='Account Name']/following-sibling::div/input"));
		namev.sendKeys(name);
		Thread.sleep(3000);
			
	}
	@And ("Select Ownership as Public")
	public void ownership() throws InterruptedException
	{
		WebElement owner = driver.findElement(By.xpath("//label[text()='Ownership']/following-sibling::div//div//button"));
		driver.executeScript("arguments[0].click()", owner);
		Thread.sleep(2000);
		WebElement pub = driver.findElement(By.xpath("//span[text()='Public']"));
		driver.executeScript("arguments[0].click()", pub);
		Thread.sleep(2000);
			}
@And ("Click save and verify Account name")
public void saveAcc()
{
	WebElement save = driver.findElement(By.xpath("//button[text()='Save']"));
	driver.executeScript("arguments[0].click()", save);
	
}
		//for createopp without mandatory field
@When("Click view All and click Sales from App Launcher for oppurtunity")
public void ViewAllMan() throws InterruptedException {
	WebElement view1 = driver.findElement(By.xpath("//button[text()='View All']"));
	driver.executeScript("arguments[0].click()", view1);
	Thread.sleep(3000);
//click on sales
driver.findElement(By.xpath("//p[text()='Sales']")).click();
Thread.sleep(7000);
}

@And ("Click on Opportunity tab for validation")
public void oppor() throws InterruptedException
{
	WebElement opp = driver.findElement(By.xpath("//a[@title='Opportunities']"));
	driver.executeScript("arguments[0].click()",opp);
	System.out.println("The opportunities tab is clicked");
	Thread.sleep(4000);
	
}
@And ("Click on New button for validation")
public void newMan()
{
	driver.findElement(By.xpath("//a[@title='New']")).click();
}

@And ("Choose Close date as Tomorrow Date for validation")
public void chooseDate() throws InterruptedException
{
	WebElement Closedate = driver.findElement(By.xpath("//input[@name='CloseDate']"));
	Closedate.click();
	Closedate.sendKeys("10/18/2022");
	Thread.sleep(3000);
}
@And ("Click on save for validation")
public void save()
{
	driver.findElement(By.xpath("//button[text()='Save']")).click();
}
@And ("Verify the Alert message (Completethis field) displayed for Name and Stage")
public void validationMan()
{
	System.out.println("The validation is performed");
}

				// create new oppurtunity
@When ("Click view All and click Sales from App Launcher")
public void newoppr() throws InterruptedException
{
	WebElement view2 = driver.findElement(By.xpath("//button[text()='View All']"));
	driver.executeScript("arguments[0].click()", view2);
	Thread.sleep(3000);

	//click on sales
	driver.findElement(By.xpath("//p[text()='Sales']")).click();
	Thread.sleep(7000);
}

@And ("Click on Opportunity tab")
public void oppurnewtab() throws InterruptedException
{
	WebElement opp = driver.findElement(By.xpath("//a[@title='Opportunities']"));
	driver.executeScript("arguments[0].click()",opp);

	System.out.println("The opportunities tab is clicked");
	Thread.sleep(4000);

}
@And ("Click on New button") 
public void newopprtu()
{
	driver.findElement(By.xpath("//a[@title='New']")).click();
}

@And ("Enter Opportunity name as {string}  Get the text and Store it")
public void oppuname(String SalesforceAutomation) throws InterruptedException
{
	WebElement oppurName = driver.findElement(By.xpath("(//input[@class='slds-input'])[4]"));
	Thread.sleep(2000);
	oppurName.sendKeys(SalesforceAutomation);
	}
@And ("Choose close date as Today")
public void date() throws InterruptedException
{
	WebElement Closedate = driver.findElement(By.xpath("//input[@name='CloseDate']"));
	Closedate.click();
	Closedate.sendKeys("10/11/2022");
	Thread.sleep(3000);
	
}
@And ("Select Stage as Need Analysis")
public void stage() throws InterruptedException
{
	driver.findElement(By.xpath("//button[contains(@class,'slds-input_faux')]")).click();
	
	Thread.sleep(3000);
	
	WebElement stageEle = driver.findElement(By.xpath("(//lightning-icon[@class='slds-input__icon slds-input__icon_right slds-icon-utility-down slds-icon_container'])[1]"));
	driver.executeScript("arguments[0].click()", stageEle);
	WebElement findElement2 = driver.findElement(By.xpath("(//span[@class='slds-media__body'])[4]/span"));
	driver.executeScript("arguments[0].click();", findElement2);
	Thread.sleep(9000);
}
@And ("click Save and VerifyOppurtunity Name")
public void savecreopp()
{
	driver.findElement(By.xpath("//button[text()='Save']")).click();
}



}
