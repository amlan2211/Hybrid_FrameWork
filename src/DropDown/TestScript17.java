package DropDown;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestScript17 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("http://www.uitestpractice.com/Students/Actions");
		WebElement ele=driver.findElement(By.xpath("//button[.='Double Click Me !']"));
		Actions a= new Actions(driver);
		a.doubleClick(ele).perform();
		
	

	}

}
