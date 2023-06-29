package manage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Getsize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver = new EdgeDriver();
	driver.get("https://www.fb.com");
	Dimension size = driver.manage().window().getSize();
	System.out.println(size);
	
	
	}
	
	
	

}
