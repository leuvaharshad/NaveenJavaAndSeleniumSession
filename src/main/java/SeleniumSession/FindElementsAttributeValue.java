package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsAttributeValue {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		// Here we are going to enter value in Username field and getting that value and print it
		driver.findElement(By.id("login1")).sendKeys("Harshad1234");// entered value in username
		//now we get that field value i.e "
		String usernamevalue=driver.findElement(By.id("login1")).getAttribute("value");
		System.out.println(usernamevalue);
	}

}
