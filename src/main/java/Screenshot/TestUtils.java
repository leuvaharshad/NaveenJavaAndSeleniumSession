package Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestUtils {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com");
		
		Thread.sleep(4000);
		Util ut= new Util(driver);
		//By signbtn=By.id("login-signin");
		By signbtn=By.xpath("//input[@id='login-signin']");
		By username=By.id("login-username");
		ut.getElement(signbtn);
//		ut.doClick(signbtn);
		ut.doSendKeys(username, "test 123");
	}

}
