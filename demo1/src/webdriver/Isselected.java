package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Isselected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/login-to-product");
		WebElement checkbox = driver.findElement(By.id("keep logged"));
		System.out.print(checkbox.isSelected());
		checkbox.click();
		System.out.println(checkbox.isSelected());
	}

}
