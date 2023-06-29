package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class id {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub	

		WebDriver driver = new EdgeDriver();
		driver.get("https://wwww.amazon.in/");
		driver.findElement(By.id("twosearchtextbox"));
		System.out.println("element identified");
		
	}

}
