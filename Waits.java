package Week7.day2.Assinment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jfr.Timespan;

public class Waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.leafground.com/waits.xhtml;jsessionid=node018njzuxhhuo4l1il5whhqasf9x375735.node0");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
// performing explicit wait
WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
1.Wait for Visibility (1 - 10 Sec)
//Clicking the button
driver.findElement(By.xpath("//h5[text()='Wait for Visibility (1 - 10 Sec)']/following-sibling::div//button")).click();
// element that will be visible after 10 sec
WebElement Visible = driver.findElement(By.xpath("(//h5[text()='Wait for Visibility (1 - 10 Sec)']/following-sibling::div//button)[2]"));
wait.until(ExpectedConditions.visibilityOf(Visible));
String VisibleText = Visible.getText();
System.out.println(" The text is " +VisibleText);*/

//2. Wait for Invisibility (1 - 10 Sec)

driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
WebElement Invisible = driver.findElement(By.xpath("//span[text()='I am about to hide']"));
wait.until(ExpectedConditions.invisibilityOf(Invisible));
boolean displayed = Invisible.isDisplayed();
System.out.println(displayed);

//3.Wait for Clickability
driver.findElement(By.xpath("//span[text()='Click First Button']")).click();
WebElement Click = driver.findElement(By.xpath("//span[text()='Click Second']"));
wait.until(ExpectedConditions.elementToBeClickable(Click));
Click.click();

//4. Wait for Text Change (1 - 10 Sec)
WebElement waitforText = driver.findElement(By.xpath("(//span[text()='Did you notice?']"));
String IntialText = driver.findElement(By.xpath("//span[text()='I am going to change!']")).getText();
System.out.println("The initial text"+IntialText);
driver.findElement(By.xpath("(//span[text()='Click'])[3]")).click();
wait.until(ExpectedConditions.visibilityOf(waitforText));
String FinalText = waitforText.getText();
System.out.println("The initial text"+FinalText);

/*WebElement waitforText = driver.findElement(By.xpath("(//h5[text()='Wait for Text Change (1 - 10 Sec)']/following-sibling::div//button)[2]"));
String IntialText = driver.findElement(By.xpath("//span[text()='I am going to change!']")).getText();
System.out.println("The initial text"+IntialText);
driver.findElement(By.xpath("(//span[text()='Click'])[3]")).click();
WebElement waitforsectext=driver.findElement(By.xpath("//span[text()='Did you notice?']"));
wait.until(ExpectedConditions.visibilityOf(waitforsectext));	
System.out.println(waitforText.getText());*/





	}

}
