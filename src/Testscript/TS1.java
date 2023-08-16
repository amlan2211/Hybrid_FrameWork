package Testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TS1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@class='ytd-searchbox'")).sendKeys("kgf");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		

	}

}
