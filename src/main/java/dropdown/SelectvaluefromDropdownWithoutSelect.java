package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectvaluefromDropdownWithoutSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		Thread.sleep(4000);
		/*WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
*/
		List<WebElement> daysvalue=driver.findElements(By.xpath("//select[@id='day']/option"));
		System.out.println(daysvalue.size());
		for(int i=0;i<daysvalue.size();i++) {
			String date=daysvalue.get(i).getText();
			System.out.println(date);
			
			//now we have to select value 
			if(date.equals("28")) {
				daysvalue.get(i).click();
				break;
			}
		}
		
		
	}

}
