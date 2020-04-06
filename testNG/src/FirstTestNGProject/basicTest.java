package FirstTestNGProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


	public class basicTest {
		static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		WebDriver driver;
		@Test
		public void open() throws InterruptedException
		{
			driver=new ChromeDriver();
			Thread.sleep(3000);
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			Thread.sleep(5000);
		}
		@Test
         public void signIN() throws InterruptedException {
			
			WebElement userName = driver.findElement(By.xpath("//input[@name=\"email\"]"));
			Thread.sleep(5000);

			userName.sendKeys("sonu_12@ymail.com");
		}
	}


