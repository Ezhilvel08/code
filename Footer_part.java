package TRS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Footer_part {
	WebDriver driver = null;

	@BeforeTest
	void TRS_consultancy() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://trsskillfill.com/#");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test(priority=1)
	void Homepage() {

		driver.findElement(By.xpath("(//*[text()='TRS Consultancy'])[2]")).click();
		String urltitle1 = driver.getCurrentUrl();
		System.out.println("Title 1:" + urltitle1);
		System.out.println(driver.getTitle());
		JavascriptExecutor scrolldown = (JavascriptExecutor) driver;
		scrolldown.executeScript("window.scrollBy(0,6000)");


	}

	@Test(priority=2)
	void services() {

		driver.findElement(By.xpath("//*[text()='Business Consultancy']")).click();
		String urltitle2 = driver.getCurrentUrl();
		System.out.println("Title 2:" + urltitle2);

		driver.navigate().back();

		driver.findElement(By.xpath("//*[text()='Job Consulting']")).click();
		String urltitle3 = driver.getCurrentUrl();
		System.out.println("Title 3:" + urltitle3);

		driver.navigate().back();

		driver.findElement(By.xpath("//*[text()='IT Consulting']")).click();
		String urltitle4 = driver.getCurrentUrl();
		System.out.println("Title 4:" + urltitle4);

		driver.navigate().back();

	}
	@Test(priority=3)
	void aboutus() {
		driver.findElement(By.xpath("//*[text()='Overview']")).click();
		String urltitle5 = driver.getCurrentUrl();
		System.out.println("Title 5:" + urltitle5);

		driver.navigate().back();

		driver.findElement(By.xpath("//*[text()='Why us']")).click();
		String urltitle6 = driver.getCurrentUrl();
		System.out.println("Title 6:" + urltitle6);

		driver.navigate().back();

		driver.findElement(By.xpath("//*[text()='Portfolio']")).click();
		String urltitle7 = driver.getCurrentUrl();
		System.out.println("Title 7:" + urltitle7);

		driver.navigate().back();

	}

	@Test(priority=4)
	void uparrow() {
		driver.findElement(By.xpath("//*[@class='lni-chevron-up']")).click();
		String urltitle8 = driver.getCurrentUrl();
		System.out.println("Title 8:" + urltitle8);

	}

	@AfterTest
	void Quit() {
		driver.quit();
	}

}
