package Screenshot;

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

public class WebPageScreenShot {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://login.yahoo.com/");
		WebPageScreenShot ws = new WebPageScreenShot();
		ws.ScreenshotofWebpage(driver, "defaultpage");

		WebElement email = driver.findElement(By.id("login-username"));
		
		Actions action =new Actions(driver);
		action.sendKeys(email, "test@123.com").build().perform();
		
		ws.ScreenshotofWebElement(email, "emailfield");
		ws.ScreenshotofWebpage(driver, "after Webelement captured");
		
		Thread.sleep(4000);
		
		driver.quit();

	}

	/**
	 * This method is used to take screenshot of webpage
	 * 
	 * @param driver
	 * @param imagename
	 */
	public void ScreenshotofWebpage(WebDriver driver, String imagename) {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("./target/Screenshots/" + imagename + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	/**
	 * Taking screenshot of webelement is supported only in Selenium 4, This method capture screenshot of specific element
	 * @param element
	 * @param imagename
	 */
	public void ScreenshotofWebElement(WebElement element, String imagename) {

		File src = ((TakesScreenshot) element).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("./target/Screenshots/" + imagename + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
