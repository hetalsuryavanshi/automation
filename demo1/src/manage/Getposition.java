package manage;

import java.awt.Point;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Getposition {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.fb.com");
		org.openqa.selenium.Point position = driver.manage().window().getPosition();
		System.out.println(position);
	}

}
