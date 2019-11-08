package dropdown;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropdownutils {

	public static void selectValueFromDropdownbyIndex(WebElement element, int value) {
		Select s = new Select(element);
		s.selectByIndex(value);

	}

	public static void selectValueFromDropdownbyText(WebElement element, String txt) {
		Select s = new Select(element);
		s.selectByVisibleText(txt);

	}

	public static ArrayList<String> getallvalues(WebElement element) {
		System.out.println("=======================================");
		Select s = new Select(element);

		List<WebElement> allvaluesofPicklist = s.getOptions();
		ArrayList<String> ar = new ArrayList<String>();

		System.out.println(allvaluesofPicklist.size());
		for (int i = 0; i < allvaluesofPicklist.size(); i++) {
			String text = allvaluesofPicklist.get(i).getText();

			ar.add(text);
		}
		return ar;

	}

	/**
	 * This method is used to get value without select
	 * @param driver
	 * @param locator
	 * @param value
	 */
	public static void selectDropdownvaluesWithoutSelect(WebDriver driver, String locator, String value) {
		List<WebElement> dropdownvalue = driver.findElements(By.xpath(locator));
		System.out.println(dropdownvalue.size());
		for (int i = 0; i < dropdownvalue.size(); i++) {
			String date = dropdownvalue.get(i).getText();
			System.out.println(date);

			// now we have to select value
			if (date.equals(value)) {
				dropdownvalue.get(i).click();
				break;
			}
		}

	}
}
