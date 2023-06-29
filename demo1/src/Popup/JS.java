package Popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JS {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
   // driver.findElement(By.xpath("// button [text() = 'click for JS alert']"));
	//driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	//Thread.sleep(3000);
	//driver.switchTo().alert().accept();
	
	driver.findElement(By.xpath("// button [text() = 'click for JS Prompt']"));
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	Thread.sleep(3000);
	Alert alert = driver.switchTo().alert();
	alert.sendKeys("hello");
	System.out.println(alert.getText());
	driver.switchTo().alert().accept();
	

	
	}

}
