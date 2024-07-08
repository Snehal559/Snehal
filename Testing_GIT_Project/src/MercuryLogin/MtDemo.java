package MercuryLogin;

import java.io.File;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MtDemo {
	WebDriver driver;
	@BeforeSuite
	  public void openbrowser() {
		System.out.println("Hello");
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver =new ChromeDriver();
		System.out.println("***Open Browser***");
	  }	
	 @BeforeTest
	  public void enterurl() {
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		System.out.println("***URL launch***");
	  }
	 @BeforeClass
	  public void maximizeWebpage() {
		  driver.manage().window().maximize();
		  System.out.println("***Maximize WebPage***");
	  }
	 @BeforeMethod
	  public void cookiesDetails() {
		Set<Cookie> cookies=driver.manage().getCookies();
		for (Cookie cookie : cookies) {
			System.out.println("Cookie Name ="+cookie.getName());
		}
	  }
	 @Test
	  public void loginCheck() {
		 	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("ABCD");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("XYZS");
			driver.findElement(By.xpath("//input[@name='submit']")).click();
			System.out.println("***Test method to login check***");
	  }
 
	 @AfterMethod
	 public void captureScreenShot() throws Exception {
		 System.out.println("***After Method Captur ScreenShot***");
		 File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(scr, new File("F:\\Software Testing\\Testing_PDF\\teng.png"));
		 System.out.println("***Screen Captured***");
	 }
	 
	@AfterClass
	public void deleteCookies() {
	   System.out.println("***After Class***");
	}
	 
	@AfterTest
	 public void dbConnectionClose()
		{
			System.out.println("***Database close***");
		}

	 @AfterSuite(enabled = false) 
	 public void CloseBrowser() {
		 System.out.println("***Close-Browser***");
		 driver.close();
	 }

}
