package Array.Arraycommand;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");

		// amazon wait to go sign in

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions
				.elementToBeClickable((By.xpath("//a[@data-nav-ref='nav_custrec_signin']/child::span"))));
		WebElement ask = driver.findElement(By.xpath("//a[@data-nav-ref='nav_custrec_signin']/child::span"));
		ask.click();

		try {
			WebElement table = driver.findElement(By.xpath("//input[@tabindex='1']"));
			table.sendKeys("8300102308");

			WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
			submit.click();

			WebElement table2 = driver.findElement(By.xpath("//input[@type='password']"));
			table2.sendKeys("Agi1997@");

			WebElement submit2 = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
			submit2.click();
		} catch (Exception e) {
			System.out.println("submit");
		}

		// search box

		WebElement tabindex = driver.findElement(By.xpath("//select[@tabindex='0']"));
		tabindex.click();

		WebElement typebox = driver.findElement(By.xpath("//input[@type='text']"));
		typebox.sendKeys("iphone 13");

		WebElement search = driver.findElement(By.xpath("//input[@value='Go']"));
		search.click();

		List<WebElement> productlist = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for (WebElement listofproduct : productlist) {
			System.out.println(listofproduct.getText());
		}
		
		driver.quit();
	}

}
