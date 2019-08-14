package co.demosite.selenium.webdriver.webtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocatorTest {
	
WebDriver driver;
	
	public void invokeBrowser(String url){
		
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\Studyz\\CSE 434\\project\\Project02\\Code\\chromedriver_win32_2\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			
			driver.get(url);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void ElementLocator() {
		
		try {
			invokeBrowser("http://newtours.demoaut.com/mercuryregister.php");
			
			driver.findElement(By.name("firstName")).sendKeys("Eshan");
			Thread.sleep(2000);
			
			driver.findElement(By.name("lastName")).sendKeys("Barua");
			Thread.sleep(2000);

			driver.findElement(By.name("phone")).sendKeys("01883165981");
			Thread.sleep(2000);

			driver.findElement(By.name("userName")).sendKeys("Eshan");
			Thread.sleep(2000);
			
			driver.findElement(By.name("address1")).sendKeys("125, Ahmedbag");
			Thread.sleep(2000);

			driver.findElement(By.name("address2")).sendKeys("Bashabo");
			Thread.sleep(2000);

			driver.findElement(By.name("city")).sendKeys("Dhaka");
			Thread.sleep(2000);

			driver.findElement(By.name("state")).sendKeys("Dhaka");
			Thread.sleep(2000);

			driver.findElement(By.name("postalCode")).sendKeys("1214");
			Thread.sleep(2000);

			driver.findElement(By.name("country")).sendKeys("BANGLADESH");
			Thread.sleep(2000);
			
			driver.findElement(By.name("email")).sendKeys("Eshan");
			Thread.sleep(2000);

			driver.findElement(By.name("password")).sendKeys("1234");
			Thread.sleep(2000);
			
			driver.findElement(By.name("confirmPassword")).sendKeys("1234");
			Thread.sleep(2000);
			
			driver.findElement(By.name("register")).click();
			Thread.sleep(2000);
			
			
			driver.findElement(By.linkText("sign-in")).click();
			Thread.sleep(2000);

			driver.findElement(By.name("userName")).sendKeys("Eshan");
			Thread.sleep(2000);
			
			driver.findElement(By.name("password")).sendKeys("1234");
			Thread.sleep(2000);
			
			driver.findElement(By.name("login")).click();
			Thread.sleep(2000);

			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		ElementLocatorTest obj = new ElementLocatorTest();
		
		obj.ElementLocator();
	}
}
