package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class IW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		for(int i=0;i<100;i++) {
			try {
				driver.findElement(By.name("username")).sendKeys("hello and welcome");
				System.out.println(i);
				break;
			}
		catch(Exception e) {
		}
		

	}
	}
}
