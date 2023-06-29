package Closeandquit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class close4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.fb.com");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.close();

	}

}
