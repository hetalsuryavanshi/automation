package manage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.tagName("input"));
        System.out.print("element identified");
	}

}
