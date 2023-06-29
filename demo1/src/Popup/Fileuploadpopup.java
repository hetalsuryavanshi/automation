package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Fileuploadpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.guru99.com/test/upload/");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\gsuku\\OneDrive\\Desktop\\HTML.txt2.txt");
		
	}

}
