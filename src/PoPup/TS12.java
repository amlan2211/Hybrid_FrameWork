package PoPup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TS12 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		
		driver.get("file:///C:/Users/91784/Desktop/temp3.html");
		Thread.sleep(2000);
		WebElement ele =driver.findElement(By.xpath("//select"));
		Select s= new Select(ele);
		List<WebElement> opt=s.getOptions();
		int size=opt.size();
		for(int i=0;i<size;i++)
		{
			s.selectByIndex(i);
			Thread.sleep(2000);
		}
		for(int i=0;i<size;i++)
		{
		String text=s.getOptions().get(i).getText();
		System.out.println(text);
		}
		
		


	}

}
