package co.demosite.selenium.webdriver.webtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setUp {
	
	WebDriver driver;
	JavascriptExecutor jse;
	
	public void invokeBrowser() {
		
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\Studyz\\CSE 434\\project\\Project02\\Code\\chromedriver_win32_2\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("http://newtours.demoaut.com/");
			khujo();
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void khujo(){
		
		try {
			
			driver.findElement(By.id("button")).sendKeys("java");		
			Thread.sleep(3000);
			driver.findElement(By.id("serach-button")).click();	
			jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0, 800)");
			driver.findElement(By.xpath("//label[contains(text(), 'weekend')]")).click();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		}
		
	
	public static void main(String[] args) {
		setUp Obj = new setUp();
		Obj.invokeBrowser();
	}
}

