package webdriver2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GetText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		WebElement loginBTN = driver.findElement(By.name("login"));
		String value = loginBTN.getText();
		System.out.println(value);
		
	}

}
