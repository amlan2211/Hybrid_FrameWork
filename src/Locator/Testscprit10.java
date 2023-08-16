package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testscprit10 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("https://demoqa.com/text-box");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("amlan mishra");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("amlankmishra06@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("yewantpur bengaluru");
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("bhubaneswar ");
		driver.findElement(By.xpath("//button[@id='permanentAddress']")).sendKeys("bhubaneswar ");

		

	}

}
