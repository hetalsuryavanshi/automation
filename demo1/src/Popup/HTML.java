package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HTML {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com");
		//driver.findElement(By.id("datepicker1")).click();
		Thread.sleep(5000);
		//driver.findElement(By.linkText("5")).click();
	
		driver.findElement(By.xpath("//button[text()='✕']]")).click();
		
		
		

	}

}
