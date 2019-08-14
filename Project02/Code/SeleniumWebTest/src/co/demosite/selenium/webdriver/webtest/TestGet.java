package co.demosite.selenium.webdriver.webtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGet {
	
	WebDriver driver;
	
	public void invokeBrowser(){
		
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\Studyz\\CSE 434\\project\\Project02\\Code\\chromedriver_win32_2\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void get() {
		
		try {
			driver.get("http://newtours.demoaut.com/");
			
			String titleOfThePage = driver.getTitle();
			System.out.println("Title of the page is: " + titleOfThePage);
			
			driver.findElement(By.linkText("SIGN-ON")).click();
			
			String currentUrl = driver.getCurrentUrl();
			System.out.println("The current URL is: " + currentUrl );
			
			//String currentPageSource = driver.getPageSource();
			//System.out.println("The current page Source: "+ currentPageSource );
			
			Thread.sleep(2000);
			
			
			driver.get("http://newtours.demoaut.com/mercurysignon.php");
			String titleOfThePage1 = driver.getTitle();
			System.out.println("Title of the page is: " + titleOfThePage1);
			
			driver.findElement(By.linkText("SIGN-ON")).click();
			
			String currentUrl1 = driver.getCurrentUrl();
			System.out.println("The current URL is: " + currentUrl1 );
			
			//String currentPageSource = driver.getPageSource();
			//System.out.println("The current page Source: "+ currentPageSource );
			
			Thread.sleep(2000);
			
			
			driver.get("http://newtours.demoaut.com/mercuryregister.php");
			
			String titleOfThePage2 = driver.getTitle();
			System.out.println("Title of the page is: " + titleOfThePage2);
			
			driver.findElement(By.linkText("REGISTER")).click();
			
			String currentUrl2 = driver.getCurrentUrl();
			System.out.println("The current URL is: " + currentUrl2 );
			
			//String currentPageSource1 = driver.getPageSource();
			//System.out.println("The current page Source: "+ currentPageSource1 );
			
			Thread.sleep(2000);
			
			
			driver.get("http://newtours.demoaut.com/mercuryunderconst.php");
			
			String titleOfThePage3 = driver.getTitle();
			System.out.println("Title of the page is: " + titleOfThePage3);
			
			driver.findElement(By.linkText("SUPPORT")).click();
			
			String currentUrl3 = driver.getCurrentUrl();
			System.out.println("The current URL is: " + currentUrl3 );
			
			//String currentPageSource1 = driver.getPageSource();
			//System.out.println("The current page Source: "+ currentPageSource1 );
			
			Thread.sleep(2000);
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		TestGet myObj = new TestGet();
		myObj.invokeBrowser();
		
	}

}
