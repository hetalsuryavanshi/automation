package mypack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		Loginpage lp = new Loginpage(driver);
		lp.getUsername().sendKeys("jhjssl");
		lp.getpassword().sendKeys("sdgdhg");
		lp.getloginBTN().click();
		Thread.sleep(3000);
		lp.getUsername().sendKeys("admin");
		lp.getpassword().sendKeys("manager");
		lp.getloginBTN().click();

		
		
	}

}
