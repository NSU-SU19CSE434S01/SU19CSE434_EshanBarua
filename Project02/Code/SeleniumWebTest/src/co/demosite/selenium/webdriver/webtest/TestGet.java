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
