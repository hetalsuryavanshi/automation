package webdriver2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GetTagname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		WebElement username = driver.findElement(By.name("login"));
		String value = username.getTagName();
		System.out.println(value);
		
	}

}
