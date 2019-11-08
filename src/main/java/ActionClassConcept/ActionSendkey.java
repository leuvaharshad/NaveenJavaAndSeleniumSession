package ActionClassConcept;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionSendkey {

	public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://www.rediff.com/");
			Thread.sleep(4000);
			
		//WebElement 	Servicenu=	driver.findElement(By.xpath("//*[@id=\"CrCustmast_custno\"]"));
		//WebElement viewbtn=driver.findElement(By.xpath("//input[@type='submit']"));
		
			
			WebElement search=driver.findElement(By.id("srchword"));
		Actions action = new Actions(driver);
		action.sendKeys(search, "testwer").build().perform();
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("./target/screenshots/12.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		
	}

}
