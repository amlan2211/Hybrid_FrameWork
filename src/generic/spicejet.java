package generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class spicejet {

	public static  void main(String...args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("(//div[.='Round Trip'])[2]")).click();
		driver.findElement(By.xpath("//div[starts-with(@class,'css')]/div[.='From']")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Enter airport code/city\"]")).sendKeys("bangalore");
		driver.findElement(By.xpath("//div[.='BLR - Bengaluru, India']")).click();
		driver.findElement(By.xpath("(//div[starts-with(@class,'css')]/div[.='To'])[3]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter airport code/city']")).sendKeys("mumbai");
		driver.findElement(By.xpath("//div[.='BOM - Mumbai, India']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Departure Date')]")).click();
		driver.findElement(By.xpath("(//div[@dir='auto' and text()='August ']/ancestor::div[@class='css-1dbjc4n'])[2]/descendant::div[@data-testid=\"undefined-calendar-day-18\"]")).click();
		driver.findElement(By.xpath("(//div[.='Add Return Date'])[1]")).click();
		driver.findElement(By.xpath("(//div[@dir='auto' and text()='September ']/ancestor::div[@class='css-1dbjc4n'])[2]/descendant::div[@data-testid=\"undefined-calendar-day-18\"]")).click();
		driver.findElement(By.xpath("(//div[@class=\"css-1dbjc4n\"])[5]")).click();
		driver.findElement(By.xpath("(//div[.='2'])[1]")).click();
		driver.findElement(By.xpath("(//div[.='Done'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n'])[8]")).click();
		driver.findElement(By.xpath("(//div[@class=\"css-1dbjc4n\"])[6]/div")).click();
		driver.findElement(By.xpath("(//div[.='Done'])[1]")).click();
		driver.findElement(By.xpath("(//div[@data-focusable=\"true\"])[18]")).click();
	}

}
