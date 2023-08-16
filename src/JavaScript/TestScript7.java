package JavaScript;

import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScript7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
	    JavascriptExecutor jse=(JavascriptExecutor) driver;
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox'")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox'").sendKeys("kgf");
	    
	    

	}

}
