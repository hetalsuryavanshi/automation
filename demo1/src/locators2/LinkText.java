package locators2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.get("https://fb.com");
		driver.findElement(By.linkText("Forgot"));
		System.out.println("element identified");
		
		
		
	}

}
