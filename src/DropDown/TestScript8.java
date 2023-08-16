package DropDown;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScript8 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/91784/Desktop/Demo11.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//select[@value='hotel']"));
	     
		Select s=new Select(ele);
		List<WebElement> allopt=s.getOptions();
		TreeSet<String> t= new TreeSet<String>(Collections.reverseOrder());
		
		
		
		for(WebElement opt:allopt)
		{
			String text=opt.getText();
			t.add(text);
		}
	
		for(String o:t)
		{
			System.out.println(o);
		}

		

	}

}
