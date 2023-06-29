package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Getpagesource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				
				WebDriver driver=new EdgeDriver();
				driver.get("https:/www.fb.com");
				String page=driver.getPageSource();
				System.out.println(page);

			
			
			
			}
			
		}


