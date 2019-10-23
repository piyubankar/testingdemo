package gmail.login;

// login into gmail using testng and test run multiple time///
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class gmaillogintestng {
	public WebDriver driver;
	   
	@BeforeMethod
	public void beforetest()
	{
		
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");		
		 driver=new ChromeDriver(); 
		 driver.manage().window().maximize();
		 driver.get("https://www.gmail.com");
	}
	@Test
	
	public void test() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//input[@id='Email'] | //input[@id='identifierId']")).sendKeys("sheetalbankar21@gmail.com");			
		 Thread.sleep(5000);
		// driver.findElement(By.xpath("//span[contains(@class, 'RveJvd snByac')]")).click();
		 driver.findElement(By.xpath("//span[@class='CwaK9'] | //input[@id='next']")).click();			
		 Thread.sleep(5000);
		 System.out.println("password start");
		 driver.findElement(By.xpath("//input[@name='password'] | //input[@name='Passwd']")).sendKeys("sb2192@b");
		 System.out.println("password end");
		 Thread.sleep(5000);
		 System.out.println("next strat");
		 driver.findElement(By.xpath("//span[@class='CwaK9'] | //input[@id='signIn']")).click();
		 System.out.println("next end");
		 Thread.sleep(5000);
		 String inbox = driver.findElement(By.xpath("//span/a[contains(text(),'Inbox')]/following::div[1]")).getText();
	        System.out.println(inbox);
	     driver.findElement(By.xpath("//span[@class='gb_xa gbii']")).click();
	     driver.findElement(By.xpath("//a[@id='gb_71']")).click();
	     
	 
	}
	
	/*@AfterTest
	public void aftertest()
	{
		driver.close();
		
	}*/

}
