package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PrintMessage {

	@Test
	
	void m1()
	
	{
		//print a message only in console
		System.out.println("hello world");
		
		//print a message only in report
				Reporter.log("hello world");
				
				//print a message only in console and report
				System.out.println("hello world");
		Reporter.log("hello world",true);
		
	}

}
