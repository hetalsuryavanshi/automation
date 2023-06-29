package manage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Setsize {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.fb.com");
		
		Dimension d = new Dimension(1600,900);
		driver.manage().window().setSize(d);
		
		
	}

}
