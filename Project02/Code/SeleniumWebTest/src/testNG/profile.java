package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class profile {
	
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
	  public void signIn(){
		  
		  	try {
		  		
		  		driver.findElement(By.name("userName")).sendKeys("Eshan");
				Thread.sleep(1000);
				
				driver.findElement(By.name("password")).sendKeys("1234");
				Thread.sleep(1000);
		  		
		  		driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input\n")).click();
				Thread.sleep(1000);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	  }
	  
	  @Test(dependsOnMethods = {"signIn"})
	  public void cancelReservation(){
		  
		  	try {
		  		driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a\n")).click();
		  		Thread.sleep(1000);
		  			
		  		driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/map/area")).click();
				Thread.sleep(1000);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	  }

	  
	  @Test(dependsOnMethods = {"cancelReservation"})
	  public void signin1 (){
		  
		  	try {
		  		driver.findElement(By.name("userName")).sendKeys("Eshan");
				Thread.sleep(1000);
				
				driver.findElement(By.name("password")).sendKeys("1234");
				Thread.sleep(1000);
		  		
		  		driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input\n")).click();
				Thread.sleep(1000);
		  	
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	  }


	  @Test(dependsOnMethods = {"signin1"})
	  public void editProfile(){
		  	try {
		  		
		  		//CONTACT INFORMATION
		  		
		  		driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[3]/a\n")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.name("firstName")).sendKeys("Eshan");
				Thread.sleep(1000);
				
				driver.findElement(By.name("lastName")).sendKeys("Barua");
				Thread.sleep(1000);
				
				driver.findElement(By.name("phone")).sendKeys("01883165981");
				Thread.sleep(1000);
				
				driver.findElement(By.name("email")).sendKeys("Eshan.barua@northsouth.edu");
				Thread.sleep(1000);
				
				
				//MAILING INFO
				
				driver.findElement(By.name("address1")).sendKeys("Ahmedbag");
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
				
		  		
		  		driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/table/tbody/tr[14]/td/a/img")).click();
				Thread.sleep(1000);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	  }
	  
	  @Test(dependsOnMethods = {"editProfile"})
	  public void signOff () {
		  try {
			
			  driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();
			  Thread.sleep(1000);
			  
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		  
	  }

	  @AfterTest
	  public void after() {
		 
		  driver.close();
	}
	  
}
