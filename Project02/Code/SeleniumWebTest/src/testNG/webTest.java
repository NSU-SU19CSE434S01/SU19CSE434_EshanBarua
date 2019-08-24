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
	  	
	  	try {
			driver.get("http://newtours.demoaut.com/mercuryregister.php");
			Thread.sleep(1000);

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
			
			driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input")).click();
			Thread.sleep(1000);

	  	} catch (Exception e) {
			e.printStackTrace();
		}
		
  }
  
  
  @Test(dependsOnMethods = {"registration"})
  public void login(){
		try {
			driver.findElement(By.linkText("sign-in")).click();
			Thread.sleep(1000);

			driver.findElement(By.name("userName")).sendKeys("Eshan");
			Thread.sleep(1000);

			driver.findElement(By.name("password")).sendKeys("1234");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input")).click();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	  
  }
  

  @Test(dependsOnMethods = {"login"})
  public void findingFlights(){
		try {
			driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]")).click();
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
			
			driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.name("airline")).sendKeys("Blue Skies Airlines");
			Thread.sleep(1000);
			
			driver.findElement(By.name("findFlights")).click();
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

  }
  
  
  @Test(dependsOnMethods = {"findingFlights"})
  public void bookingFlights(){
		try {
			driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[5]/td[1]/input")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[5]/td[1]/input")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/p/input")).click();
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

  }
  
  
  
  @Test(dependsOnMethods = {"bookingFlights"})
  public void confirmingFlights(){
	  	
	  	try {
			driver.findElement(By.name("passFirst0")).sendKeys("Eshan");
			Thread.sleep(1000);
			
			driver.findElement(By.name("passLast0")).sendKeys("Barua");
			Thread.sleep(1000);
			
			driver.findElement(By.name("pass.0.meal")).sendKeys("Bland");
			Thread.sleep(1000);
			
			driver.findElement(By.name("passFirst1")).sendKeys("Shuvo");
			Thread.sleep(1000);
			
			driver.findElement(By.name("passLast1")).sendKeys("Barua");
			Thread.sleep(1000);
			
			driver.findElement(By.name("pass.1.meal")).sendKeys("Bland");
			Thread.sleep(1000);
			
			driver.findElement(By.name("creditCard")).sendKeys("Visa");
			Thread.sleep(1000);
			
			driver.findElement(By.name("creditnumber")).sendKeys("12345");
			Thread.sleep(1000);
			
			driver.findElement(By.name("cc_exp_dt_mn")).sendKeys("09");
			Thread.sleep(1000);
			
			driver.findElement(By.name("cc_exp_dt_yr")).sendKeys("2010");
			Thread.sleep(1000);
			
			driver.findElement(By.name("cc_frst_name")).sendKeys("Eshan");
			Thread.sleep(1000);
			
			driver.findElement(By.name("cc_mid_name")).sendKeys("Barua");
			Thread.sleep(1000);
			
			driver.findElement(By.name("cc_last_name")).sendKeys("Shuvo");
			Thread.sleep(1000);

	  	} catch (Exception e) {
			e.printStackTrace();
		}
		
  }
  
  @Test(dependsOnMethods = {"confirmingFlights"})
  public void billingAddress(){
	  
	  	try {
			driver.findElement(By.name("ticketLess")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.name("billAddress1")).clear();
			Thread.sleep(1000);
			
			driver.findElement(By.name("billAddress1")).sendKeys("Ahmedbag");
			Thread.sleep(1000);
			
			driver.findElement(By.name("billAddress2")).sendKeys("Bashabo");
			Thread.sleep(1000);
			
			driver.findElement(By.name("billCity")).clear();
			Thread.sleep(1000);
			
			driver.findElement(By.name("billCity")).sendKeys("Dhaka");
			Thread.sleep(1000);
			
			driver.findElement(By.name("billState")).clear();
			Thread.sleep(1000);
			
			driver.findElement(By.name("billState")).sendKeys("Dhaka");
			Thread.sleep(1000);
			
			driver.findElement(By.name("billZip")).clear();
			Thread.sleep(1000);
			
			driver.findElement(By.name("billZip")).sendKeys("1214");
			Thread.sleep(1000);

			driver.findElement(By.name("billCountry")).sendKeys("BANGLADESH");
			Thread.sleep(1000);

	  	} catch (Exception e) {
			e.printStackTrace();
		}
	
  }
  
  
  @Test(dependsOnMethods = {"billingAddress"})
  public void deliveryAddress(){
	  
	  	try {
			driver.findElement(By.name("delAddress1")).clear();
			Thread.sleep(1000);
			
			driver.findElement(By.name("delAddress1")).sendKeys("Ahmedbag");
			Thread.sleep(1000);
			
			driver.findElement(By.name("delAddress2")).sendKeys("Bashabo");
			Thread.sleep(1000);
			
			driver.findElement(By.name("delCity")).clear();
			Thread.sleep(1000);
			
			driver.findElement(By.name("delCity")).sendKeys("Dhaka");
			Thread.sleep(1000);

			driver.findElement(By.name("delState")).clear();
			Thread.sleep(1000);

			driver.findElement(By.name("delState")).sendKeys("Dhaka");
			Thread.sleep(1000);

			driver.findElement(By.name("delZip")).clear();
			Thread.sleep(1000);

			driver.findElement(By.name("delZip")).sendKeys("1214");
			Thread.sleep(1000);

			driver.findElement(By.name("delCountry")).sendKeys("BANGLADESH");
			Thread.sleep(1000);
			
			driver.switchTo().alert().accept();		
			Thread.sleep(3000);
			
			driver.findElement(By.name("buyFlights")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
  }
  
  @Test(dependsOnMethods = {"deliveryAddress"})
  public void logOut(){
	  
	  	try {
	  		driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[3]/a/img")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
  }
  
  @Test(dependsOnMethods = {"logOut"})
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
	  		
	  		driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/map/area")).click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
  }
  

  
  @AfterTest
  public void after() {
	 
	  driver.close();
}
}