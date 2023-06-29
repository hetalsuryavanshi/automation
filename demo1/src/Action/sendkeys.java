package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class sendkeys {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable");
	//	driver.get("https://www.fb.com");
		Actions act = new Actions(driver);
		driver.switchTo().frame(0);
	//	WebElement password = driver.findElement(By.id("pass"));
	//	act.contextClick(password).perform();
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		act.dragAndDrop(drag, drop).perform();
		  
	}



  
	}


