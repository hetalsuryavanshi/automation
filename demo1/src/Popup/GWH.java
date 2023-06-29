package Popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class GWH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     WebDriver driver = new EdgeDriver();
     driver.get("https://www.amazon.in/s?k=clothes&crid=S9PKFLRRON2C&sprefix=cloth%2Caps%2C197&ref=nb_sb_ss_ts-doa-p_5_5@");
     driver.findElement(By.xpath("//img[@src=\"https://m.media-amazon.com/images/I/81j0VVogWZL._AC_UL320_.jpg\"]")).click();
     Set<String> allTabs = driver.getWindowHandles();
     for(String tab:allTabs)
    	 driver.switchTo().window(tab);
    driver.close();

}
}