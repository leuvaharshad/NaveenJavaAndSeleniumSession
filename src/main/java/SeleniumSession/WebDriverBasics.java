package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "H:\\Udemy Course\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		String title=driver.getTitle();
		if(title.equals("Google")) {
			System.out.println("title---matches");
		}
		else {
			System.out.println("title --mismatch");
		}
		
		driver.quit();

	}

}
