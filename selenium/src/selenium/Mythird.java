package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mythird {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\EZHIL\\eclipse-workspace\\selenium\\lib\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.manage().window().maximize();

		WebElement id = driver.findElement(By.id("email"));
		id.sendKeys("ezhilvelfire@gmail.com");
		
		WebElement append = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		append.sendKeys("ezhil");

		WebElement gettextbox = driver.findElement(By.name("username"));
		String value = gettextbox.getAttribute("value");
		System.out.println(value);

		WebElement clearbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		clearbox.clear();

		WebElement disable = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		boolean enabled = disable.isEnabled();
		System.out.println(enabled);

		
	}

}
