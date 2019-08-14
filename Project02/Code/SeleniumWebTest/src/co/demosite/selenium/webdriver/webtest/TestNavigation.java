package co.demosite.selenium.webdriver.webtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNavigation {
	
	WebDriver driver;
	
	public void invokeBrowser(){
		
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\Studyz\\CSE 434\\project\\Project02\\Code\\chromedriver_win32_2\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			navigate();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void navigate() {
		
		
	}
	
	public static void main(String[] args) {
		TestNavigation myObj = new TestNavigation();
		myObj.invokeBrowser();
		
	}

}
