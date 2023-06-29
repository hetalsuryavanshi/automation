package webdriver2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GetCssValue {

   public static void main(String[] args) {
			// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement element = driver.findElement(By.linkText("Sign in securely"));
		String value = element.getCssValue("font-size");
		System.out.println(value);
		
		
		}
	}


