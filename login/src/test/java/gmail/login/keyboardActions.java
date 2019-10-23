package gmail.login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class keyboardActions
{
	WebDriver driver;
    
	@BeforeMethod
	public void Setup()
	{
	
	     System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");	
	     driver =new ChromeDriver(); 
		 driver.get("file:///D:/Incrditable%20Class/HtmlPrograms/registrsn.html");
		 driver.manage().window().maximize();
	}
	
	@Test
	public void KeyboardActions()
	{
		WebElement webElement = driver.findElement(By.id("firstname"));
		Actions builder = new Actions(driver);
		Action seriesOfActions = builder
			.moveToElement(webElement)
			.click()
			.sendKeys("Shital")
			.sendKeys(Keys.TAB)
			.sendKeys("Bankar")
			.sendKeys(Keys.TAB)
			.sendKeys(Keys.ARROW_RIGHT)
			.sendKeys(Keys.TAB)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.TAB)
		    .sendKeys(Keys.SPACE)
		    .sendKeys(Keys.TAB)
		    .sendKeys(Keys.SPACE)
		    .sendKeys(Keys.TAB)
		    .sendKeys(Keys.SPACE)
		    .sendKeys(Keys.TAB)
		    .sendKeys("9546214587")
		    .sendKeys(Keys.TAB)
		    .sendKeys("Hinjewadi")
		    .sendKeys(Keys.TAB)
		    .sendKeys(Keys.SPACE)
		    .sendKeys(Keys.TAB)
		   .sendKeys(Keys.TAB)
		   .sendKeys(Keys.ENTER)
			
			.build();
			
		seriesOfActions.perform() ;
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}
}
