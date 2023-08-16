package DropDown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScript11 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//select[@id='month']"));
	     
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
