package PoPup;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScript5 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
	    driver.get("https://www.redbus.com");
	    Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='date-box']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[.='12']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='r-date']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[.='17']")).click();
        
        
		

	}

}
