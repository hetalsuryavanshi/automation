package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver =new EdgeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
     driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
     driver.switchTo().frame(0);
     driver.findElement(By.linkText("org.openqa.selenium")).click();
     
		
		
	}

}
