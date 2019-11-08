package Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Util {

	WebDriver driver;

	public Util(WebDriver driver) {
		this.driver = driver;

	}

	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);

		} catch (Exception e) {

			System.out.println("Exception occured in get element");

		}
		return element;
	}

	public void doClick(By locator) {
		try {
			getElement(locator).click();
		} catch (Exception e) {

			System.out.println("Exeption in doclick");

		}
	}
	
	public void doSendKeys(By locator,String value) {
		try{
			getElement(locator).sendKeys(value);
		}
		catch(Exception e) {
			System.out.println("error in dosendkey");
		}
	}

}
