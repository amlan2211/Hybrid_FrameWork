package PoPup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScript6 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
	    driver.get("file:///C:/Users/91784/Desktop/file.html");
	    Thread.sleep(2000);
	    WebElement ele =driver.findElement(By.xpath("//input[@id='upload']"));
	    Thread.sleep(2000);
	    ele.sendKeys("C:\\Users\\91784\\Downloads\\null.pdf\\");
	    
	    
	    

	}

}
