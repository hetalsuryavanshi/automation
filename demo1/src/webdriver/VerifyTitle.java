package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class VerifyTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		String actualTitle = driver.getTitle();
		String expectedTitle = "login facebook";
		
		if(actualTitle.equals(expectedTitle))
			
			System.out.println("page displayed");
		
		else
			
			System.out.println("page not displayed");

	}

}
