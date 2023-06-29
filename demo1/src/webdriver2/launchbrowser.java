package webdriver2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class launchbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new EdgeDriver();
		driver.get("https:/www.fb.com");
		String title=driver.getTitle();
		System.out.print(title);

	}

}
