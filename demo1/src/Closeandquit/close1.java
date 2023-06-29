package Closeandquit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class close1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.fb.com");
		driver.close();

	
	}
	
	
	
	
	

}
