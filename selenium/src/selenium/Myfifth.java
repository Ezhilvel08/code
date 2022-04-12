package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Myfifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\EZHIL\\eclipse-workspace\\selenium\\lib\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		WebElement multipleselect = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select multiplebox =new Select(multipleselect);
		multiplebox.selectByIndex(1);
		multiplebox.selectByIndex(2);
		multiplebox.selectByIndex(3);
	}

}
