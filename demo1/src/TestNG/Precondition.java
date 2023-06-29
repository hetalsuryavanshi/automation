package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Precondition {

	
	@BeforeMethod
	void OpenBrowser()
	{
		Reporter.log("open Browser,true");
	}
	
	@Test(priority=2)
	void edit()
	{
		Reporter.log("user edited",true);
	}
	
	
	@Test(priority=1)
	void register()
	{
		Reporter.log("user register",true);
	}
	
	@AfterMethod
	void closeBrowser()
	{
		Reporter.log("close Browser,true");
	}
	
	

	}

