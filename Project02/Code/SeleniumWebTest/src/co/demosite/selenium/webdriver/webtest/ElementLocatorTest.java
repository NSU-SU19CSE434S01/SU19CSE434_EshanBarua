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
			
			//Registration
			
			invokeBrowser("http://newtours.demoaut.com/mercuryregister.php");
			
			driver.findElement(By.name("firstName")).sendKeys("Eshan");
			Thread.sleep(1000);
			
			driver.findElement(By.name("lastName")).sendKeys("Barua");
			Thread.sleep(1000);

			driver.findElement(By.name("phone")).sendKeys("01883165981");
			Thread.sleep(1000);

			driver.findElement(By.name("userName")).sendKeys("Eshan");
			Thread.sleep(1000);
			
			driver.findElement(By.name("address1")).sendKeys("125, Ahmedbag");
			Thread.sleep(1000);

			driver.findElement(By.name("address2")).sendKeys("Bashabo");
			Thread.sleep(1000);

			driver.findElement(By.name("city")).sendKeys("Dhaka");
			Thread.sleep(1000);

			driver.findElement(By.name("state")).sendKeys("Dhaka");
			Thread.sleep(1000);

			driver.findElement(By.name("postalCode")).sendKeys("1214");
			Thread.sleep(1000);

			driver.findElement(By.name("country")).sendKeys("BANGLADESH");
			Thread.sleep(1000);
			
			driver.findElement(By.name("email")).sendKeys("Eshan");
			Thread.sleep(1000);

			driver.findElement(By.name("password")).sendKeys("1234");
			Thread.sleep(1000);
			
			driver.findElement(By.name("confirmPassword")).sendKeys("1234");
			Thread.sleep(1000);
			
			driver.findElement(By.name("register")).click();
			Thread.sleep(1000);
			
			//LogIn
			
			driver.findElement(By.linkText("sign-in")).click();
			Thread.sleep(1000);

			driver.findElement(By.name("userName")).sendKeys("Eshan");
			Thread.sleep(1000);
			
			driver.findElement(By.name("password")).sendKeys("1234");
			Thread.sleep(1000);
			
			driver.findElement(By.name("login")).click();
			Thread.sleep(1000);
			
			
			//Finding Flight
	
			driver.findElement(By.name("tripType")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.name("passCount")).sendKeys("2");
			Thread.sleep(1000);
			
			driver.findElement(By.name("fromPort")).sendKeys("Paris");
			Thread.sleep(1000);
			
			driver.findElement(By.name("fromMonth")).sendKeys("August");
			Thread.sleep(1000);
			
			driver.findElement(By.name("fromDay")).sendKeys("29");
			Thread.sleep(1000);
			
			driver.findElement(By.name("toPort")).sendKeys("London");
			Thread.sleep(1000);
			
			driver.findElement(By.name("toMonth")).sendKeys("November");
			Thread.sleep(1000);
			
			driver.findElement(By.name("toDay")).sendKeys("8");
			Thread.sleep(1000);
			
			driver.findElement(By.name("servClass")).sendKeys("First");
			Thread.sleep(1000);
			
			driver.findElement(By.name("airline")).sendKeys("Blue Skies Airlines");
			Thread.sleep(1000);
			
			driver.findElement(By.name("findFlights")).click();
			Thread.sleep(1000);
			
			
			//Booking Flights
			
			driver.findElement(By.name("outFlight")).sendKeys("Blue Skies Airlines$361$271$7:10");
			Thread.sleep(1000);
			
			driver.findElement(By.name("inFlight")).sendKeys("Blue Skies Airlines$631$273$14:30");
			Thread.sleep(1000);
			
			driver.findElement(By.name("reserveFlights")).click();
			Thread.sleep(1000);
			

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
