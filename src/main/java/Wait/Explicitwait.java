package Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicitwait {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://app.hubspot.com/login");

		WebDriverWait wait =new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains("HubSpot"));
		
		By email=By.id("username");
		
		//WebElement email=driver.findElement(By.id("username"));
		
		//WebDriverWait wait =new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(email));
		driver.findElement(email).sendKeys("1234@rwr.com");
	}

}
