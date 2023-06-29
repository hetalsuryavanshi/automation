package TestNG;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviders {

	@DataProvider
	
		Object[] data() {
		Object[] s = {"hetal","b",1,true,5};
		return s;
	}
	
	@Test(dataProvider = "data")
	void register( Object s) {
		Reporter.log(s+" registered",true);
		
	}
	


	}


