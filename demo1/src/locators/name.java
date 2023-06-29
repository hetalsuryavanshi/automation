package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new EdgeDriver();
		driver.get("https://amazon.in");
	
		driver.findElement(By.name("field-keywords"));
		System.out.println("element identified");
		
	}
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
}
