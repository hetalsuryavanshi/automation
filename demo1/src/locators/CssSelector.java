package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // SetProperty("Webdriver.edge.driver","./msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		driver.findElement(By.cssSelector("input[type=\"hidden\")[name='jazoest']"));
		System.out.print("element identified");
		
	}

}
