package ActionClassConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MovetoLink {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.spicejet.com");
		Actions action= new Actions(driver);
		
		WebElement loginsignup=driver.findElement(By.id("ctl00_HyperLinkLogin"));
		action.moveToElement(loginsignup).build().perform();
		WebElement spicemember =driver.findElement(By.xpath("//*[@id=\"smoothmenu1\"]/ul/li[14]/ul/li[2]/a/text()"));
		action.moveToElement(spicemember).build().perform();
	}

}
