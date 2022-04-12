package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Myfourth {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\EZHIL\\eclipse-workspace\\selenium\\lib\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		//driver.manage().window().maximize();
		
		//1. get position
		WebElement getposition = driver.findElement(By.id("position"));
		Point xypoint = getposition.getLocation();
		int xvalue= xypoint.getX();
		int yvalue= xypoint.getY();
		System.out.println("X value is:"+ xvalue + "Yvalue is:"+ yvalue );
		
		//2. color
		
		WebElement colorbt = driver.findElement(By.id("color"));
		String color = colorbt.getCssValue("background-color");
		System.out.println("button color is:"+ color);
		
		//3. size
		
		WebElement sizebt = driver.findElement(By.id("size"));
		int height = sizebt.getSize().getHeight();
		int width = sizebt.getSize().getWidth();
		System.out.println("height is:"+height+"width is :"+ width);
		
		// 4. home
		//Thread.sleep(3000);
		
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(By.id("home")));
		WebElement homepage = driver.findElement(By.id("home")); 
		System.out.println("home is clicked");
		homepage.click();
			System.out.println("action completed");
	}
	

}
