package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorBasic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\Udemy Course\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");	
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//1. By ID
		//First way to write it
		/*WebElement email=driver.findElement(By.id("username"));
		email.sendKeys("User123@abc.com");
		
		WebElement pwd=driver.findElement(By.id("password"));
		pwd.sendKeys("Password1");*/
		
		//second way to write
		/*driver.findElement(By.id("username")).sendKeys("User123@abc.com");
		driver.findElement(By.id("password")).sendKeys("Password1");
		driver.findElement(By.id("loginBtn")).click();*/
		
		
		//2. By name--- need to copy and paste name attribute value
		
		
		//3.By Xpath
		/*driver.findElement(By.xpath("//input[@type='email']")).sendKeys("12345@abc.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password");*/
		
		// 4. By Css Locator
		
		/*driver.findElement(By.cssSelector("[type='email']")).sendKeys("Csslocator@abc.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Password");*/
		
		
		//5.By linktext ---it is used for link  ,we have to enter whole text of that field
		
		//driver.findElement(By.linkText("Sign up")).click();
		
		// 6.By Partiallinked text--- 
		//driver.findElement(By.partialLinkText("Sign")).click();
		
		//7. By.className(className)
		/* Here class name for email field is "form-control private-form__control login-email"
		but as space not allowed , there are 3 class sepereated by Comma, need to seelect unique one*/
		
		driver.findElement(By.className("login-email")).sendKeys("classname@abc.com");
		
		
		
		
		
		
		
		
		
	}

}
