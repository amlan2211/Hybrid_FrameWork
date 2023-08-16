package Testscript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testscript3 {

	public static void main(String[] args) 
	{
		String key="webdriver.gecko.driver";
		 String value="./software/geckodriver.exe";
		 System.setProperty(key, value);
		 FirefoxDriver ch=new FirefoxDriver();
		 String keey="webdriver.chrome.driver";
		 String valuee="./software/chromedriver.exe";
		 System.setProperty(keey, valuee);
		 ChromeDriver chh=new ChromeDriver();

	}

}
