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
  

  @Test(dependsOnMethods = {"login"})
  public void findingFlights(){
		driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]")).click();
		
		driver.findElement(By.name("passCount")).sendKeys("2");
		
		driver.findElement(By.name("fromPort")).sendKeys("Paris");
		
		driver.findElement(By.name("fromMonth")).sendKeys("August");
		
		driver.findElement(By.name("fromDay")).sendKeys("29");
		
		driver.findElement(By.name("toPort")).sendKeys("London");
		
		driver.findElement(By.name("toMonth")).sendKeys("November");
		
		driver.findElement(By.name("toDay")).sendKeys("8");
		
		driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]")).click();
		
		driver.findElement(By.name("airline")).sendKeys("Blue Skies Airlines");
		
		driver.findElement(By.name("findFlights")).click();
  }
  
  
  @Test(dependsOnMethods = {"findingFlights"})
  public void bookingFlights(){
		driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[5]/td[1]/input")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[5]/td[1]/input")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/p/input")).click();
  }
  
  
  
  @Test(dependsOnMethods = {"bookingFlights"})
  public void confirmingFlights(){
	  	
	  	driver.findElement(By.name("passFirst0")).sendKeys("Eshan");
		
		driver.findElement(By.name("passLast0")).sendKeys("Barua");
		
		driver.findElement(By.name("pass.0.meal")).sendKeys("Bland");
		
		driver.findElement(By.name("passFirst1")).sendKeys("Shuvo");
		
		driver.findElement(By.name("passLast1")).sendKeys("Barua");
		
		driver.findElement(By.name("pass.1.meal")).sendKeys("Bland");
		
		driver.findElement(By.name("creditCard")).sendKeys("Visa");
		
		driver.findElement(By.name("creditnumber")).sendKeys("12345");
		
		driver.findElement(By.name("cc_exp_dt_mn")).sendKeys("09");
		
		driver.findElement(By.name("cc_exp_dt_yr")).sendKeys("2010");
		
		driver.findElement(By.name("cc_frst_name")).sendKeys("Eshan");
		
		driver.findElement(By.name("cc_mid_name")).sendKeys("Barua");
		
		driver.findElement(By.name("cc_last_name")).sendKeys("Shuvo");
		
  }
  
  @Test(dependsOnMethods = {"confirmingFlights"})
  public void billingAddress (){
	  
	  	driver.findElement(By.name("ticketLess")).click();
		
		driver.findElement(By.name("billAddress1")).clear();
		
		driver.findElement(By.name("billAddress1")).sendKeys("Ahmedbag");
		
		driver.findElement(By.name("billAddress2")).sendKeys("Bashabo");
		
		driver.findElement(By.name("billCity")).clear();
		
		driver.findElement(By.name("billCity")).sendKeys("Dhaka");
		
		driver.findElement(By.name("billState")).clear();
		
		driver.findElement(By.name("billState")).sendKeys("Dhaka");
		
		driver.findElement(By.name("billZip")).clear();
		
		driver.findElement(By.name("billZip")).sendKeys("1214");
		
		driver.findElement(By.name("billCountry")).sendKeys("BANGLADESH");
	
  }
  
  @AfterTest
  public void after() {
	 
	  driver.close();
}
}