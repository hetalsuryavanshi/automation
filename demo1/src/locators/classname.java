package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class classname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
	
		driver.findElement(By.className("nav-progressive-attribute"));
		System.out.println("element identified");
	}

}
