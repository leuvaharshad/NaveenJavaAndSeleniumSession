package dropdown;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testingdropdownutils {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
	
		
		
		// here we call methds define in utils class and pass parameter
		//for given date we ,split it and store in array and pass value as parameter
		String date="24/May/1987";
		String[] dates=date.split("/");
		
		dropdownutils.selectValueFromDropdownbyText(day,dates[0]);
		dropdownutils.selectValueFromDropdownbyText(month,dates[1]);
		dropdownutils.selectValueFromDropdownbyText(year,dates[2]);
		
		//Here we get all dropdown value in arrayliist and print it
		
		
		ArrayList<String> daylist =dropdownutils.getallvalues(day);
		System.out.println(daylist);
		
		ArrayList<String> mnthlist=dropdownutils.getallvalues(month);
		System.out.println(mnthlist);
		
		ArrayList<String> yearlist=dropdownutils.getallvalues(year);
		System.out.println(yearlist);
		
		String locator ="//select[@id='day']/option";
		dropdownutils.selectDropdownvaluesWithoutSelect(driver, locator, "5");
		
	}

}
