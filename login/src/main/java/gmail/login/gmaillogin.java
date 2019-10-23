package gmail.login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/// login into gmail and get count of mailbox
public class gmaillogin {

	    public static void main(String[] args) throws InterruptedException
	    {
		    WebDriver driver;
		   
		   System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");		
			 driver=new ChromeDriver(); 
			 driver.manage().window().maximize();
			 driver.get("https://www.gmail.com");
			// driver.findElement(By.id("gb_70")).click();
			 Thread.sleep(5000);
			// driver.findElement(By.id("identifierId")).sendKeys("sheetalbankar21@gmail.com");
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
			 // get count of mailbox
			 String inbox = driver.findElement(By.xpath("//span/a[contains(text(),'Inbox')]/following::div[1]")).getText();
		        System.out.println(inbox);
			
	}
	

}
