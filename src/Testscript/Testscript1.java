package Testscript;

import org.openqa.selenium.chrome.ChromeDriver;

public class Testscript1 
{

	public static void main(String[] args) 
	{
	 String key="webdriver.chrome.driver";
	 String value="./software/chromedriver.exe";
	 System.setProperty(key, value);
	 ChromeDriver ch=new ChromeDriver();

	}

}
