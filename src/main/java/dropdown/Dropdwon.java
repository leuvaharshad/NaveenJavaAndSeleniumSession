package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdwon {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		Thread.sleep(4000);
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		Select s= new Select(day);
		//s.selectByValue(value);
		
		
		
		/*selectValueFromDropdownbyIndex(day, 24);
		selectValueFromDropdownbyIndex(month, 5);
		selectValueFromDropdownbyIndex(year, 9);*/
	}

	public static void selectValueFromDropdownbyIndex(WebElement element, int value) {
		Select s = new Select(element);
		s.selectByIndex(value);

	}
	
	public static void selectValueFromDropdownbyText(WebElement element, String txt) {
		Select s = new Select(element);
		s.selectByVisibleText(txt);

	}


}
