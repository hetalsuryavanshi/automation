package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Clear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.fb.com");
        
        WebElement username = driver.findElement(By.id("email"));
        username.clear();
		username.sendKeys("hello and welcome");
		username.clear();
		username.sendKeys("selenium");
	}

}
