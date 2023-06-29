package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetcurrentURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		WebDriver driver=new EdgeDriver();
		driver.get("https:/www.fb.com");
		String url=driver.getCurrentUrl();
		System.out.println(url);

	
	
	
	}
	
	
	

}
