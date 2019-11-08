package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		List<WebElement> list=driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			String txt=list.get(i).getText();
			//System.out.println(list.get(i).getText());
			
			// Now we are going to skip blank link and print only  those link having value
			if(txt.equals("")) {
				
			}
			else {
				System.out.println(list.get(i).getText());
			}
		}
		
	}

}
