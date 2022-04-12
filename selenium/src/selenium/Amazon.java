package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\EZHIL\\eclipse-workspace\\selenium\\lib\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();

		//google search
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("amazon.in"+Keys.ENTER);
		
		
		//WebElement enter = driver.findElement(By.xpath("//input[@aria-label='Google Search']/following::input[2]"));
		//enter.click();

		WebElement search1 = driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']"));
		search1.click();
		System.out.println("1");

		//amazon wait to go sign in

		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//a[@data-nav-ref='nav_custrec_signin']/child::span"))));
		WebElement ask = driver.findElement(By.xpath("//a[@data-nav-ref='nav_custrec_signin']/child::span"));
		ask.click();
		System.out.println("2");

		//login id

		WebElement table = driver.findElement( By.xpath("//input[@tabindex='1']"));
		table.sendKeys("8300102308");

		WebElement submit = driver.findElement( By.xpath("//input[@type='submit']"));
		submit.click();

		//password

		WebElement table2 = driver.findElement( By.xpath("//input[@type='password']"));
		table2.sendKeys("Agi1997@");

		WebElement submit2 = driver.findElement( By.xpath("//input[@id='signInSubmit']"));
		submit2.click();

		//search box

		WebElement tabindex = driver.findElement( By.xpath("//select[@tabindex='0']"));
		tabindex.click();

		WebElement multiplebox = driver.findElement( By.xpath("//option[@value='search-alias=electronics']"));
		multiplebox.click();
		System.out.println("3");

		//search product
		WebElement typebox = driver.findElement(By.xpath("//input[@type='text']"));
		typebox.sendKeys("smart watch for men");

		WebElement search = driver.findElement(By.xpath("//input[@value='Go']"));
		search.click();

		WebElement day = driver.findElement(By.xpath("//input[@type='checkbox']/following::i[2]"));
		day.click();
		System.out.println("4");

		WebElement brand = driver.findElement(By.xpath("//input[@type='checkbox']/following::i[1]"));
		brand.click();
		System.out.println("5");

		WebElement brand2 = driver.findElement(null);
		brand2.click();
		System.out.println("6");

		
		


	}


}
