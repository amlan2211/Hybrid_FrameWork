package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_Class implements Framework_constant
{

	public static void main(String[] args) 
	{
		public WebDriver driver;
		@Before 
		public void openapp()
		{
			
			System.setProperty(gecko_key,gecko_value);
			driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get(URL);
		}
		@AfterMethod
		public void closeApp()
		{
			driver.close();
		}
	}

}
