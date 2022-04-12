package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class My5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\EZHIL\\eclipse-workspace\\selenium\\lib\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		// 1,index
		
		WebElement index = driver.findElement(By.id("dropdown1"));
		Select select0= new Select(index);//----------select option use panuranalla this object is created
		select0.selectByIndex(2);
		
		//2,text
		
		WebElement text = driver.findElement(By.name("dropdown2"));
		//Thread.sleep(3000);
		 Select select1= new Select(text);
		 select1.selectByVisibleText("UFT/QTP");
		 
		 //3,value
		 
		 WebElement value = driver.findElement(By.id("dropdown3"));
		// Thread.sleep(3000);
		 Select select2 = new Select(value);
		 select2.selectByValue("4");
		 
		 //4,options
		  WebElement options = driver.findElement(By.className("dropdown"));
		  Select select3 = new Select(options);
		  List<WebElement> option = select3.getOptions();
		  int size = option.size();
		  System.out.println("number of element:"+size);
		  
		  //5,send
		  
		  WebElement sendkey =driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
		  sendkey.sendKeys("Loadrunner");
		  
		  //6,programs
		  
		  WebElement multipleselect = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
			Select multiplebox =new Select(multipleselect);
			multiplebox.selectByIndex(1);
			multiplebox.selectByIndex(2);
			multiplebox.selectByIndex(3);
	}

}
