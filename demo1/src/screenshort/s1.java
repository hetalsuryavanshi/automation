package screenshort;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class s1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		Random r = new Random();
		int randomNumber = r.nextInt();
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		
		WebElement username = driver.findElement(By.id("passContainer"));
		File source = username.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshot"+randomNumber+".png");
        FileHandler.copy(source, destination);		
	}

		
		
		
	}


