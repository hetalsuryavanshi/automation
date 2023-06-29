package Dropdown;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver; 
import org.openqa.selenium.interactions.Actions;

public class keysupkeysdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com/key_presses");
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		
		
	}

}
