package Day26_mercuryDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Mt {
	Logger log=Logger.getLogger(Mt.class.getName());
	WebDriver driver;
	@BeforeSuite
	public void openBrowser()
	
	{
		log.info("Hello");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver =new ChromeDriver();
	}
	@BeforeTest
	public void enterUrl()
	{
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		log.info("Before Test"); 
	}
	@BeforeClass
	public void maximize()
	{
		driver.manage().window().maximize();
		log.info("Before Class");
	}
	@BeforeMethod
	public void cookiesdetails()
	{
		Set<Cookie> s=driver.manage().getCookies();
		int count=s.size();
		log.error(count);
	}
	@Test
	public void loginCheck() throws Exception {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Abcd");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Lkjhg");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("8745985698");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Asdfg");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys(",maharastra");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("411052");
		driver.findElement(By.xpath("//select[@name='country']")).sendKeys("India");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("asdf@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Abcd@123");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Abcd@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		log.info("Mt login Successful");
		System.out.println("Changes in Git");
	}	
}

 

