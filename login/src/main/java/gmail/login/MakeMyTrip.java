package gmail.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class MakeMyTrip
{
WebDriver driver;
    
	@BeforeMethod
	public void Setup()
	{
	
	     System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");	
	     driver =new ChromeDriver(); 
		 driver.get("https://www.makemytrip.com");
		 driver.manage().window().maximize();
	}
	
	@Test
	public void booking()
	{
		
		Select dropdown = new Select (driver.findElement(By.xpath("//input[@class=\"react-autosuggest__input react-autosuggest__input--open\"]")));
		dropdown.selectByVisibleText("Pune,India");
	}
}
