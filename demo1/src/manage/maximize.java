package manage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class maximize {


		public static void main(String[] args) {
			// TODO Auto-generated method stub

			WebDriver driver = new EdgeDriver();
			driver.get("https://www.facebook.com");
	        driver.manage().window().maximize();
			
	}

}
