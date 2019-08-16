package co.demosite.selenium.webdriver.webtest;

	
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class TestSignIn {
		
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
		
		public void signIn() {
			
			try {
				
				//Sign In
				
				invokeBrowser("http://newtours.demoaut.com/mercurywelcome.php");
				
				
				driver.findElement(By.name("userName")).sendKeys("Eshan");
				Thread.sleep(1000);
				
				driver.findElement(By.name("password")).sendKeys("1234");
				Thread.sleep(1000);
				
				driver.findElement(By.name("login")).click();
				Thread.sleep(1000);
				
				
				//ITINERARY
				
				driver.findElement(By.linkText("ITINERARY")).click();
				Thread.sleep(1000);
								
				//cancel all reservation
				driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/map/area")).click();
				Thread.sleep(1000);
				
				driver.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
		public static void main(String[] args) {
			TestSignIn obj = new TestSignIn();
			
			obj.signIn();
		}
	}

