package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getAllDropdownvalues {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		// getAllDropdownvalues s1= new getAllDropdownvalues();
		getallvalues(month);
		getallvalues(year);
		getallvalues(day);
	}

	/**
	 * This method is used to get all values from drop down
	 * 
	 * @param element
	 */
	public static void getallvalues(WebElement element) {
		System.out.println("=======================================");
		Select s = new Select(element);

		List<WebElement> allvaluesofPicklist = s.getOptions();

		System.out.println(allvaluesofPicklist.size());
		for (int i = 0; i < allvaluesofPicklist.size(); i++) {
			System.out.println(allvaluesofPicklist.get(i).getText());
		}

	}

}
