package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements_attributesUse {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		// Now we find all available images and print its source by attribute
		
		List<WebElement> imagelist=driver.findElements(By.tagName("img"));
		System.out.println(imagelist.size());
		for(int i=0;i<imagelist.size();i++) {
			String imagesrc=imagelist.get(i).getAttribute("src");
			System.out.println(imagesrc);
		}
	}

}
