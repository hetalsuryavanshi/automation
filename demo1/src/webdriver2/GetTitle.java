package webdriver2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriver driver = new EdgeDriver();
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
