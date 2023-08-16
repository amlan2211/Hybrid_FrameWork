package Testscript;


import org.openqa.selenium.firefox.FirefoxDriver;

public class Testscript2 {

	public static void main(String[] args)
	{
		String key="webdriver.gecko.driver";
		 String value="./software/geckodriver.exe";
		 System.setProperty(key, value);
		 FirefoxDriver ch=new FirefoxDriver();

	}

}
