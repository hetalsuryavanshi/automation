package webdriver;

import org.openqa.selenium.By;

public class xpath_contains_text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			

					org.openqa.selenium.WebDriver driver = new org.openqa.selenium.edge.EdgeDriver();
					driver.get("https://www.fb.com/");
					driver.findElement(By.xpath("//a[contains(text(),'Forgot')]"));
					System.out.println("element identified");
				}

		
	}


