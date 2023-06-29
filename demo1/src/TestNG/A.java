package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A {

	@Test(priority= 1)
	
	void register() {
		
		Reporter.log("registered",true);
	}
	
	@Test(priority= 2)
	

	void login() {
		
		Reporter.log("login",true);
	}
	
@Test(priority= 3)
	

	void del() {
		
		Reporter.log("delete",true);
	}
	

@Test(priority= 4)


void edit() {
	
	Reporter.log("edit",true);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
