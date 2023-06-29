package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class VerifyUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver Driver=new EdgeDriver();
		Driver.get("https//ww.fb.com");
		
       String actualurl= Driver.getCurrentUrl();
       String expectedurl= "https://www.facebook.com";
  
       
       if(actualurl.equals(expectedurl))
    	   
    	  System.out.println("page dispalyed") ;
       
       else
    	   
    	   System.out.println("page not displayed");
	
	
	}
	
	

}
