package DropDown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScript12 {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("amlan ");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("mishra");
		driver.findElement(By.xpath("//input["))
		
		WebElement ele=driver.findElement(By.xpath("//select[@id='month']"));
		
		WebElement ele2=driver.findElement(By.xpath("//select[@title='Day']"));

        Select s1=new Select(ele2);
        
        s1.selectByVisibleText("25");
        s1.deselectAll();
        
		
	     
		Select s=new Select(ele);
		List<WebElement> allopt=s.getOptions();
		ArrayList<String> l = new ArrayList<String>();
		
		for(WebElement opt:allopt)
		{
			String text=opt.getText();
			l.add(text);
		}
		Collections.sort(l);
		for(String o:l)
		{
			System.out.println(o);
		}
		
		
		
		

	}

}
