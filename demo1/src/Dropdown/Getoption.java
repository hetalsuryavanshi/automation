 package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Getoption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/gsuku/OneDrive/Desktop/dropdown.html");
		//WebElement city = driver.findElement(By.id("beverage"));
		WebElement city = driver.findElement(By.id("city"));
		
		
		Select select = new Select(city);
		System.out.println(select.getWrappedElement().getText());
		
	//List<WebElement> allselectedoptions =select.getOptions();
		//for (WebElement option:alloptions)
		//System.out.println(option.getText());
		
		
		//List<WebElement> allselectedoptions =select.getAllSelectedOptions();
			//for (WebElement option:allselectedoptions)
			//System.out.println(option.getText());
			
		

		select.selectByIndex(3);
		select.selectByIndex(1);
		WebElement option = select.getFirstSelectedOption();
		System.out.println(option.getText());
		

	}

}
