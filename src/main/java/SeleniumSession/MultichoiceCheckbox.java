package SeleniumSession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultichoiceCheckbox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();

		/*
		 * multichoiceselection(driver, "choice 2 1"); multichoiceselection(driver,
		 * "choice 2 3"); multichoiceselection(driver, "choice 3");
		 */
		// multichoiceselection(driver, "choice 2 1","choice 2 2","choice 4");
		multichoiceselection(driver, "All");

	}

	public static void multichoiceselection(WebDriver driver, String... value) {// here ...represent array
		List<WebElement> options = driver.findElements(By.xpath("//ul//li[@class='ComboTreeItemChlid']"));

		if (!value[0].equalsIgnoreCase("All")) {
			for (int i = 0; i < options.size(); i++) {
				System.out.println(options.get(i).getText());
				String optionvalue = options.get(i).getText();

				for (int j = 0; j < value.length; j++) {
					if (optionvalue.equals(value[j])) {
						options.get(i).click();
						break;
					}

				}

			}
		} else {
			try {
				for (int all = 0; all < options.size(); all++) {
					options.get(all).click();

				}
			} catch (Exception e) {

			}
		}
	}

}
