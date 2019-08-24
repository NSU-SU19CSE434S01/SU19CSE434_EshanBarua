package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class webTest {

	WebDriver driver;

  @BeforeTest
  public void before() {
	  try {
			System.setProperty("webdriver.chrome.driver", "D:\\Studyz\\CSE 434\\project\\Project02\\Code\\chromedriver_win32_2\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			
			driver.get("http://newtours.demoaut.com");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	  
  }
  
  @Test
  public void registration() {
	  	
	  	driver.get("http://newtours.demoaut.com/mercuryregister.php");
	  	
		driver.findElement(By.name("firstName")).sendKeys("Eshan");
		
		driver.findElement(By.name("lastName")).sendKeys("Barua");

		driver.findElement(By.name("phone")).sendKeys("01883165981");

		driver.findElement(By.name("userName")).sendKeys("Eshan");
		
		driver.findElement(By.name("address1")).sendKeys("125, Ahmedbag");

		driver.findElement(By.name("address2")).sendKeys("Bashabo");

		driver.findElement(By.name("city")).sendKeys("Dhaka");

		driver.findElement(By.name("state")).sendKeys("Dhaka");

		driver.findElement(By.name("postalCode")).sendKeys("1214");

		driver.findElement(By.name("country")).sendKeys("BANGLADESH");
		
		driver.findElement(By.name("email")).sendKeys("Eshan");

		driver.findElement(By.name("password")).sendKeys("1234");
		
		driver.findElement(By.name("confirmPassword")).sendKeys("1234");
		
		driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input")).click();
		
  }
  
  @Test(dependsOnMethods = {"registration"})
  public void login(){
		driver.findElement(By.linkText("sign-in")).click();

		driver.findElement(By.name("userName")).sendKeys("Eshan");
		
		driver.findElement(By.name("password")).sendKeys("1234");
		
		driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input")).click();
	  
  }
  
  @AfterTest
  public void after() {
	  driver.close();
}
}