package webdriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigate {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

	 WebDriver driver = new EdgeDriver();
	 driver.navigate().to("https://www.fb.com");
	
	 URL url=new URL("https://www.fb.com");
	 driver.navigate().to(url);
	 driver.get("https://www.fb.com");
	 driver.get("https://www.amazon.in");


	 driver.navigate().back();
	 driver.navigate().forward();
	 driver.navigate().refresh();
	
	}
}	

	
	


